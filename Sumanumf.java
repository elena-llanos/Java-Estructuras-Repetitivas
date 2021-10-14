package eva1.tema2;

import java.util.Scanner;

public class Sumanumf {
	
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int userNumber;
		int i;
		int suma;
		
		i = 0;
		suma = 0;
		
		System.out.print("Introduce un número ");
		userNumber = teclado.nextInt();
		
		for ( i = 1 ; i <= userNumber; i++ ) {
			
			suma = suma + i;
			
			
		}
		System.out.println("La suma del número " + userNumber + " es igual a " + suma);

	}

}
//108. Realiza la clase Java Sumanumf que pide un numero entero por teclado y
//muestra la suma de todos  los números hasta el inclusive. Con For. 