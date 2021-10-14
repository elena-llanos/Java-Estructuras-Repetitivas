package eva1.tema2;

import java.util.Scanner;

public class tabnotas {

	static Scanner teclado = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nota;
		
		System.out.print("Introduce la nota; ");
		
		nota = teclado.nextInt();
		
		//este sería guay hacerlo con comprobaciones dobles &&
		
		if (nota <= 3) {
			
			System.out.print("MD");
		}		
		else if (nota == 3) {
			System.out.print("MD");
		}
		else if (nota <= 4) {
			System.out.print("INS");
		}
		else if (nota == 5) {
			System.out.print("SUF");
		}
		else if (nota == 6) {
			System.out.print("BIEN");
			
		}
		else if (nota == 7) {
			System.out.print("NOT");
		}
		else if (nota == 8 )	{
			System.out.print("NOT");
		}
		else if (nota == 9)	{
			System.out.print("SOB");
		}
		else if (nota == 10) {
			System.out.print("SOB");
		}
		else {
			System.out.print("eso es incalificable");
		}
	}	

}
//9. Realiza el pseudocódigo para el programa TABNOTAS que lee la nota de un alumno por teclado y 
//muestra por pantalla la calificación que le corresponde sabiendo que si 
//NOTA CALIFICACION 
//>=0 y <3 MD 
//>=3 y <5 INS 
//>=5 y <6 SUF 
//>=6 y <7 BIEN 
//>=7 y <9 NOT 
//>=9 y <=10 SOBRE
