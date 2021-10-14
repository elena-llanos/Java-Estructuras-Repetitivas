package eva1.tema2;

import java.util.Scanner;

public class Factoneg {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		int userNumber = 1;
	
		do {
		   userNumber = askForNumber();
			if (userNumber != 0) {
				int positiveNumber = makePositive(userNumber);
				int factorial = factorial(positiveNumber);
				System.out.println(factorial);
			}
			
		} while (userNumber != 0);

		int number = 5;
		do {
			   number = askForNumber();
				if (userNumber != 0) {
					number = makePositive(number);
					number = factorial(number);
					System.out.println(number);
				}
				
			} while (userNumber != 0);


		System.out.print("mira pavo, 0 es pa salir" );


		



	}

	private static int askForNumber() {
		int numero;
		System.out.print("Introduce un número");
		numero = teclado.nextInt();
		return numero;
	}

	private static int factorial(int numero) {
		int factorial = 1;

		for(int i = 1; i<=numero ; i++) {


			factorial =	i * factorial;


		}

		return factorial;
	}

	//private static int doubleNumber(int numero) {
	//	numero = suma(numero,numero);
	//	return numero;
	//}

	private static int suma(int num1, int num2) {
		int suma = num1 + num2;
		return suma;

	}


	private static int makePositive(int numero) {
		if (numero < 0) {
			numero = (numero * -1);

		}
		return numero;
	}
}




//128. Realiza la clase Java Factoneg que pide números por teclado hasta que se introduzca el 0. 
//Por cada  número, si el número es positivo calcula su 
//factorial y, si es negativo, primero lo cambia de signo y  después calcula su factorial.