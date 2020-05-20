package cheikh.algo;

import java.util.Scanner;

public class Exo9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner scan = new Scanner(System.in)){
		float hd,md,ha,ma,dha, dma;
		
		System.out.println("Entrer l'heure de depart ");
			System.out.println("heure: ");
				hd = scan.nextInt();
			System.out.println("minute: ");
				md = scan.nextInt();
    	
    	System.out.println("Entrer l'heure d'arrivée ");
			System.out.println("heure: ");
				ha = scan.nextInt();
			System.out.println("minute: ");
				ma = scan.nextInt();
				
				dma = (ha*60+ma)-(hd*60+md);
				dha = dma/60;
					System.out.println("La durée du vol est: "+dha);
		}
	}

}
