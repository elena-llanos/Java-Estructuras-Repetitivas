package eva1.tema2;

import java.util.Scanner;

public class Sumapadw {

	static Scanner teclado = new Scanner (System.in);


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int userNumber = 0;
		int suma = 0;
		int init = 0;

		System.out.print("Introduce un número");
		userNumber = teclado.nextInt();

		init = userNumber;


		do {

			
			

			if (init % 2 == 0){
				suma = suma+init;
				System.out.println(init);
				



			}
			init --;


		}while (init > 1);

		System.out.println(suma);

	}
}




	//112. Realiza la clase Java Sumapadw pide un numero entero por teclado y muestra la suma de todos los  números 
	//pares desde n hasta 0 (en orden descendente). Con While. 