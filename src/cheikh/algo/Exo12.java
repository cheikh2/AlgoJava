package cheikh.algo;

import java.util.Scanner;

public class Exo12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner scan = new Scanner(System.in)){
		int valeur, somme, i;
		valeur = 0;
		
		
		System.out.println("Entrer la valeur ");
		valeur = scan.nextInt();
		somme = 0;
		for(i=1; i<=valeur/2; i++) {	
			
			if(valeur%i==0) {
				somme = somme + i;
			}		
		}
		if(somme==valeur) {
		System.out.println("le nombre :"+valeur+" est parfait");
		}else {
			System.out.println("le nombre :"+valeur+" n'est pas parfait");
		}
		}

	}
}
