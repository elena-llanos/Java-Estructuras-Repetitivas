package eva1.tema2;

import java.util.Scanner;

public class Menucase {

	static Scanner teclado = new Scanner(System.in);


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String opcion;





		System.out.print("Elige una opción Opción1, Opción2, Opción3, Opción4, Opción5 ");
		opcion = teclado.nextLine();

		switch (opcion) { 

		case "Opción1" :

			System.out.println("Has elegido Opción1");
			break;

		case "Opción2":
			System.out.println("Has elegido Opción2");
			break;
			
		case "Opción3":
			System.out.println("Has elegido Opción3");
			break;
		case "Opción4":
			System.out.println("Has elegido Opción4");
			break;
		case "Opción5":
			System.out.println("Has elegido Opción5");
			break;
		default:
			System.out.println("Esa no es una opción correcta");
			
		}
		teclado.close();




	}

}
//41.Realiza la clase Java Menucase que muestra un menú y, 
//en función de la opción, muestra un mensaje  indicando la opción seleccionada usando una estructura selectiva. 
//1. Opción 1 
//2. Opción 2 
//3. Opción 3 
//4. Opción 4 
//5. Opción 5 
//0. Salir 
