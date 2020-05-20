package cheikh.algo;

import java.util.Scanner;

public class Exo23 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int u, v, w, n, i;
			
			System.out.println("Entrer le nombre de mois");
			n=scan.nextInt();
			
			u = 2;
			v = 2;
			w = 2;
			
			for(i=2; i<=12; i++){
				w = u + v;
		     	u = v;
		     	v = w;
			}
			System.out.println("Au bout d’un an, on aura "+w+" lapins");

		}

	}

}
