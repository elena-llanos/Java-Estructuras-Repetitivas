package eva1.tema2;

import java.util.Scanner;

public class valorabs2 {
	static Scanner teclado = new Scanner(System.in);
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float num;
		
		System.out.print("Introduce un n�mero: ");
		num = teclado.nextFloat();
		
		if (num > 0) {
			
			System.out.println("Valor absoluto: " + num) ;
			
		}
		else if (num < 0)
			System.out.println("Valor absoluto: " + num * -1);
		
						
			
			teclado.close();
			
			//otra forma; if (num !=) dice ; si el n�mero es distinto de 0
			
		}
		

	}



//19.Realiza la clase Java Valorabs que lee el valor de un 
//n�mero real por teclado y muestra su valor absoluto  por pantalla.  
