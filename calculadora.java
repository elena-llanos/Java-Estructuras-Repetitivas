package eva1.tema2;

import java.util.Scanner;

public class calculadora {

	static Scanner teclado = new Scanner(System.in);



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1 = 0;
		double num2 = 0;

		double resultado = 0;
		
		String operacion = "";

		System.out.println("Introduce un número");
		num1 = Double.parseDouble(teclado.nextLine());
		//num1 = teclado.nextDouble(); es lo mismo que la línea anterior
		System.out.println("Introduce otro número");
		num2 = Double.parseDouble(teclado.nextLine());
		operacion = menu();

		


		switch (operacion) {
		case "1":
			resultado = suma(num1, num2);
			System.out.print(resultado);

			break;
		case "2":
			resultado = resta(num1, num2);
			System.out.print(resultado);
			break;
		case "3":
			resultado = multiplica(num1, num2);
			System.out.print(resultado);
			break;
		case "4":
			resultado = division(num1, num2);
			System.out.print(resultado);
			break;

		case "0":
			
			
			System.out.println("Has elegido salir del programa");
			
				

		}do {
			operacion = menu();
		}while (!(operacion.equals("0")));



		teclado.close();
	}


	public static String menu() {

		System.out.println("Elige la operación que quieras realizar;" +
				"1. = Suma;" +
				"2. = Resta;" +
				"3. = Multiplica;" +
				"4. = Divide;" +
				"0. = Salir; ");
		return teclado.nextLine();


	} 



	public static double suma(double num1, double num2){
		double resultado = num1+num2;
		return resultado;
	}

	public static double resta(double num1, double num2){
		double resultado = num1-num2;
		return resultado;
	}
	public static double multiplica(double num1, double num2){
		double resultado = num1*num2;
		return resultado;
	}
	public static double division(double num1, double num2){
		double resultado = 0;
		if(num2 !=0) {
			resultado = num1 / num2;
		}
		else {
			System.out.println("Esa división no es válida");
		}
		return resultado;

	}

}



