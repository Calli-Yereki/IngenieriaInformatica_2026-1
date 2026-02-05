package principal;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("Insert the quantity of feet and inches as a integer: \n\tFeet: ");
		
		int feet, inches, totalInches;
		
		float centimeters;
		
		Scanner input = new Scanner(System.in);
		
		feet = input.nextInt();
		
		System.out.println("\t Inches: ");
		
		inches = input.nextInt();
		
		totalInches = (12*feet) + inches;
		
		centimeters = (float) (totalInches * 2.54);
		
		System.out.println("\nThe result is: "+centimeters+"cm.");
		
		
		
		
		
	
	}

}
