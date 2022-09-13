public class Exercicio01 {

	public static void exibir (int [ ][ ] matriz) {
		
		//Fazer um programa que utiliza o método "exibir" (definido em um dos slides da aula 08/09) para mostrar a matriz definida abaixo.
		
	    for(int [ ] l:matriz) {
	    	for(int c:l) {
	    		System.out.printf("%d | ", c);
	    	}
	    	System.out.printf("%n");
	    }
	}
	
	public static void main (String [ ] args ) {
		int [ ][ ] matriz = {{0,1,2},{3,4,5},{6,7,8}};
		System.out.println ("Matriz: ");
		exibir(matriz);
	}
}

