/**
* Escribe un programa que calcule el área de un triángulo.
*
* @author Alberto Parra 
*/
public class Ejercicio6 {
public static void main(String[] args) {
	System.out.println("Este programa clacula la superficie de un rectángulo.");
	
	//Definimos la base
	System.out.println("Introduce la base del rectángulo en cm:");
	int base = Integer.parseInt(System.console().readLine() );
	
	//Definimos la altura
	System.out.print("Introduce la altura del rectángulo en cm:");
	int altura = Integer.parseInt(System.console().readLine() );
	
	//Realizamos la Operación
	double resultado = ((base * altura)/2); 
	System.out.print("El área del rectángulo es " + resultado + " cm");
 }
}
