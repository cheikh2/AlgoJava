package cheikh.algo;

import java.util.Scanner;

public class Exo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner scan = new Scanner(System.in)) {
			double a,b,c,delta,x1,x2;
		
			System.out.println("Entrer les valeurs a, b et c de l’équation ax²+bx+c=0 :");

	        System.out.println("a = ");
	        	a = scan.nextInt();

	        System.out.println("b = ");
	        	b = scan.nextInt();

	        System.out.println("c = ");
	        	c = scan.nextInt();
	        	if(a != 0) {
	        		delta = b*b-4*a*c;
	        	
	        	if(delta > 0) {
	        		x1 = (-b-Math.sqrt(delta))/(2*a);
	                x2 = (-b+Math.sqrt(delta))/(2*a);
	              System.out.println("Les racines sont x1 = " + x1 + " et x2 = " +x2);

	        	}
	        	if(delta < 0) {
	        		System.out.println("Pas de solutionn.");
	        	}
	        	if(delta==0) {
	        		x1 = -b/2*a;
	        		System.out.println(("la solution est :"+x1));
	        	}
	        }

	     }
				
		}
	}

