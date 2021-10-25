/**
* Realiza un programa que calcule la media de tres notas.
*
* @author Alberto Parra 
*/
public class Ejercicio7tema4 {
	public static void main(String[] args) {
		System.out.print("Nota 1: ");
		Double nota1 = Double.parseDouble(System.console().readLine());
		System.out.print("Nota 2: ");
		Double nota2 = Double.parseDouble(System.console().readLine());
		System.out.print("Nota 3: ");
		Double nota3 = Double.parseDouble(System.console().readLine());

		double notaMedia = ((nota1 + nota2 + nota3)/ 3);
		System.out.print("La nota media es " + notaMedia);
 }
}
