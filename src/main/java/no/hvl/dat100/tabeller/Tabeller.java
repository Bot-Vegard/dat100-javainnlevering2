package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		
		 for (int tall : tabell) {
	            System.out.print(tall + " ");
	        
	        
			}
			System.out.println();
		}

	

	// b)
	public static String tilStreng(int[] tabell) {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("[");

		for (int i = 0; i < tabell.length; i++) {
			sb.append(tabell[i]);
			if (i < tabell.length -1){
				sb.append(",");
			}
		
		}
		sb.append("]");
		return sb.toString();
	}

	// c)
	public static int summer(int[] tabell) {
		
		int result = 0;
		for (int tall : tabell){
			result += tall;
		}
		return result;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		
		boolean funnet = false;
			
		int posisjon = 0;
		
		while (!funnet && posisjon < tabell.length) {
			if (tall == tabell[posisjon]) {
				funnet = true;
			}
			posisjon++;
		}
		
		return funnet;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				return i;
			}
		}
		return -1;

	}

	// f)
	public static int[] reverser(int[] tabell) {

		int[]nyTabell = new int[tabell.length];
		int j = tabell.length - 1;
		for (int i = 0; i < tabell.length; i++) {
			nyTabell[i] = tabell[j];
			j--;
		}
		return nyTabell;
	}
	// g)
	public static boolean erSortert(int[] tabell) {
		
		for (int i = 0; i < tabell.length - 1; i++) {
			if (tabell[i] > tabell[i + 1]) {
				return false;
			}
		}
		return true;
		
		
		}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		
		int tabellsammen[] = new int[tabell1.length+tabell2.length];
		
		for (int i = 0; i < tabell1.length; i++) {
			tabellsammen[i] =  tabell1[i];
		}
		
		for (int i = 0; i < tabell2.length; i++) {
			tabellsammen[tabell1.length+i] =  tabell2[i];
		}
		return tabellsammen;
		
	}
}
