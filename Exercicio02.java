import java.util.Scanner;

public class Exercicio02 {

	
	public static void preencher (int [ ] [ ] matInt) {
		Scanner sc = new Scanner (System.in);

		for (int l=0;l<2;l++) {
			for (int c=0;c<2;c++) {
			System.out.printf ("Preencha os valores: ");
			matInt[l][c] = sc.nextInt();
			}
		}
		sc.close();
}
	
	public static void exibir (int [ ] [ ] matInt) {
		for (int [ ] l:matInt) {
			for (int c:l) {
				System.out.printf("%d | ", c);
			}
			System.out.printf("%n");
		}
	}
	
	
	public static void main(String[] args) {
	
		int[][] matInt = new int [2] [2];
		preencher (matInt);
		exibir (matInt);
}
}
