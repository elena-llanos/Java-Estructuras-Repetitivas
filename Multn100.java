package eva1.tema2;

import java.util.Scanner;

public class Multn100 {

	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int userNumber = 0;
		int initNumber = 0;
		//int multiplo = 0;
		int resultado = 0;
		

		System.out.print("Introduce un n�mero");
		userNumber = teclado.nextInt();

		for(initNumber = 1; initNumber <= 100; initNumber++) {
			
			
			
			resultado = userNumber*initNumber;
			
			System.out.println( resultado);

			

			}




		}

	}


//121. Realiza la clase Java Multn100 que pide un n�mero entero por teclado y muestra por pantalla sus  100 primeros m�ltiplos. 
//Un n�mero entero num2 es m�ltiplo de un n�mero entero num1 cuando existe otro n�mero natural que, multiplicado por num1, nos da como resultado num2. 