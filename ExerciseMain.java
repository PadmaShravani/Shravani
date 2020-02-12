package org.persholas.reviewproject.week11;

import java.util.Scanner;

/*input is string
 * syso----string
 * inputmethod
 * syso---enter
 */
public class ExerciseMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=input();
		System.out.println(str);
	}

	public static String input() {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter any thing");
		String s=in.nextLine();
		in.close();
		return s;
	}
}
