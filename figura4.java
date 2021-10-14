package eva1.tema2;

import java.util.Scanner;

public class figura4 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		int contadorLinea = 0;
		int contadorCol = 0;
		String asteriscos = "";
		//String asteriscosCol = "";

		for( contadorLinea = 1; contadorLinea < 5; contadorLinea ++) {
			
			
			for(contadorCol= 1; contadorCol < 4; contadorCol++) {
				System.out.print(asteriscos + "*");
				
			


			}System.out.println(asteriscos + "*" );
		}


	}
}


