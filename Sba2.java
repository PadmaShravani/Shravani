package sba;
import java.util.Scanner;

/**A word is said to be “abecedarian” if the letters in the word appear in alphabetical order.
 *  For example, the following are all 6-letter  English abecedarian words.
abdest, acknow, acorsy, adempt, adipsy, agnosy, befist, behint, beknow, bijoux,
 biopsy, cestuy, chintz, deflux, dehors, dehort, deinos, diluvy, dimpsy
Write a program for checking whether a given word (String) is abecedarian,
 assuming that the word contains only lower-case letters. Your process can be
  iterative or recursive. */
public class Sba2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter any word");
		String s=input.next();
		//String s="shravani";
		int i=0;
		System.out.println(s);
		for( i=0;i<s.length()-1;i++) {
		if(s.charAt(i)<=s.charAt(i+1)) {
			continue;
		}	else
			break;
		}
		if(i==s.length()-1) {
			System.out.println(" abecedarian");
		}else {
			System.out.println("not  “abecedarian”");
			
		}input.close();
	}

	}
