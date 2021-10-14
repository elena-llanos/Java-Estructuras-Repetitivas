package eva1.tema2;

import java.util.Scanner;

public class retesuel {
	
	
	static Scanner teclado = new Scanner(System.in) ;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sueldo;
		// int retencion;
		
		System.out.println("¿Cual es tu sueldo?; ");
		sueldo = teclado.nextInt();
		
		if (sueldo < 1000.00) {
			
			System.out.print("Se te aplica un 10% de retención, que es =  " + (sueldo * 10) / 100);
		}
		
		else if (sueldo == 1000.00) {
			
			System.out.print("se te aplica un 12% de retención, que es = "  + (sueldo * 12) / 100);
			
		}
		
		else if (sueldo > 1000.00) {
			
			System.out.print("Se te aplica un  14% de retención, que es = " + (sueldo * 14) / 100);
		}
		
		
		teclado.close();
		
	}

}


//Realiza el pseudocódigo para el programa RETESUEL que lee el sueldo de un trabajador por teclado y 
//muestra por pantalla la retención que se le aplica sabiendo que si 
//sueldo < 1000.00 retencion 10% 
//sueldo 1000.00 retencion 12% 
//sueldo > 1000.00 retencion 14% 
