package aplication;
import java.util.Scanner;

import java.util.Locale;

public class Progama {
	
	
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int num = 1;
		
		int [ ] vetor = new int [2] ;
		
		int consula = sc.nextInt();
		
		for(int w=0;w<2;w++) {
			vetor[w] = sc.nextInt();
			
		}
		
		int maior = vetor[1];
		
		for (int i=1;i<consula;i++) {
			for(int w=0;w<2;w++) {
				vetor[w] = sc.nextInt();
			}
			
			if (maior<=vetor[0]) {
				num++;
				maior = vetor[1];
			}
		
			
		}
		System.out.println(num);
	
	}
}
