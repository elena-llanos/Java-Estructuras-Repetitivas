package eva1.tema2;

import java.util.Scanner;

public class Buscanum {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int myNumber = 5;

		int userNumber;

		int contador = 0;

		System.out.print("Introduce un n�mero");
		userNumber = teclado.nextInt();


		//while (userNumber > 0);

		compareNumbers(myNumber, userNumber, contador);
		}

	private static void compareNumbers(int myNumber, int userNumber, int contador) {
		while (userNumber != myNumber) {
			System.out.print("Introduce otro n�mero ");
			userNumber = teclado.nextInt();
			if (userNumber > myNumber) {

				System.out.println("Tu n�mero es mayor que el m�o");

			}else if(userNumber < myNumber) {

				System.out.println("Tu n�mero es menor que el m�o");
				
				contador++;
				

			}else if(userNumber == myNumber) {
				System.out.println("Congrats!!" + "has acertado en " + contador + " intentos");


			}
			}
	}
	}







	//123. Realiza la clase Java Buscanum que guarda un n�mero en memoria y pide n�meros hasta que se 
	//acierta el n�mero por parte del usuario. El programa muestra si el n�mero introducido es mayor o menor  que el 
	//almacenado en memoria as� como el n�mero de intentos que lleva el usuario