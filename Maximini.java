package eva1.tema2;

import java.util.Scanner;

public class Maximini {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int min = 0, max = 0;
		String aux = "";
		
		System.out.print("Introduce un n�mero");
		int num = teclado.nextInt();
		
		min = num;
		max = num;
				
		
		while (num >=0) {
			
			aux = aux + num + ",";
			
			if (num > max) {max = num;}
			if (num < min) {min = num;}
			System.out.print("Introduce un n�mero: ");
			num = teclado.nextInt();
			
			if (num < 0) {
			
			System.out.println("Ese n�mero es negativo\n" + "Has introducido los n�meros  " + aux + " Y el mayor es   " +  max );
			
			
			}
			
			
			
		}teclado.close();
		
			
			
		
		

		

		}

	}








//116

//116. Realiza la clase Java Maximini que calcula el valor m�ximo y m�nimo de unos n�meros introducidos  por teclado. 
//La introducci�n de n�meros cesar� cuando se introduzca un numero negativo que no ser�  tenido en cuenta. 
