package eva1.tema2;

import java.util.Scanner;

public class Menucase {

	static Scanner teclado = new Scanner(System.in);


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String opcion;





		System.out.print("Elige una opci�n Opci�n1, Opci�n2, Opci�n3, Opci�n4, Opci�n5 ");
		opcion = teclado.nextLine();

		switch (opcion) { 

		case "Opci�n1" :

			System.out.println("Has elegido Opci�n1");
			break;

		case "Opci�n2":
			System.out.println("Has elegido Opci�n2");
			break;
			
		case "Opci�n3":
			System.out.println("Has elegido Opci�n3");
			break;
		case "Opci�n4":
			System.out.println("Has elegido Opci�n4");
			break;
		case "Opci�n5":
			System.out.println("Has elegido Opci�n5");
			break;
		default:
			System.out.println("Esa no es una opci�n correcta");
			
		}
		teclado.close();




	}

}
//41.Realiza la clase Java Menucase que muestra un men� y, 
//en funci�n de la opci�n, muestra un mensaje  indicando la opci�n seleccionada usando una estructura selectiva. 
//1. Opci�n 1 
//2. Opci�n 2 
//3. Opci�n 3 
//4. Opci�n 4 
//5. Opci�n 5 
//0. Salir 
