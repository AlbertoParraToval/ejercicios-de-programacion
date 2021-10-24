/**
* 	Realiza un programa que diga si un número introducido por teclado es par y/o
	divisible entre 5.
*
* @author Alberto Parra 
*/
public class Ejercicio14Tema4 {
	public static void main(String[] args) {
		
		
		System.out.println("¡Dame un número y te diré si es par o divisible entre 5!\n");
    
		System.out.print("Por favor, introduce el número en cuestión:");
		double numero = Double.parseDouble(System.console().readLine());

		if(numero % 2 != 0 && numero % 5 != 0){
			System.out.print("\n¡Este número ni es par ni es divisible entre 5!, por favor, introduce otro número");
		} else if (numero % 5 == 0){
			System.out.print("\n¡El número " + numero + " es divisible entre 5!");
		} else if (numero % 2 == 0){
			System.out.print("\n¡El número " + numero + " es par!");
		} 
  }
}
