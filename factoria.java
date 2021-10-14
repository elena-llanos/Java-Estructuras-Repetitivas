package eva1.tema2;

import java.util.Scanner;

public class factoria {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int userNumber = 0;
		//int myNumber = 0;
		int factorial = 0;
		int resultado = 11;
		String aux = ""; //para prinetar los numeros que salen
		
		System.out.print("Introduce un número");
		userNumber = teclado.nextInt();
		
		
		for (factorial = 1 ; factorial <= userNumber ; factorial++ ) {
			
			
			
			resultado  =  resultado * factorial;
			aux  = aux +   factorial + " *   " ;
			
			
		}
		aux = aux.substring(0 , aux.length()-3);
		System.out.print(aux + resultado);
		
		teclado.close();

	}

}
//c114. Realiza la clase Java Factoria que pide un número por teclado y calcula su factorial. 