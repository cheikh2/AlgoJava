package cheikh.algo;

import java.util.Scanner;

public class Exo25 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int i,j,n, cpt;
			n=0;
			cpt=0;
			
			for(i=1; i<=10; i++){
				System.out.println("Entrer n");
				n=scan.nextInt();
				
				for(j=1; j<=i; j++){
					System.out.println("Entrer i");
					i=scan.nextInt();
				}
			System.out.println(n);
			}
			for(i=1; i<=n; i++){
				if(n % i == 0){
					cpt = cpt + 1;
				}
			}
			if(cpt == 2) {
				System.out.println("le nombre "+n+" est premier");
			}
		}

	}

}
