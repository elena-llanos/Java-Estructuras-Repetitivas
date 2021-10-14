package eva1.tema2;

import java.util.Scanner;

public class Sumarparf {

	static Scanner teclado = new Scanner (System.in);


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int userNumber = 0;
		int suma = 0;

		//int init = 1;

		System.out.print("Introduzca un número");
		userNumber = teclado.nextInt();

		for (int init = 1 ; init <= userNumber; init ++){



			if (init % 2 == 0) {
				suma = suma+init;





			}

		}
		System.out.print(suma);
		teclado.close();






	}

}
//111. Realiza la clase Java Sumaparf pide un numero entero por teclado y muestra 
//la suma de todos los  números pares desde 0 hasta n. Con For.