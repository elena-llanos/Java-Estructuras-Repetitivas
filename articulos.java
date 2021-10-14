package eva1.tema2;

import java.util.Scanner;

public class articulos {
	
	static Scanner teclado = new Scanner(System.in);
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int codigo;
		int cantidad; 
		int precio;
		
		int precioporcantidad;
		
		System.out.print("Introduce codigo articulo");
		codigo = teclado.nextInt();
		
		System.out.print("Introduce la cantidad comprada");
		cantidad = teclado.nextInt();
		
		System.out.print("Introduce el precio");
		precio = teclado.nextInt();
		
		precioporcantidad = precio * cantidad;
		
		if (precioporcantidad > 100) {
			
						
			System.out.print("El precio con el 40% de descuento del articulo  " + codigo + " Tiene un precio total de  " + 
			(precioporcantidad * 40 / 100) + "Euros" );
		}
		
		else if (precioporcantidad > 25 && precioporcantidad <= 100) {
			System.out.print("El precio con el 20% de descuento del articulo  " + codigo + " Tiene un precio total de  " + 
					(precioporcantidad * 20 / 100) + "Euros");
						
		}
		//else if (precioporcantidad < 100) {
			//System.out.print("El precio con el 20% de descuento del articulo  " + codigo + " Tiene un precio total de  " + 
				//precioporcantidad * 20 / 100) ;
						
		
		else if (precioporcantidad > 10 && precioporcantidad <= 25 ) {
			System.out.print("El precio con el 10% de descuento del articulo  " + codigo + " Tiene un precio total de  " + 
					(precioporcantidad * 10 / 100) + "Euros") ;
		}
		else if (precioporcantidad <10) {
			System.out.print("El precio  del articulo  " + codigo + " Tiene un precio total de  " + 
					precioporcantidad + "Euros ya que no tiene descuento ") ;
			
		}

	}

}
//10.Realiza el pseudocódigo para el programa ARTICULOS que pide un código de artículo, 
//la cantidad  comprada de ese artículo y el precio unitario de ese artículo por pantalla, 
//calcula el descuento en función  de la siguiente tabla y muestra los datos anteriores
//junto con el descuento y el precio total por pantalla.  Tabla 
//CANTIDAD DESCUENTO 
//>100 40% 
//>25 y <=100 20% 
//>10 y <=25 10% 
//<=10 0% 
