package cheikh.algo;

import java.util.Scanner;

public class Exo14 {

	public static void main(String[] args) {
		
		try(Scanner scan = new Scanner(System.in)){
			int jour, mois, annee;
			
			System.out.println("saisir la date sous format j/m/a");
			jour = scan.nextInt();
			mois = scan.nextInt();
			annee = scan.nextInt();
			
			if( (jour > 0 && mois >0) && (annee % 4 == 0 && annee % 100 != 0) || annee % 400 ==0) {
				System.out.println("l’année que vous avez entrer est bissextile.");
			}else {
				System.out.println("l’année que vous avez entrer n'est pas bissextile.");
			}
		}

	}

}
