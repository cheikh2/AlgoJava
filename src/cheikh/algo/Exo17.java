package cheikh.algo;

import java.util.Scanner;

public class Exo17 {

	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
		int a, b, c, resu, pgcd;
		
		do{
		System.out.println("veuillez saisir une valeur de A");
		a=scan.nextInt();
		System.out.println("veuillez saisir une valeur de B");
		b=scan.nextInt();
		}
		while(a<0 || b<0);
		
		pgcd  = 0;
        resu = 0;
        while(a!=b) {
        	if(b>a) {
        		c=a;
                a=b;
                b=c;
        	}
        	resu = a-b;
            a = b;
            b = resu;
            pgcd = a;
        	}
        System.out.println("le pgcd de A et B est : "+ pgcd);
		}
	}

}
