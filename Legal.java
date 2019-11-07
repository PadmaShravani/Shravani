package com.perscholas;

import java.util.Scanner;

public class Legal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Hey, what's your name? ");
		String name=input.next();
		System.out.println("Ok, "+name+", how old are you? ");
		int age=input.nextInt();
		if(age<16) {
			System.out.println("You can't drive.");
		}else if(age<18) {
			System.out.println("You can't vote.");
		}else if(age<25) {
			System.out.println("You can't rent a car.");
		}else
		{
			System.out.println("You can do anything that's legal.");
		}
				
	}

}
