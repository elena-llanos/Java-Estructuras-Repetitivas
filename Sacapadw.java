package eva1.tema2;

import java.util.Scanner;

public class Sacapadw {

	static Scanner teclado = new Scanner(System.in);


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i;
		int num = 0;
		String aux;

		i = 0;
		aux = "";

		System.out.print("Introduce un n�mero ");
		num = teclado.nextInt();


		do {	

			num--;
			
			if (num % 2 == 0) {
				
				aux = aux + num + ", ";
			}
				
				
			}while (i < num);
			
			System.out.println(aux);
			teclado.close();
		
		}
	}	
	
		

		
			
			
		

		
	
		
	
		//106. Realiza la clase Java Sacapadw que pide un n�mero entero por teclado y muestra los n�meros pares  desde �l inclusive hasta 0. Con While.