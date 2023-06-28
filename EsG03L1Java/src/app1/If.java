package app1;

public class If {

	public static void main(String[] args) {
		
		
		///////////ES STRINGAPARIDISPARI
		
		///// stringa
		
		String esercizioIf = "il mio nome è marco";
		
		
		///// numero di caratteri con il .lenght()
		
		int numeroCaratteri = esercizioIf.length();
		
		
		///// Chiamo la funzione 
		
		stringaPariDispari(numeroCaratteri);
		
		
		///////////ES ANNOBISESTILE
		
		
		int anno = 2024;
		
		annoBisestile(anno);
		

	}
	
	////// funzione stringparidispari
	
	public static void stringaPariDispari( int numeroCaratteri) {
		if (numeroCaratteri % 2 == 0) {
			System.out.println("il numero di caratteri è pari");
	}
	 else {
		System.out.println("il numero di caratteri è dispari");
	}
		
	}
		
		
	////// funzione annoBisestile
		
		
		public static void annoBisestile(int anno) {
			
		if (anno % 4 == 0 && anno % 100 != 0 || anno % 100 == 0 && anno % 400 == 0) {
			System.out.println("L'anno è bisestile");
		
		} else {
			System.out.println("l'anno non è bisestile");
		}
			
		}
		

}
