package eva1.tema2;

import java.util.Scanner;

public class Sumaparw {
	
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i;
		int userNumber;
		int suma;
		
		i = 0;
		suma = 0;
		
		System.out.print("Dime un número");
		userNumber = teclado.nextInt();
		
		
		do {
			
			i++;
			
			if(i % 2 == 0) {
				suma = suma+i;
				
			}
			
		}while(i < userNumber);
		
		
		System.out.println(suma);
		teclado.close();
		

	}

}
//110. Realiza la clase Java Sumaparw pide un numero entero por teclado y 
//muestra la suma de todos los  números pares desde 0 hasta n. Con While. 
