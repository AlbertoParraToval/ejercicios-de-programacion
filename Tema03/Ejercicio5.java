/**
* Escribe un programa que calcule el área de un rectángulo.
*
* @author Alberto Parra 
*/
public class Ejercicio5 {
public static void main(String[] args) {
	System.out.println("Este programa clacula la superficie de un rectángulo.");
	
	System.out.println("Introduce la base del rectángulo en cm:");
	int base = Integer.parseInt(System.console().readLine() );
	
	System.out.print("Introduce la altura del rectángulo en cm:");
	int altura = Integer.parseInt(System.console().readLine() );
	
	double resultado = (base * altura); 
	
	System.out.print("El área del rectángulo es " + resultado + " cm");
 }
}
