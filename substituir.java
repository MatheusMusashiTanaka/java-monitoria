package menindisaia;

import java.util.Scanner;
public class deveres {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("escreva:");
		String str = input.nextLine();
		System.out.println("letra original:");
		char li = input.next().charAt(0);
		System.out.println("letra substituida:");
		char ls = input.next().charAt(0);
		String mudado = str.replace(li,ls);
		System.out.println(mudado);
		
		
	}
}


