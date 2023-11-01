package aplication;
import java.util.Scanner;
import entidaes.Triangulo;
import java.util.Locale;

public class Progama {
	
	
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int pessoas = sc.nextInt();
		int [ ] vetor = new int [pessoas] ;
		for (int x=0;x<pessoas;x++) {
			vetor[x]=sc.nextInt();
		}
		
		
		int p = sc.nextInt();
		int m = sc.nextInt();
		
		int P = 0;
		int M = 0;
		for (int x=0;x<pessoas;x++) {
			if (vetor[x]==1) {
				P++;
			}else if(vetor[x]==2){
				M++;
				
			}
			
		}
		if (p==P && M==M) {
			System.out.println("S");
			
		}else {
			System.out.println("N");
		}
	}
}
