package cheikh.algo;

import java.util.Scanner;

public class Exo11 {

	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			int a=0, b=0;
			String str;
			char operateur;
			
			System.out.println("Entrer a ");
			a = scan.nextInt();
			
			scan.nextLine();
			System.out.println("Entrer l'operateur ");
			str = scan.nextLine();
			operateur = str.charAt(0);
			
			System.out.println("Entrer b ");
			b = scan.nextInt();
			
			
			if(operateur =='+') {
				System.out.println(a+b);
			}
			
			if(operateur =='-') {
				System.out.println(a-b);
			}
			if(operateur =='*') {
				System.out.println(a*b);
			}
			
		}

	}

}
