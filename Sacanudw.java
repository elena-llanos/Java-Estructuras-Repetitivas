package eva1.tema2;

import java.util.Scanner;

public class Sacanudw {
	
	static Scanner teclado = new Scanner(System.in); 

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		
		
		int i;
		String aux;
		
		
		
		
		
		i = 0;
		aux = "";
		
		
		System.out.print("Introduce un n�mero");
		i = teclado.nextInt();
		
		while (i > 1) {
			i--;
			aux  = aux + i + ", ";
		}
		System.out.print(aux);
				
		teclado.close();
			
			
			
			
		
		

	}

}
//105. Realiza la clase Java Sacanudw que pide un n�mero entero por teclado y 
//muestra los n�meros desde  �l inclusive hasta 1. Con While. 