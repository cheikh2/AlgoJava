package cheikh.algo;

import java.util.Scanner;

public class Exo9questB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner scan = new Scanner(System.in)){
		float hd,md,ha,ma,dha, dma;
		
			do{
				System.out.println("heure de depart: ");
				hd = scan.nextInt();
				System.out.println("minute de depart: ");
				md = scan.nextInt();
				}
				while((hd <= 0 || hd >=  24) || (md <= 0 || md >= 60));
		
			do{
				System.out.println("heure d'arrivée: ");
				ha = scan.nextInt();
				System.out.println("minute d'arrivée: ");
				ma = scan.nextInt();
				}
				while((ha <= 0 || ha >=  24) || (ma <= 0 || ma >= 60));
			
			if(ha <= hd) {
				dha = 24 - hd + ha;
			    dma = md + ma;
			    if(dma >= 60) {
			    	dha = dha + 1;
			        dma = dma - 60;
			    }
			   
			}
				else {
				dha = ha - hd;
			    dma = ma + md;
			    if(dma >= 60) {
			    	dha = dha + 1;
			        dma = dma - 60;
			    }
			}
			System.out.println("la durée du vol est : "+dha+" heures et "+dma+" minutes ");
	}

	}

}
