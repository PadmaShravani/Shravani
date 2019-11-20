package miniProject1;

import java.util.Scanner;

public class CoffeeMachine {
	static int water,milk,coffeeBeans,addWater,addDisposableCups,addMilk,addCoffeeBeans,count;
	static int waterHas=400;
	static int coffeeBeansHas=120;
	static int milkHas=540;
	static int disposableCupsHas=9;
	static int moneyHas=550;
	static int money;
	static int numOfCups;
	static int availableCups;
	static int remainingCups;
	static Scanner input=new Scanner(System.in);
	//static String transaction="";
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//helloCoffee();
		remaining();
		action();
		input.close();
		
		//machinehaveNeeds();
		//enoughCoffeeForEveryone();
	}

//		public static void helloCoffee() {
// 			System.out.println("Starting to make a coffee\r\n" + 
// 					"\r\nGrinding coffee beans\r\nBoiling water\r\n" + 
// 					"Mixing boiled water with crushed coffee beans\r\n" +  
// 					"Pouring coffee into the cup\r\n" + 
// 				"Pouring some milk into the cup\r\nCoffee is ready!");
// 		}
//		public static void machinehaveNeeds() {
//			//Scanner input=new Scanner(System.in);
//			//System.out.println("Enter");
//			System.out.println("Write how many cups of coffee you will need: ");
//			numOfCups=input.nextInt();
//			water=200*numOfCups;
//			milk=50*numOfCups;
//			coffeeBeans=15*numOfCups;
//		System.out.println("For "+numOfCups+" cups of coffee you will need: "
//				+ water+"  ml of water \n"+milk+" ml of milk \n"
//				+coffeeBeans+" g of coffee beans");
//		}
//		public static void enoughCoffeeForEveryone() {
//		//System.out.println(waterHas/200+" "+milkHas/50+" "+coffeeBeansHas/15);
//			int availableCups=Math.min(Math.min(waterHas/200,milkHas/50),coffeeBeansHas/15);
//			System.out.println(availableCups);
//			int remainingCups=availableCups-numOfCups;
//			if(numOfCups<availableCups)
//			{
//				System.out.println("Yes, I can make that amount of coffee and even "+ remainingCups +" more than that");
//			}
//			else if(numOfCups==availableCups)
//			{
//				System.out.println("Yes, I can make that amount of coffee");
//			}
//			else
//			{
//				System.out.println("No, I can make only "+ availableCups +" cups of coffee");
//			}
////			waterHas=waterHas-water;
////			milkHas=milkHas-milk;
////			coffeeBeansHas=coffeeBeansHas-coffeeBeans;
////			if(waterHas>0 && milkHas>0 && coffeeBeansHas>0)
////			{
////				System.out.println("enough "+waterHas+" "+milkHas+" "+coffeeBeansHas);
////			}else
////			{
////				System.out.println(" Not enough "+waterHas+" "+milkHas+" "+coffeeBeansHas);
////			}
////			System.out.println(" water the coffee machine has: 1550\r\n" + 
////					" milk the coffee machine has: 299\r\n" + 
////					" coffee beans the coffee machine has: 300\r\n" + 
////					" cups of coffee you will need: 3\r\n" + 
////					"Yes, I can make that amount of coffee (and even 2 more than that)\r\n"	);
//		}
		
		public static void action() {
			//Scanner input=new Scanner(System.in);
			System.out.println("\n Buy \n Fill \n Take  \n Remaining \n Exit");
			String s=input.next();
			while (!s.equalsIgnoreCase("exit")) {
			switch(s.toLowerCase()) {
			case "buy":buy();
				System.out.println("\n Buy \n Fill \n Take  \n Remaining \n Exit");
				count++;
				//s=input.next();
				break;
			case "fill":fill();
				System.out.println("\n Buy \n Fill \n Take  \n Remaining \n Exit");
				count++;//s=input.next();
				break;
			case "take":takeMoney();
				System.out.println("\n Buy \n Fill \n Take  \n Remaining \n Exit");
				count++;//s=input.next();
				break;
			case "remaining":remaining();
				System.out.println("\n Buy \n Fill \n Take  \n Remaining \n Exit");
				count++;
				//s=input.next();
				break;
			
			}s=input.next();
			}
			if(s.equalsIgnoreCase("exit")) { 
				exit();
			}
			
		}
		public static void remaining() {
			////Scanner input=new Scanner(System.in);
			
			System.out.println(" The coffee machine has: \n"+	waterHas +" of water \n "+ milkHas+" of milk \n"
					+  coffeeBeansHas +" of coffee beans \n "+disposableCupsHas+" of disposable cups \n"+ 
					"$"+moneyHas+" of money"); 
				}
		 static void buy() {
			 //Scanner input=new Scanner(System.in);
				System.out.println("\nWelcome to SHRAVANI CAFE");
				System.out.println("What do you want to buy?\n 1 - espresso  \n 2 - latte\n 3 - cappuccino \n"
						+ " back - to main menu: "+count++ +"\n");
				
				//int n=input.nextInt();
				String s=input.next();
				if (s.equalsIgnoreCase("back")) {
					action();
				}else {
				switch(Integer.parseInt(s)) {
				case 1:System.out.println("Espresso-cost $4");
					//System.out.println(waterHas/250+"  "+coffeeBeansHas/16+" "+"cost $4");
					water=250;
					coffeeBeans=16;
					milk=0;
					money=4;
					numOfCups=1;
					//System.out.println("numOfCups"+numOfCups);
					availableCups=Math.min(waterHas/250,coffeeBeansHas/16);
					//System.out.println("availableCups"+availableCups);
					//int remainingCups=availableCups-numOfCups;
					//System.out.println("remainingCups"+remainingCups);
					if(numOfCups<=availableCups) {
						System.out.println("I have enough resources, making you a coffee!");
						disposableCupsHas=disposableCupsHas-numOfCups;
						waterHas=waterHas-water;
						milkHas=milkHas-milk;
						coffeeBeansHas=coffeeBeansHas-coffeeBeans;
						moneyHas=moneyHas+money;
					}else {
						if(waterHas<250 && coffeeBeansHas<16)
							System.out.println("Sorry, not enough water and coffee Beans");
					else if(waterHas<250)
						System.out.println("Sorry, not enough water!");
						else if(coffeeBeansHas<16)
							System.out.println("Sorry, not enough coffee Beans");
					}
					break;
				case 2:System.out.println("latte-costs $7");
					//System.out.println(waterHas/350+" "+milkHas/75+" "+coffeeBeansHas/20);
					water=350;
					coffeeBeans=20;
					milk=75;
					money=7;
					numOfCups=1;
					availableCups=Math.min(Math.min(waterHas/350,milkHas/75),coffeeBeansHas/20);
					//System.out.println(availableCups);
					 remainingCups=availableCups-numOfCups;
					if(numOfCups<=availableCups) {
						System.out.println("I have enough resources, making you a coffee!");
						disposableCupsHas=disposableCupsHas-numOfCups;
						waterHas=waterHas-water;
						milkHas=milkHas-milk;
						coffeeBeansHas=coffeeBeansHas-coffeeBeans;
						moneyHas=moneyHas+money;
					}else {
						if(waterHas<350 && coffeeBeansHas<20 && milkHas<75)
							System.out.println("Sorry, not enough water and coffee Beans and milk");
					else if(waterHas<350)
						System.out.println("Sorry, not enough water!");
						else if(coffeeBeansHas<20)
							System.out.println("Sorry, not enough coffee Beans");
						else if(milkHas<75)
							System.out.println("Sorry, not enough milk!");
					}
					break;
					
				case 3:System.out.println("cappuccino-costs $6");
					//System.out.println(waterHas/200+" "+milkHas/100+" "+coffeeBeansHas/12);
					water=200;
					coffeeBeans=12;
					milk=100;
					money=6;
					numOfCups=1;
					availableCups=Math.min(Math.min(waterHas/200,milkHas/100),coffeeBeansHas/12);
					//System.out.println(availableCups);
					 remainingCups=availableCups-numOfCups;
					if(numOfCups<=availableCups) {
						System.out.println("I have enough resources, making you a coffee!");
						disposableCupsHas=disposableCupsHas-numOfCups;
						waterHas=waterHas-water;
						milkHas=milkHas-milk;
						coffeeBeansHas=coffeeBeansHas-coffeeBeans;
						moneyHas=moneyHas+money;
					}else {
						if(waterHas<200 && coffeeBeansHas<12 && milkHas<100)
							System.out.println("Sorry, not enough water and coffee Beans and milk");
					else if(waterHas<200)
						System.out.println("Sorry, not enough water!");
						else if(coffeeBeansHas<12)
							System.out.println("Sorry, not enough coffee Beans");
						else if(milkHas<100)
							System.out.println("Sorry, not enough milk!");
					}
					
					break;
				}
				}
		 }
		 static void fill() {
			 //Scanner input=new Scanner(System.in);
			 System.out.println("Write how many ml of water do you want to add: "+addWater+"\r\n");
			 addWater=input.nextInt();
			 System.out.println("Write how many ml of milk do you want to add: "+addMilk +"\r\n" );
			 addMilk=input.nextInt();
			 System.out.println("Write how many grams of coffee beans do you want to add: "+addCoffeeBeans +"\r\n");
			 addCoffeeBeans=input.nextInt();
			System.out.println("Write how many disposable cups of coffee do you want to add: "+addDisposableCups);
			addDisposableCups=input.nextInt();
			
			waterHas=waterHas+addWater;
			milkHas=milkHas+addMilk;
			coffeeBeansHas=coffeeBeansHas+addCoffeeBeans;
			disposableCupsHas=disposableCupsHas+addDisposableCups;
			System.out.println("The coffee machine has: \n"+	waterHas +" of water \n "+ milkHas+" of milk \n"
					+  coffeeBeansHas +" of coffee beans \n "+disposableCupsHas+" of disposable cups \n"+ 
					"$"+moneyHas+" of money"); 
			
		 }
		 static void takeMoney() {
			 System.out.println("I gave you "+moneyHas );
			moneyHas=0;
			System.out.println(" The coffee machine has: \n"+	waterHas +" of water \n "+ milkHas+" of milk \n"
					+  coffeeBeansHas +" of coffee beans \n "+disposableCupsHas+" of disposable cups \n"+ 
					"$"+moneyHas+" of money"); 
			 //transaction="take";
			 //remaining();
		 }
		 static void exit() {
			 System.out.println("Thank You!!");
		 }
}	
