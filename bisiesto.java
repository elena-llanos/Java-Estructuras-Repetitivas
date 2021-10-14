package eva1.tema2;

import java.util.Scanner;

public class bisiesto {

	static Scanner teclado = new Scanner  (System.in);



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int year = 0;

		System.out.print("Introduce un año" );
		year = teclado.nextInt();
		
		if ((year / 4 == 0) && (year / 100 != 0) ) {
			System.out.print("El año " + year + "es bisiesto ");
			
		}else if (year / 400 ==0) {
			System.out.print("El año " + year + "es bisiesto ");
		}else {
			System.out.print("Ese año no es bisisesto ");
		}
		teclado.close();






	}




}

//31.Realiza la clase Java Bisiesto que pide un año por teclado y muestra 
//por pantalla si es o no bisiesto. Un  año es bisiesto si es múltiplo de 4 pero no lo es de 100 excepto si también es múltiplo de 400. 
