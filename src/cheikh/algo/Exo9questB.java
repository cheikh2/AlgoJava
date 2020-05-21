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
			if(ha>hd) {
				if (ma > md) {
					dha = ha-hd;
					dma = ma - md;
					}
				else 	{
					dha = ha-hd-1;
					dma = ma + 60 - md;
		        	}
			}
			else {
				if (ma > md) {
					dha = ha-hd+24;
					dma = ma - md;
					}
				else {
					dha = ha-hd+24-1;
					dma = ma + 60 - md;
		        	}
			}
			System.out.println("la durée du vol est : "+dha+" heures et "+dma+" minutes ");
	}

	}

}
