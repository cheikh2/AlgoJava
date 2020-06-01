package cheikh.algo;

import java.util.Scanner;

public class Exo22 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			 int N;
		        do {
		            System.out.println("Veuillez saisir la taille de la séquence : (entre 10 et 50)");
		            N = scan.nextInt();
		        } while (N < 10 || N > 50);
		        int[] tab = new int[N];
		        for (int i = 0; i < N; i++) {
		            do {
		            System.out.println("Veuillez saisir un nombre : ");
		            int nombre = scan.nextInt();
		            tab[i] = nombre;
		            } while (N < 1 || N >= 100);
		        }
		        //  1  2  3  1  2  3  4  5  6  7  8  2  3  4  5 
		        int longueur = 1;
		        int position = 0;
		        int longueur_i = 1;
		        for (int i = 1; i < tab.length; i++) {
		            if (tab[i] > tab[i - 1]) {
		                longueur++;
		            } else {
		                if (longueur > longueur_i) {
		                    longueur_i = longueur;
		                    position = i - longueur_i;
		                }
		                longueur = 1;
		            } 
		            if(i==(tab.length-1)){
		               if (longueur > longueur_i) {
		                    longueur_i = longueur;
		                    position = (i - longueur_i)+1;
		                } 
		            }
		        }
		        System.out.print("La plus longue séquence est ");
		        for (int i = position; i < (longueur_i + position); i++) {
		            System.out.print(tab[i] + " * ");
		        }
		        System.out.println("qui débute à la position " + (position + 1));
		        System.out.println(" et elle est de longueur " + longueur_i);
		    }
		}

}