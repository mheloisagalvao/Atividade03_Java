import java.util.Scanner;

public class Exercicio03 {


	public static void exibir (int [ ] [ ] matInt) {
		for (int [ ] l:matInt) {
			for (int c:l) {
				System.out.printf("%d | ", c);
			}
			System.out.printf("%n");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Qual o tamanho da matriz que você quer? ");
    	System.out.printf("Colunas: ");
    	int colunas = sc.nextInt();
    	System.out.printf("Linhas: ");
    	int linhas = sc.nextInt();
    	
    	int[][] matInt = new int [linhas] [colunas];
    	
    	for (int l=0;l<linhas;l++) {
			for (int c=0;c<colunas;c++) {
			System.out.printf ("Preencha os valores: ");
			matInt[l][c] = sc.nextInt();
			}
		}
	
		exibir (matInt);
		sc.close();
}
}
