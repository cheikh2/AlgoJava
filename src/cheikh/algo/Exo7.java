package cheikh.algo;

import java.util.Scanner;

public class Exo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner scan = new Scanner(System.in)) {
		int montant=0, billet20, billet10, billet5, piece2, piece1;
		
			
			while(montant <= 0) {
				System.out.println("entrer le montant à décomposer");
				montant = scan.nextInt();		
				}
					billet20 = montant / 20;
					billet10 = (montant % 20)/10;
					billet5 = ((montant%20)%10)/5;
					piece2 = (((montant%20)%10)%5)/2;
					piece1 = ((((montant%20)%10)%5)%2);
						System.out.println("Le montant "+montant+" à "+billet20+" billet(s) de 20€");
						System.out.println(billet10+" billet(s) de 10€");
						System.out.println(billet5+" billet(s) de 5€");
						System.out.println(piece2+" piece(s) de 2€");
						System.out.println(piece1+" piece(s) de 1€");
			
		}

	}

}
