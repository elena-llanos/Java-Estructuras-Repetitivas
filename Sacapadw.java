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

		System.out.print("Introduce un número ");
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
	
		

		
			
			
		

		
	
		
	
		//106. Realiza la clase Java Sacapadw que pide un número entero por teclado y muestra los números pares  desde él inclusive hasta 0. Con While.