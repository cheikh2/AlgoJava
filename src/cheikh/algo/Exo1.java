package cheikh.algo;

import java.util.Scanner;

public class Exo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner scan = new Scanner(System.in)) {
				float qr;
				int A, r, B, q;
				
				System.out.println("veuillez saisir une valeur de A");
				A=scan.nextInt();
				System.out.println("veuillez saisir une valeur de B");
				B=scan.nextInt();
					q=A/B;
					r=A%B;
					qr=(float) A/B;
						System.out.println(q);
						System.out.println(qr);
						System.out.println(r);
		}
	}

}
