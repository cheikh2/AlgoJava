package cheikh.algo;

import java.util.Scanner;

public class Exo16 {

	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			int A,B,R;
			float Q;	
		    Q = 0;
		    
		    System.out.println("veuillez saisir une valeur de A");
			A=scan.nextInt();
			System.out.println("veuillez saisir une valeur de B");
			B=scan.nextInt();
			R = A;
			
			while(R >= B) {
				R = R - B;
	            Q = Q+1;
			}
			System.out.println("Quotient entier: "+Q);
			System.out.println("Le reste est: "+R);
			
		}

	}

}
