/**
* Escribe un programa que calcule el volumen de un cono según la fórmula V = 1 3 πr2h
*
* @author Alberto Parra 
*/
public class Ejercicio9 {
public static void main(String[] args) {		
	//Calcular el volumen de un cono.
	double numeroPi;
	numeroPi = 3.1416;
	//Valor del radio
	System.out.println("Introduce el radio del cono en cm:");
	int radio = Integer.parseInt(System.console().readLine() );
	//Valor de la altura
	System.out.println("Introduce la altura del cono en cm:");
	int altura = Integer.parseInt(System.console().readLine());
	//Realizamos las operaciones
	double resultado1 = (radio * radio);
	double resultado2 = (resultado1 * numeroPi);
	double resultadoFinal = (resultado2 / 3);
	//Lo muestra en pantalla
	System.out.print("El volumen de nuestro cono será de " + resultadoFinal + "cm³");
	
	
 }
}
