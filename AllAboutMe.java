import java.util.Scanner;

public class AllAboutMe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Shahparan",myEyes = "Black",myTeeth="White",myHair= "Black";
		int myAge = 31,myHeight = 175;
		System.out.println("Let's talk about " +name+".\r\n They're "+myHeight+
				"inches tall.\r\nThey're "+ myAge+" years old.\r\nHuh, that's older than I expected...\r\n" + 
				"They have "+myEyes+" eyes and "+myHair+" hair.\r\n" + 
				"Their teeth are usually "+myTeeth+" but it depends on the coffee.\r\n" + 
				"Alright, this is pretty boring. Let's stop talking about "+name+".");
		System.out.println(name.length());
		
		String name2=name.replaceAll("Shahparan","Shravani");
		double x=myHeight*2.54;
		System.out.println("Let's talk about " +name2+".\r\n They're "+x+
				"cms tall.\r\nThey're "+ myAge+" years old.\r\nHuh, that's older than I expected...\r\n" + 
				"They have "+myEyes+" eyes and "+myHair+" hair.\r\n" + 
				"Their teeth are usually "+myTeeth+" but it depends on the coffee.\r\n" + 
				"Alright, this is pretty boring. Let's stop talking about "+name2+".");
		
		System.out.println(name2.length());
		
	}

}
