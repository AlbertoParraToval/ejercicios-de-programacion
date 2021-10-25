/**
* 	Escribe un programa que ordene tres números enteros introducidos por teclado
*
* @author Alberto Parra 
*/
public class Ejercicio13Tema4 {
	public static void main(String[] args) {
		int comodin;
		
		System.out.print("Introduce el primer número: ");
		int numero1 = Integer.parseInt(System.console().readLine());
		System.out.print("Introduce el segundo número: ");
		int numero2 = Integer.parseInt(System.console().readLine());
		System.out.print("Introduce el tercer número: ");
		int numero3 = Integer.parseInt(System.console().readLine());

		
		if (numero1 > numero2) {
			comodin = numero1;
			numero2 = numero1;
			numero2 = comodin;
		}
			
			
		if (numero2 > numero3){
			comodin = numero2;
			numero3 = numero2;
			numero3 = comodin;
		}
		
		if (numero1 > numero2) {
			comodin = numero1;
			numero2 = numero1;
			numero2 = comodin;
		}

		System.out.print("Los número introducidos de menor a mayor son " + numero1 + " < " + numero2 + " < " + numero3);
 }
}
