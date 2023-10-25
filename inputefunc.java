package menindisaia;

import java.util.Scanner;
public class deveres {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("escreva numero");
		int x = input.nextInt();
		mult(x);
		
		
	}




	public static void mult(int x) {
		if((x%2)==0) {
			System.out.println("multiplo de 2");
		}else {
			System.out.println("nao multiplo de 2");
		}
	}
}
