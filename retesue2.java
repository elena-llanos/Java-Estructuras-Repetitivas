package eva1.tema2;

import java.util.Scanner;

public class retesue2 {
	
	
	static Scanner teclado = new Scanner(System.in) ;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sueldo;
		// int retencion;
		
		System.out.println("�Cual es tu sueldo?; ");
		sueldo = teclado.nextInt();
		
		if (sueldo < 1000.00) {
			
			System.out.print("Se te aplica un 10% de retenci�n, que son =  " + ((sueldo * 10) / 100) + "Euros") ;
		}
		
		else if (sueldo == 1000.00) {
			
			System.out.print("se te aplica un 12% de retenci�n, que son = "  + ((sueldo * 12) / 100) + "Euros");
			
		}
		
		else if (sueldo > 1000.00) {
			
			System.out.print("Se te aplica un  14% de retenci�n, que son = " + ((sueldo * 14) / 100) + "Euros");
		}
		
		else if (sueldo == 2000.00) {
			
			System.out.print("Se te aplica un 16% de retenci�n, que son = " + ((sueldo * 16) / 100) + "Euros");
		}
		
		else if (sueldo > 2000.00) {
			
			System.out.print("Se te aplica un 18% de retenci�n, que es = " + ((sueldo * 18) / 100) + "Euros");
			
		}
		teclado.close();
		
	}

}

//7. Realiza el pseudoc�digo para el programa RETESUE2 
//que lee el sueldo de un trabajador por teclado y 
//muestra por pantalla la retenci�n que se le aplica sabiendo que si 
//sueldo < 1000.00 retencion 10% 
//sueldo 1000.00 retencion 12% 
//sueldo < 2000.00 retencion 14% 
//sueldo 2000.00 retencion 16% 
//sueldo > 2000.00 retencion 18%
