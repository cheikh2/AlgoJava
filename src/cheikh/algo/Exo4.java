package cheikh.algo;

import java.util.Scanner;

public class Exo4 {

	public static void main(String[] args) {
		// Version 1
		try (Scanner scan = new Scanner(System.in)) {
		float X;
		int n;
		
		System.out.println("veuillez saisir une valeur de X");
		X=scan.nextInt();
		System.out.println("veuillez saisir une valeur de n");
		n=scan.nextInt();

		System.out.println (Math.pow(X,n));
	}

}


}