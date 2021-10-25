/**
* 	Realiza un programa que resuelva una ecuación de primer grado (del tipo ax+b = 0)
*
* @author Alberto Parra 
*/
public class Ejercicio5Tema4 {
	public static void main(String[] args) {
		System.out.print("Valor de X: ");
		Double X = Double.parseDouble(System.console().readLine());
		System.out.print("valor de Y: ");
		Double Y = Double.parseDouble(System.console().readLine());

		if (X == 0) {
		System.out.println("Esa ecuación no tiene solución real.");
		} else {
		System.out.println("x = " + (-Y/X));
		}
 }
}
