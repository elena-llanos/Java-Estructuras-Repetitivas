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
		
		
		System.out.print("Introduce un número");
		i = teclado.nextInt();
		
		while (i > 1) {
			i--;
			aux  = aux + i + ", ";
		}
		System.out.print(aux);
				
		teclado.close();
			
			
			
			
		
		

	}

}
//105. Realiza la clase Java Sacanudw que pide un número entero por teclado y 
//muestra los números desde  él inclusive hasta 1. Con While. 