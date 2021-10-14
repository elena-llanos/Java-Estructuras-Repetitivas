package eva1.tema2;

import java.util.Scanner;

public class Maximini {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int min = 0, max = 0;
		String aux = "";
		
		System.out.print("Introduce un número");
		int num = teclado.nextInt();
		
		min = num;
		max = num;
				
		
		while (num >=0) {
			
			aux = aux + num + ",";
			
			if (num > max) {max = num;}
			if (num < min) {min = num;}
			System.out.print("Introduce un número: ");
			num = teclado.nextInt();
			
			if (num < 0) {
			
			System.out.println("Ese número es negativo\n" + "Has introducido los números  " + aux + " Y el mayor es   " +  max );
			
			
			}
			
			
			
		}teclado.close();
		
			
			
		
		

		

		}

	}








//116

//116. Realiza la clase Java Maximini que calcula el valor máximo y mínimo de unos números introducidos  por teclado. 
//La introducción de números cesará cuando se introduzca un numero negativo que no será  tenido en cuenta. 
