package eva1.tema2;

import java.util.Scanner;

public class valorabs {
	static Scanner teclado = new Scanner(System.in);
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		
		System.out.print("Introduce un n�mero: ");
		num = teclado.nextInt();
		
		if (num >0) {
			
			System.out.println("El n�mero introducido es positivo");
			
			teclado.close();
			
			
			
		}
		

	}

}


//19.Realiza la clase Java Valorabs que lee el valor de un 
//n�mero real por teclado y muestra su valor absoluto  por pantalla.  