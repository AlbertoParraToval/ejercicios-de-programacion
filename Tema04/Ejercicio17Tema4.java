/**
* 	Escribe un programa que diga cuál es la última cifra de un número entero
	introducido por teclado
* @author Alberto Parra 
*/
public class Ejercicio17Tema4 {
	public static void main(String[] args) {
		//Al ponerle a nuestra varible %10 nos coloca en la ultima cifra del numero que escribamos
		System.out.print("Introduce el número cuya última cifra quiera saber:\n ");
		int numero = Integer.parseInt(System.console().readLine());
		int ultimoDigito = numero%10;
		
		System.out.println("El último dígito de " + numero + " es " + ultimoDigito);
  }
}
