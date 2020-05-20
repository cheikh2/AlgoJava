package cheikh.algo;

import java.util.Scanner;

public class Exo22 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
		int N,i,pos,sequencours,maxsequence;
		
		int [ ]  tableau = new int[100];
		
		System.out.println("Entrer N entiers différent compris entre 10 et 50");
		N=scan.nextInt();
		
		do {
			System.out.println("Entrer N entiers différent compris entre 10 et 50");
			N=scan.nextInt();
			
		}while(N <= 10 && N >= 500);
		for(i=1; i<=N; i++) {
			System.out.println("Entrer une valeur");
			N=scan.nextInt();
		}
				pos = 0;
				sequencours = 1;
				maxsequence = 0;
				for(i=1; i<=N; i++) {
					if((tableau[i] < tableau[i+1])){
						sequencours = sequencours + 1;
						if(sequencours > maxsequence ) {
							  maxsequence = sequencours;
							  pos = (i + 1)-maxsequence+1;
						}
						else {}
						 sequencours = 1;

					}
				}
				
		}
		

	}

}
