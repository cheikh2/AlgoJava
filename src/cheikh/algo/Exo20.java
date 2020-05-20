package cheikh.algo;

import java.util.Scanner;

public class Exo20 {

	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
		int indice , valeur, iPG, PG;			
		
		System.out.println("Entrez le 1er nombre : ");
		valeur=scan.nextInt();
		
		PG = valeur;
		iPG = 1;
		
		for(indice=2; indice<=valeur; indice++) {
			System.out.println("entrer une valeur "+indice+"eme");
			valeur=scan.nextInt();
			
			if(valeur > PG) {
				iPG = indice;
	            PG = valeur;
			}
		}
		System.out.println("le plus grand de ces nombres est:"+ PG);
		System.out.println(" c'était le "+iPG+ " ème nombre saisi");
		}

	}

}
