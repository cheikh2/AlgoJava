package cheikh.algo;

import java.util.Scanner;

public class Exo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner scan = new Scanner(System.in)) {
		float x1,x2,y1,y2 ,d;
		
		System.out.println("veuillez saisir x1");
			x1=scan.nextInt();
		System.out.println("veuillez saisir x2");
			x2=scan.nextInt();
		System.out.println("veuillez saisir y1");
			y1=scan.nextInt();
		System.out.println("veuillez saisir y2");
			y2=scan.nextInt();
		
		d =  (float) Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
			System.out.println("La distance entre A et B est: "+ d);
		
		}

	}

}
