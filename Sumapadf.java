package eva1.tema2;

import java.util.Scanner;

public class Sumapadf {
	
	static Scanner teclado = new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int userNumber;
		int init;
		int suma = 0;
		int resultado = 0;
		System.out.print("Introduce un número");
		userNumber = teclado.nextInt();
		
		
		
		
		for (init = userNumber; init >= 0;  init --) {
			
			
			if(init %2==0) {
				suma = suma + init ;
				//resultado = suma --;
				System.out.println(suma);
			}
		}
	}

}
//113. Realiza la clase Java Sumapadf pide un numero entero por teclado y 
//muestra la suma de todos los  números pares desde n hasta 0 (en orden descendente). Con For. 
