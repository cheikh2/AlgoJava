package cheikh.algo;

import java.util.Scanner;

public class Exo13 {

	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			int jour,mois,annee;
			
			do{
				System.out.println("saisir la date sous format j/m/a");
				jour = scan.nextInt();
				mois = scan.nextInt();
				annee = scan.nextInt();
				
				}
				while((jour < 0 || jour > 31) || (mois < 0 || mois > 12) || (annee<1900 || annee > 2999));
				if(mois == 2 && jour >= 29) {
					System.out.println("Le mois de fevrier ne depasse pas 29 jours");
				}
				else if((mois == 4 || mois == 6 || mois == 9 || mois == 11) || jour > 30) {
					System.out.println("Ce mois ne depasse pas 30 jours");
				}else {
					System.out.println("la date: "+jour+"/"+mois+"/"+annee+" est valide");
				}
		}

	}

}
