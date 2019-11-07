package com.perscholas;

import java.util.Scanner;

public class Week {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number bitween 1-7");
		int day=input.nextInt();
		switch(day) {
		case 1:
			System.out.println("Weekday 1 is Monday!");
		break;
		case 2:
			System.out.println("Weekday 2 is Tuesday!");
		break;
		case 3:
			System.out.println("Weekday 3 is Wednesday!");
		break;
		case 4:
			System.out.println("Weekday 4 is Thursday!");
		break;
		case 5:
			System.out.println("Weekday 5 is Friday!");
		break;
		case 6:
			System.out.println("Weekday 6 is Saturday!");
		break;
		case 7:
			System.out.println("Weekday 7 is Sunday!");
		break;
		
		
		}
		
	}

}
