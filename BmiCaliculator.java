import java.util.Scanner;

public class BmiCaliculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("What is your height in m: ");
		double height=input.nextDouble();
		System.out.println("What is your Weight in kg: ");
		double weight=input.nextDouble();
		System.out.println("Your height in m:  "+height);
		System.out.println("Your Weight in kg:  "+weight);
		double BMI=weight/(height*height);
		System.out.println("Your BMI is  "+BMI);
		if (BMI<18.5)
			System.out.println("underweight");
		else if(BMI<25.0)
			System.out.println("Normal");
		else if(BMI<30.0)
			System.out.println("Overweight");
		else 
			System.out.println("Obese");
		
		input.close();
	}

}
