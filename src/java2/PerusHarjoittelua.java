package java2;


/**
 * Luokka, jossa harjoitellaan perusasioita.
 * 
 * @author Ari Tuhkala
 *
 */

public class PerusHarjoittelua {
	
	/**
	 * P��ohjelma, joka on koko luokan k�yt�ss�
	 * @param args ei k�yt�ss�
	 */
	public static void main(String[] args) {
		
		//Lukujen k�sittely�
		
		int lukuA = 9;
		double lukuB = 2.0;
		
		double vastaus = lukuA / lukuB;
		
		// Tulostetaan konsoliin vastaus
		System.out.println("lukuA / lukuB = " );
		
		int lukuC = 9;
		int lukuD = 2;
		
		double vastaus2 = lukuC/lukuD;
		System.out.println("LukuC / lukuD = ");

		// Aritmeettiset operaatiot
		
		int lukuE = 0;
		
		lukuE++; 
		System.out.println("LukuE arvo lis�ysoperaation j�lkeen = "  );
		
		lukuE--;
		System.out.println("LukuE arvo v�hennysoperaation j�lkeen = "  );
		
		lukuE = 0; // nollataan lukuE
		
		//Summa
		lukuE = lukuE + 10;
		
		//Summaoperaatio
		lukuE += 10;
		
		System.out.println("LukuE pit�isi t�ss� vaiheessa olla == ");
		
		
		//Ehtolauseet ja toistorakenteet
		
		int kierros = 0;
		
		while (kierros<10) {
			
			System.out.println("While-silmukan kierros: " );
			kierros++;
		}
		
		do {
			System.out.println("Do-while kierros: " );
			kierros++;
		} while (kierros<20);
		
		for (int i = 20 ;i<=30;i++) {
			System.out.println("For kierros: " );
		}
		
	}

}
