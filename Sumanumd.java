package eva1.tema2;

import java.util.Scanner;

public class Sumanumd {
	
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i;
		//String aux;
		
		i = 0;
		//aux = ""
;		
		System.out.print("Dime un n�mero ");
		i = teclado.nextInt();
		
		
		
		do {
			
			i++;
			//aux  = aux + i + " ";
			if (i < 0) {
				System.out.print("Dime otro");
				i = teclado.nextInt();
			} //else if (i > 0) {
				//System.out.print("Por fin un n�mero positivo");
			
			
		}while (i < 0);
		
			System.out.print("Por fin un n�mero positivo!");
		
		

	}
	

}
//109. Realiza la clase Java Sumanumd que modifica Sumanumw para que si el n�mero entero que se pide  por teclado es negativo 
//siga pidiendo n�meros hasta que se introduzca un n�mero positivo (con Do  While)