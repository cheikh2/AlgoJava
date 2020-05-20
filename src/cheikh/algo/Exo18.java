package cheikh.algo;

import java.util.Scanner;

public class Exo18 {

	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			int a , b ,c ,d;
			
			System.out.println("veuillez saisir une valeur de A");
			a=scan.nextInt();
			System.out.println("veuillez saisir une valeur de B");
			b=scan.nextInt();
			
				c=a;
				d=b;
				
			while(a!=b) {
				if(a>b) {
					b = b+d;
				}else {
					a = a+c;
				}
			}
			System.out.println(" le PPCM est "+a);
		}

	}

}
