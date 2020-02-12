package org.persholas.reviewproject.week11;

import java.util.Scanner;

/*Enter two numbers
 * num<0 print thank you
 * else add,mul,div
 */
public class Review {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int add=0,sub=0,mul=0,div=0;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter number1");
		int num1=input.nextInt();
		System.out.println("Enter number1");
		int num2=input.nextInt();
		
		if(num1<0 || num2<0) {
			System.out.println("Thank you");
		}else {
			
				add=num1+num2;
				sub= num1-num2;
				mul=num1*num2;
				System.out.println("addition is "+add);
				System.out.println("Substraction is "+sub);
				System.out.println("Multiplication is "+mul);
			if(num2==0) {
				System.out.println("division by 0 is not possible");
			}else {
				div=num1/num2;
				System.out.println("Division is "+div);
			}
			
			
		
		}
			
		input.close();
	}

}
