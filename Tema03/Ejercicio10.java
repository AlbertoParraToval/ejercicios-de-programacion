/**
*Realiza un conversor de Mb a Kb.
*
* @author Alberto Parra 
*/
public class Ejercicio10 {
public static void main(String[] args) {
	System.out.println("Este programa convierte de kb a Mb.");
	
	System.out.print("Introduce el valor en kb");
    int Mb = Integer.parseInt(System.console().readLine() );;
    double Conversion = 1000;
    
    double Kb = (Mb * Conversion);
    System.out.printf("El resultado de la conversión es " + Kb + "Kb");
 }
}
