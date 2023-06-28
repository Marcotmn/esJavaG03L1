package app3;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		while (true) {
		    System.out.println("Inserisci una stringa (per uscire digita ':q'): ");
		    String stringa = input.nextLine();
		    
		    if (stringa.equals(":q")) {
		        break; 
		    }
		    
		    char[] caratteri = stringa.toCharArray();
		    
		    for (char carattere : caratteri) {
		        System.out.print(carattere + ",");
		    }
		    
		    System.out.println();
		}

	}

}
