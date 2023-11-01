package aplication;
import java.util.Scanner;

import java.util.Locale;

public class Progama {
	
	
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int preco = sc.nextInt();
		int troco = preco;
		int Um=0;
		int cinquenta=0;
		int vinte=0;
		int dez=0;
		int cinco=0;
		int um=0;
		while (preco>0) {
			
			if(preco>=100) {
				Um++;
				preco = preco - 100;
				
				
			} else if(preco>=50) {
				cinquenta++;
				preco = preco - 50;
				
			} else if(preco>=25) {
				vinte++;
				preco = preco - 25;
				
				
			} else if(preco>=10) {
				dez++;
				preco = preco - 10;
				
			} else if(preco>=5) {
				cinco++;
				preco = preco - 5;
				
				
			} else if(preco>=1) {
				um++;
				preco = preco - 1;
				
			}
	}
		System.out.println(um+cinco+dez+vinte+cinquenta+Um);
		System.out.println(Um);
		System.out.println(cinquenta);
		System.out.println(vinte);
		System.out.println(dez);
		System.out.println(cinco);
		System.out.println(um);
		
		
			
		}
	
	}



