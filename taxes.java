package com.perscholas;

import java.util.Scanner;

/**
 * TheUSfederalpersonalincometaxiscalculatedbasedonthefilingstatusandtaxableincome.
 * Therearefourfilingstatuses:singlefilers,marriedfilingjointly,marriedfilingseparately,andheadofhousehold.
 * Thetaxratesfor2009areshownbelow.
 * @author Student
 *
 */
public class taxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Filer Type");
		int x=input.nextInt();
		System.out.println("Enter Income");
		double AI=input.nextDouble();
		switch(x){
			case 1:
				System.out.println("computing tax for single filers ");
				
				if(AI>0 && AI<8350)
					System.out.println("Marginal Rate is 10%");
				else if(AI>8351 && AI<33950)
					System.out.println("Marginal Rate is 15%");
				else if(AI>33951 && AI<82250)
					System.out.println("Marginal Rate is 25%");
				else if(AI>82251 && AI<171550)
					System.out.println("Marginal Rate is 28%");
				else if(AI>171551 && AI<372950)
					System.out.println("Marginal Rate is 33%");
				else 
					System.out.println("Marginal Rate is 35%");
				
				
				break;
			case 2:
				System.out.println("computing tax for married filing jointly");
		
				if(AI>0 && AI<16700)
					System.out.println("Marginal Rate is 10%");
				else if(AI>16701 && AI<67900)
					System.out.println("Marginal Rate is 15%");
				else if(AI>67901 && AI<137050)
					System.out.println("Marginal Rate is 25%");
				else if(AI>137051 && AI<208850)
					System.out.println("Marginal Rate is 28%");
				else if(AI>208851 && AI<372950)
					System.out.println("Marginal Rate is 33%");
				else 
					System.out.println("Marginal Rate is 35%");
				
				
				break;
			case 3:
				System.out.println("computing tax for married filing seperatly");
				if(AI>0 && AI<8350)
					System.out.println("Marginal Rate is 10%");
				else if(AI>8351 && AI<33950)
					System.out.println("Marginal Rate is 15%");
				else if(AI>33951 && AI<68525)
					System.out.println("Marginal Rate is 25%");
				else if(AI>68526 && AI<104425)
					System.out.println("Marginal Rate is 28%");
				else if(AI>104426 && AI<186475)
					System.out.println("Marginal Rate is 33%");
				else 
					System.out.println("Marginal Rate is 35%");
				
					
				
				break;
			case 4:
				System.out.println("computing tax for head of household");
				if(AI>0 && AI<11950)
					System.out.println("Marginal Rate is 10%");
				else if(AI>11951 && AI<45500)
					System.out.println("Marginal Rate is 15%");
				else if(AI>45501 && AI<117450)
					System.out.println("Marginal Rate is 25%");
				else if(AI>117451 && AI<190200)
					System.out.println("Marginal Rate is 28%");
				else if (AI>190201 && AI<372950)
					System.out.println("Marginal Rate is 33%");
				else 
					System.out.println("Marginal Rate is 35%");
				
				
			
		
					
		}
		
		
		
	}

}
