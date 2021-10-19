/**
* Escribe un programa que calcule el volumen de un cono según la fórmula V =
1
3
πr2h
*
* @author Alberto Parra 
*/
public class Ejercicio9 {
public static void main(String[] args) {
	System.out.print("Este programa calcula el volumen de un cono");
	double numeroPi;
	numeroPi = 3.1416;
	
	System.out.println("Introduce el radio del cono en cm:");
	int radio = Integer.parseInt(System.console().readLine() );
	
	System.out.println("Introduce la base del cono en cm:");
	int altura = Integer.parseInt(System.console().readLine() );
	
	double resultado1 = (radio * radio);
	double resultado2 = (resultado1 * numeroPi);
	double resultadoFinal = (resultado2 / 3);
	
	System.out.print("El volumen de nuestro cono será de " + resultadoFinal + "cm³");
	
	
 }
}
