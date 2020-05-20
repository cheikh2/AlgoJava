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
			
			
			if(A > B && A>C && B>C) {
				System.out.println("Les valeurs A , B et C sont (dans l’ordre):"+ A+" "+B+" "+C);		
			}
			else {
				System.out.println("Les valeurs A , B et C sont (dans l’ordre):"+ A+" "+C+" "+B);
			}
			if(B>A && B>C && A>C) {
				System.out.println("Les valeurs A , B et C sont (dans l’ordre):"+ B+" "+A+" "+C);
			}
			else {
				System.out.println("Les valeurs A , B et C sont (dans l’ordre):"+ B+" "+C+" "+C);
			}
			if(C>B && A<C && B>A) {
				System.out.println("Les valeurs A , B et C sont (dans l’ordre):"+ C+" "+B+" "+A);
			}
			else {
				System.out.println("Les valeurs A , B et C sont (dans l’ordre):"+ C+" "+A+" "+B);
			}
			
		}

	}

}
