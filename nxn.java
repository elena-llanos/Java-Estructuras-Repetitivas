package eva1.tema2;

import java.util.Scanner;

public class nxn {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		int resultado;
		
		// num = (int) Math.pow(num, 2); OTRA OPCIÓN DE CUADRADO
		
		System.out.print("Introduce un número:" );
		num = teclado.nextInt();
		
		resultado = (num * num);
		
		if (resultado > 100) {
			
			System.out.print(resultado - 100);
			
		
		}
		
		else if (resultado < 100 ); {
			
			System.out.print(resultado - 100);
		}
			
		teclado.close();
	}
		
	
}
		


//22.Realiza la clase Java Nxn que lee un número por teclado y calcula el cuadrado de ese número.
//Si el  cuadrado es mayor que 100 se le restara 100 y 
//se mostrara por pantalla. Si no es mayor que 100, se  mostrara lo que le falta para llegar a 100.