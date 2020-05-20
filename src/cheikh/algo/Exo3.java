package cheikh.algo;

import java.util.Scanner;

public class Exo3 {

	public static void main(String[] args) {
try (Scanner scan = new Scanner(System.in)) {
	float r1,r2,r3,Rpar,Rser;
	int choix;
	
	System.out.println("entrer une valeur r1");
		r1 = scan.nextInt();
	System.out.println("entrer une valeur r2");
		r2 = scan.nextInt();
	System.out.println("entrer une valeur r3");
		r3 = scan.nextInt();
		
	System.out.println("entrer votre choix");
		choix = scan.nextInt();
		
		if(choix == 1) {
			Rser = r1+r2+r3;
				System.out.println("la resistance equivalente de r1 ,r2 et r3 en serie est: "+Rser);
		}else if (choix == 2){
			Rpar = (r1*r2*r3) / (r1*r2+r1*r3+r2*r3);
				System.out.println("la resistance equivalente de r1 ,r2 et r3 en parallele est: "+Rpar);
				}
			}	

		}

	}


