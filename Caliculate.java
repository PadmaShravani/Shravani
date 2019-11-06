import java.util.Scanner;

public class Caliculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int s1=input.nextInt();
		int s2=input.nextInt();
		System.out.println("sum of two numbers is: "+(s1+s2));
		System.out.println("multiplication of two numbers is: "+(s1*s2));
		System.out.println("Average of two numbers is: "+(s1+s2)/2);
	}

}
