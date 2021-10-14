package eva1.tema2;

import java.util.Scanner;

public class Tablamuw {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 0;




		System.out.print("Introduce un número");
		num1 = teclado.nextInt();	

		while (num1 !=0)
		{
			System.out.println("Número: " + num1 + "\n");
			for (int i = 0; i <= num1; i++) {
				System.out.println(num1 + " * " + i + " = " + (num1 * i)); //+ "\n");
			}
			System.out.println();
			System.out.println("Introduce un número: ");
			num1 = teclado.nextInt();

		}
		
			teclado.close();
	}
}
//118



