package eva1.tema2;

import java.util.Scanner;

public class calcuiva {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int  num;
		
		System.out.print("Introduce un número:" );
		num = teclado.nextInt();
		
		if (num < 20000) {
			
			
			
			System.out.print("El iva es de 7%");
		}
		else {
			
			System.out.print("El IVA es de 16%");
		}
		
		teclado.close();
		
				
		
		
		

	}

}




//21.Realiza la clase Java Calcuiva que lee una cantidad en euros por teclado y muestra por 
//pantalla su IVA  sabiendo que si la cantidad es menor que 20000 el IVA es el 7% y sino del 16%.