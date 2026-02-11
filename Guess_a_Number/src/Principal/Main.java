package Principal;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		double numRnd = Math.random();
		
		int intRnd = (int)(numRnd*100);
		int numIn;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Guess a Number between 0 and 100: ");
		
		numIn = input.nextInt();
		
		while (intRnd != numIn) {
			if(intRnd <= numIn) {
				System.out.println("Too high, try again");
				numIn = input.nextInt();
			}
			else {
				System.out.println("Too low, try again");
				numIn = input.nextInt();
			}
		}
		
		System.out.println("You win!");
		
	}

}
