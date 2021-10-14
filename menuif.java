package eva1.tema2;

import java.util.Scanner;

public class menuif {

	static  Scanner teclado = new Scanner(System.in);


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1;
		int num2;

		//int suma;
		//int resta;
		//int multi;
		//int divi;
		//int resto;
		String operacion = " ";
		int pasarAnumero = 0;

		System.out.println("Menú operaciones; 1. suma - 2. resta - 3. multi - 4. divi - 0. Salir ");

		System.out.print("Introduce un número");
		num1 = teclado.nextInt();

		System.out.print("Introduce otro número");
		num2 = teclado.nextInt();

		System.out.print("Elige una operación");
		pasarAnumero = Integer.parseInt(operacion);
		pasarAnumero = teclado.nextInt();
		
		do {
		
		switch (pasarAnumero) {
		case 1:
			suma(num1, num2);
			break;
		}


	}while(pasarAnumero !=0);
	}
		
	private static int suma(int num1, int num2) {
		int suma = num1 + num2;
		return suma;


	}
	private static int resta(int num1, int num2) {
		int resta = num1 - num2;
		return resta;


	}
	private static int multi(int num1, int num2) {
		int multi = num1 * num2;
		return multi;


	}
	private static int divi(int num1, int num2) {
		int divi = num1 / num2;
		return divi;


	}
}
//29.Realiza la clase Java Menuif que muestra un menú y, en función de la opción, pide dos números enteros  por pantalla y calcula una operación. 
//1.Sumar 
//2.Restar 
//3.Multiplicar 
//4.Dividir 
//5.Resto (%) 
//0.Salir 
