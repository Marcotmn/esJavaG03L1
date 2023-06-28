package app4;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		 System.out.println("Inserisci un numero");
		 
		 int numero = input.nextInt();
		 
		 System.out.println("Conto alla rovescia: ");
		 
		 for(int i = numero; i >= 0; i--) {
			 System.out.println(i);
		 }
		    
		    
		    
		
	}

}
