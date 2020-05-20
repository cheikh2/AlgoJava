package cheikh.algo;

import java.util.Scanner;

public class Exo21 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int A, B;
			
			System.out.println("Enter la valeur du premier utilisateur A : ");
			A=scan.nextInt();
			System.out.println("Enter la valeur du deuxième utilisateur B :");
			B=scan.nextInt();
			
			do {		
				if(B > A) {
					System.out.println("Enter la valeur de B plus petit:");
					B=scan.nextInt();
				}
				if(B < A) {
					System.out.println("Enter la valeur de B plus grand:");
					B=scan.nextInt();
				}
			}
			while(A!=B);
			System.out.println("Bravo! vous avez trouver le bon nombre");
		}

	}

}
