package Principal;

import java.util.Scanner;



public class Main {


public static void main(String[] args) {
	int inches,feet, totalInches;
	
	
	float centimeters;
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Type as an integer the number of \n\tFeet: ");
	
	feet=input.nextInt();
	
	System.out.println("\n\tInches: ");
	
	inches=input.nextInt();
	
	totalInches = (12*feet)+inches;
	centimeters = (float)(totalInches*2.54);
	
	System.out.println("The result is: "+centimeters+"cm.");
	
	
	

	
	
}


}
