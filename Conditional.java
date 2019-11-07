package com.perscholas;

import java.util.Scanner;

public class Conditional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter How many people?");
		int people=input.nextInt();
		System.out.println("Enter How many cats?");
		int cats=input.nextInt();
		System.out.println("Enter How many dogs?");
		int dogs=input.nextInt();
		input.close();
		if(people<cats)
		{
			System.out.println("Too many cats! The world is doomed!");
		}else if(people>cats)
		{
			System.out.println("Too few cats! The world is saved for another day!");
		}
		if(people<dogs)
		{
			System.out.println("The world is drooled on!");
		}else if(people>dogs)
		{
			System.out.println("The world is dry!");
		}

	}
}
