package eva1.tema2;

import java.util.Scanner;

public class Sacanumw {
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Introduce un n�mero: ");
		int num = sc.nextInt();
		int i = 0;
		String aux = "";
		
		//1 >> num
		while (i < num ) {
			i++;
			aux  = aux + i + ", ";
		}
		System.out.print(aux);
		
		sc.close();
	}

}
//103. Realiza la clase Java Sacanumw que pide un n�mero entero por teclado y
//muestra los n�meros desde  1 hasta �l inclusive. Con While