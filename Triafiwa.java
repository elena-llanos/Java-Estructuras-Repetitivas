package eva1.tema2;

import java.util.Scanner;

public class Triafiwa {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int userNumber = 0 ;
		String aux = "";
		

		System.out.print("Introduce un número ");
		userNumber = teclado.nextInt();

		System.out.println("N = " + userNumber );

		

		for(int i = 1; i<=userNumber; i++) {
			for(int j = 1; j <=userNumber; j++) {
				System.out.println(aux + j +j);
			}

			//System.out.println(aux + i + j);

		}









	}



}


// 140. Realiza la clase Java Triafiwa que pide un número n por teclado y muestra la siguiente salida en  pantalla. Con While. 

//N=5 
//1 
//2 2 
//3 3 3 
//4 4 4 4 5 5 5 5 5 
//N=4 
//1 
//2 2 
//3 3 3 
//4 4 4 4 
