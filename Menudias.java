package eva1.tema2;

import java.util.Scanner;

public class Menudias {

	static Scanner teclado = new Scanner (System.in);


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String caracter;
		//mejor usar variable tipo char, usa menos memoria

		System.out.println("Elige un car�cter; L M X J V S D");
		caracter = teclado.nextLine();

		switch (caracter) {

		case "L":
			System.out.println("Has elegido LUNES");
			break;
		case "M":
			System.out.println("Has elegido MARTES");
			break;
		case "X":
			System.out.println("Has elegido MI�RCOLES");
			break;
		case "J":
			System.out.println("Has elegido JUEVES");
			break;
		case "V":
			System.out.println("Has elegido VIERNES");
			break;
		case "S":			
			System.out.println("Has elegido S�BADO");
			break;
		case "D":
			System.out.println("Has elegido DOMINGO");
			break;

		default:
			System.out.println("No has elegido una opci�n correcta");

		}
		teclado.close();
	}

}
//42.Realiza la clase Java Menudias que pide un car�cter por pantalla y
//muestra el d�a de la semana que le  corresponde seg�n la siguiente tabla 
//L Lunes 
//M Martes 
//X Mi�rcoles 
//J Jueves 
//V Viernes 
//S S�bado 
//D Domingo 
//Otro Car�cter ERROR
