/**
* Realiza un conversor de Kb a Mb.
*
* @author Alberto Parra 
*/
public class Ejercicio11 {
public static void main(String[] args) {
	System.out.println("Este programa convierte de kb a Mb.");
	//Introducir el valor a convertir
	System.out.print("Introduce el valor en kb: ");
    int kb = Integer.parseInt(System.console().readLine() );;
    double Conversion = 1000;
    //Realizamos la conversión
    double Mb = (kb / Conversion);
    System.out.printf("El resultado de la conversión es " + Mb + "Mb");
 }
}
