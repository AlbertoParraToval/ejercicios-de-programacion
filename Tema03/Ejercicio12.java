/**
* Realiza un programa que calcule la nota que hace falta sacar en el segundo
  examen de la asignatura Programación para obtener la media deseada. Hay
  que tener en cuenta que la nota del primer examen cuenta el 40% y la del
  segundo examen un 60%.
*
* @author Alberto Parra 
*/
public class Ejercicio12 {
public static void main(String[] args) {
	System.out.println("Este programa convierte de kb a Mb.");
	
	System.out.print("Introduce el valor en kb: ");
    int kb = Integer.parseInt(System.console().readLine() );;
    double Conversion = 1000;
    
    double Mb = (kb / Conversion);
    System.out.printf("El resultado de la conversión es " + Mb + "Mb");
 }
}
