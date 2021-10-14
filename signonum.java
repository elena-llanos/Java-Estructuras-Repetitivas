package eva1.tema2;
import java.util.Scanner;

public class signonum {
	static Scanner teclado = new Scanner(System.in);
	
	
	public static void main(String[] args) {
			int num;
			System.out.print("Introduce un número: ");
			num = teclado.nextInt();
			
			System.out.println("Número: " + (num *-1 ));
	
			teclado.close();
	}
}