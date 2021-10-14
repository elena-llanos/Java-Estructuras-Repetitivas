package eva1.tema2;

import java.util.Scanner;

public class Sacaparw {

	static Scanner sc =new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Introduce un número: ");
		int num = sc.nextInt();
		int i = 0;
		String aux = "";
		
		// números pares desde 0->num
		do {
			i++;
			if (i % 2 == 0) {
				aux  = aux + i + ", ";
			}
		}while(i < num );

		System.out.println(aux);
		sc.close();
	}
}
//104. Realiza la clase Java Sacaparw que pide un número entero por teclado y 
//muestra los números pares  desde 0 hasta él inclusive. Con While.