package eva1.tema2;

import java.util.Scanner;

public class Menudias {

	static Scanner teclado = new Scanner (System.in);


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String caracter;
		//mejor usar variable tipo char, usa menos memoria

		System.out.println("Elige un carácter; L M X J V S D");
		caracter = teclado.nextLine();

		switch (caracter) {

		case "L":
			System.out.println("Has elegido LUNES");
			break;
		case "M":
			System.out.println("Has elegido MARTES");
			break;
		case "X":
			System.out.println("Has elegido MIÉRCOLES");
			break;
		case "J":
			System.out.println("Has elegido JUEVES");
			break;
		case "V":
			System.out.println("Has elegido VIERNES");
			break;
		case "S":			
			System.out.println("Has elegido SÁBADO");
			break;
		case "D":
			System.out.println("Has elegido DOMINGO");
			break;

		default:
			System.out.println("No has elegido una opción correcta");

		}
		teclado.close();
	}

}
//42.Realiza la clase Java Menudias que pide un carácter por pantalla y
//muestra el día de la semana que le  corresponde según la siguiente tabla 
//L Lunes 
//M Martes 
//X Miércoles 
//J Jueves 
//V Viernes 
//S Sábado 
//D Domingo 
//Otro Carácter ERROR
