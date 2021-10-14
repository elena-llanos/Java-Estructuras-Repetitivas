package eva1.tema2;

import java.util.Scanner;

public class parimpar {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		
		System.out.print("Introduce un número: ");
		num = teclado.nextInt();
		
		if (num % 2 == 0) {
	        
			System.out.print("El número es par");
			
	    } else {
	    	
	    	System.out.print("El número es impar");
	    }

	}

}
//20.Realiza la clase Java Parimpar que lee el valor de un 
//número entero por teclado y muestra por pantalla si  es par o impar. 