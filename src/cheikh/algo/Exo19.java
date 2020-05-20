package cheikh.algo;

import java.util.Scanner;

public class Exo19 {

	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			int prix, somme;
			somme = 0 ;

			System.out.println("Entrer le prix du 1° article:");
			prix=scan.nextInt();
			
			while(prix!=0) {
				somme = somme + prix;
				System.out.println("Entrer le prix de l'article suivant( 0 si Fin):");
				prix=scan.nextInt();
			}
			System.out.println(" La somme des prix des articles est "+somme);
		}

	}

}
