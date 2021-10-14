package eva1.tema2;

import java.util.Scanner;

public class Buscanum {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int myNumber = 5;

		int userNumber;

		int contador = 0;

		System.out.print("Introduce un número");
		userNumber = teclado.nextInt();


		//while (userNumber > 0);

		compareNumbers(myNumber, userNumber, contador);
		}

	private static void compareNumbers(int myNumber, int userNumber, int contador) {
		while (userNumber != myNumber) {
			System.out.print("Introduce otro número ");
			userNumber = teclado.nextInt();
			if (userNumber > myNumber) {

				System.out.println("Tu número es mayor que el mío");

			}else if(userNumber < myNumber) {

				System.out.println("Tu número es menor que el mío");
				
				contador++;
				

			}else if(userNumber == myNumber) {
				System.out.println("Congrats!!" + "has acertado en " + contador + " intentos");


			}
			}
	}
	}







	//123. Realiza la clase Java Buscanum que guarda un número en memoria y pide números hasta que se 
	//acierta el número por parte del usuario. El programa muestra si el número introducido es mayor o menor  que el 
	//almacenado en memoria así como el número de intentos que lleva el usuario