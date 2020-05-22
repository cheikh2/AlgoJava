package cheikh.algo;

import java.util.Scanner;

public class Exo10 {

	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			int A, B, C;
			
			System.out.println("Entrer A ");
			A = scan.nextInt();
			System.out.println("Entrer B ");
			B = scan.nextInt();
			System.out.println("Entrer C ");
			C = scan.nextInt();
			
			
			if(A > B && B>C) {
				System.out.println("Les valeurs A , B et C sont (dans l’ordre):"+ A+" "+B+" "+C);		
			}
			if(B>A && A>C) {
				System.out.println("Les valeurs A , B et C sont (dans l’ordre):"+ B+" "+A+" "+C);
			}
			if(C>B && B>A) {
				System.out.println("Les valeurs A , B et C sont (dans l’ordre):"+ C+" "+B+" "+A);
			}
			else {
				System.out.println("Les valeurs A , B et C sont (dans l’ordre):"+ C+" "+A+" "+B);
			}
			
		}

	}

}
