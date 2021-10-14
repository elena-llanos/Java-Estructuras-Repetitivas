package eva1.tema2;

import java.util.Scanner;

public class Menumeses {
	
	static Scanner teclado = new Scanner(System.in);
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String meses;
		
		System.out.println("Introduce el mes del año");
		meses = teclado.nextLine();
		
		switch (meses) {
		
		case "Enero":
			System.out.println("Es el mes 1");
			break;
		case "Febrero":
			System.out.println("Es el mes 2");
			break;
		case "Marzo":
			System.out.println("Es el mes 3");
			break;
		case "Abril":
			System.out.println("Es el mes 4");
			break;
		case "Mayo":
			System.out.println("Es el mes 5");
			break;
		case "Junio":
			System.out.println("Es el mes 6");
			break;
		case "Julio":
			System.out.println("Es el mes 7");
			break;
		case "Agosto":
			System.out.println("Es el mes 8");
			break;
		case "Septiembre":
			System.out.println("Es el mes 9");
			break;
		case "Octubre":
			System.out.println("Es el mes 10");
			break;
		case "Noviembre":
			System.out.println("Es el mes 11");
			break;
		case "Diciembre":
			System.out.println("Es el mes 12");
			break;
			default:
				System.out.print("No has escrito el mes correctamente");
				
			
			
		}
		teclado.close();
		
		

	}

}
//43.Realiza la clase Java Menumeses que pide un String con el nombre del mes por pantalla y 
//muestra el  número de mes que le corresponde. 