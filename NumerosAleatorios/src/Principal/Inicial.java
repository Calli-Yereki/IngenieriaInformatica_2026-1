package Principal;

import java.util.Scanner;



public class Inicial {


public static void main(String[] args) {
	double numRnd1 = Math.random();
	double numRnd2 = Math.random();
	
	int intRnd1 = (int)(numRnd1*10)%6;
	int intRnd2 = (int)(numRnd2*10)%6;
	
	int resultado;
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("¿Cual es el resultado de "+intRnd1+"+"+intRnd2+"?: ");
	
	
	resultado=input.nextInt();
	
	if (resultado==intRnd1+intRnd2) {
		
		System.out.println("Acertaste morro");
	}
	else {
		System.out.println("Fallaste jajaj");
	}
	
	

	
	
}


}
