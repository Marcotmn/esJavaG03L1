package app1;

public class If {

	public static void main(String[] args) {
		
		
		///// stringa
		
		String esercizioIf = "il mio nome è marco";
		
		
		///// numero di caratteri con il .lenght()
		
		int numeroCaratteri = esercizioIf.length();
		
		
		///// Chiamo la funzione 
		
		stringaPariDispari(numeroCaratteri);
		

	}
	
	////// funzione if
	
	public static void stringaPariDispari( int numeroCaratteri) {
		if (numeroCaratteri % 2 == 0) {
			System.out.println("il numero di caratteri è pari");
	}
	 else {
		System.out.println("il numero di caratteri è dispari");
	}
	}
		
}
