package eva1.tema2;

import java.util.Scanner;

public class notavali {
	
	static Scanner teclado = new Scanner (System.in);
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nota;
		
		System.out.print("Introduce la nota ");
		nota = teclado.nextInt();
		
		if (nota > 0 && nota <10) {
			
			System.out.print("Tu nota es v�lida");
		}
		else {
			
			System.out.print("Tu nota no es v�lida");
			
		}
		teclado.close();

	}

}
//30.Realiza la clase Java Notavali que lee la nota de un alumno por teclado y 
//muestra por pantalla si es v�lida  o no, sabiendo que es v�lida si est� entre 0 y 10. 
