package com.perscholas;

import java.util.Scanner;

public class SpaceWeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your current earth weight:  ");
		double weight=input.nextDouble();
		System.out.println("I have information for the following planets:\r\n" + 
				"1. Venus\r\n" + 
				"2. Mars\r\n" + 
				"3. Jupiter\r\n" + 
				"4. Saturn\r\n" + 
				"5. Uranus\r\n" + 
				"6. Neptune\r\n" + 
				"Which planet are you visiting? ");
		int num=input.nextInt();
		
		switch(num) {
		case 1:
			System.out.println("Your weight would be "+ weight*0.78 +" pounds on that planet.");
		break;
		case 2:
			System.out.println("Your weight would be "+ weight*0.39 +" pounds on that planet.");
		break;
		case 3:
			System.out.println("Your weight would be "+ weight*2.65 +" pounds on that planet.");
		break;
		case 4:
			System.out.println("Your weight would be "+ weight*1.17 +" pounds on that planet.");
		break;
		case 5:
			System.out.println("Your weight would be "+ weight*1.05 +" pounds on that planet.");
		break;
		case 6:
			System.out.println("Your weight would be "+ weight*1.23 +" pounds on that planet.");
		break;
	
		}	
	}

}
