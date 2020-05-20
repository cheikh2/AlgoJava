package cheikh.algo;

import java.util.Scanner;

public class Exo5 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int val, i, somme;
			somme = 0;
			
			for(i=1; i<=5; i++) {
				System.out.println("entrer une valeur "+i+"eme");
				val = scan.nextInt();
				somme = somme+val;
			}
			System.out.println("la somme des valeurs est "+somme);
		}	

	}

}
