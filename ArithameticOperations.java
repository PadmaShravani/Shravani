package org.persholas.reviewproject.week11;

import java.util.Scanner;

public class ArithameticOperations {
	private double num1, num2;
	private double add, sub, mul, div;
	
	public void input() {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter number1");
		num1=input.nextDouble();
		System.out.println("Enter number1");
		num2=input.nextDouble();
		while(num1<0 || num2<0) {
			System.out.println("Enter numbers Again");
			num1=input.nextDouble();
			num2=input.nextDouble();
		}
		input.close();
	
		
	}
	
	public double add() {
		add = num1 + num2;
		return add;
	}

	public double sub() {
		sub = num1 - num2;
		return sub;
	}

	public double mul() {
		mul = num1 * num2;
		return mul;
	}

	public void div() {
		if (num2 == 0) {
			System.out.println("division by 0 is not possible");
		} else {
			div = num1 / num2;
			System.out.println("division is "+div);
		}
		
	}
	
}