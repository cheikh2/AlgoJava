package cheikh.algo;

import java.util.Scanner;

public class Exo15 {

	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			int nombre, somme, i;
			somme = 0;
			System.out.println("entrer le nombre : ");
			nombre = scan.nextInt();
			
			for(i=1; i<=nombre; i++) {
				
				somme = somme+i;
			}
			System.out.println("la somme des valeurs est "+somme);
			System.out.println("la moyenne des valeurs est "+(float)somme/nombre);
		}

	}

}
