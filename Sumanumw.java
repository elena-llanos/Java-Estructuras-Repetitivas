package eva1.tema2;

import java.util.Scanner;

public class Sumanumw {
	
	static Scanner teclado = new Scanner(System.in);
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i;
		int suma;
		
		i = 0;
		suma = 0;
		
		System.out.print("Introduce un número ");
		i = teclado.nextInt();
		
		
		while (i > 0) {
			
			i++;
			suma = suma+i;
		}
		System.out.print(suma);
	}

}
//107. Realiza la clase Java Sumanumw que pide un numero entero por teclado y muestra la suma de todos  los números hasta el inclusive. Con While.