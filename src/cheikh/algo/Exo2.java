package cheikh.algo;

import java.util.Scanner;

public class Exo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner scan = new Scanner(System.in)) {
			float rayon, surface, perimetre;
			final float PI = (float) (4 * Math.atan(1));
		
		System.out.println("entrer le rayon du cercle = ");
		rayon = scan.nextInt();
			surface = (rayon*rayon) * PI;
			perimetre = rayon* 2 * PI;
				System.out.println("La surface du cercle est: "+surface);
				System.out.println("Le perimetre du cercle est: "+perimetre);
		}
				
	}


}
