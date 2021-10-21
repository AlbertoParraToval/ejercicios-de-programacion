/**
* Realiza un programa que calcule la nota que hace falta sacar en el segundo
* examen de la asignatura Programación para obtener la media deseada. Hay
* que tener en cuenta que la nota del primer examen cuenta el 40% y la del
* segundo examen un 60%.
*   
* 	   Ejemplo 1:
*      Introduce la nota del primer examen: 7
*      ¿Qué nota quieres sacar en el trimestre? 8.5
*      Para tener un 8.5 en el trimestre necesitas sacar un 9.5 en el segundo examen.
* 
*      Ejemplo 2:
*      Introduce la nota del primer examen: 8
*      ¿Qué nota quieres sacar en el trimestre? 7
*      Para tener un 7 en el trimestre necesitas sacar un 6.33 en el segundo examen. 
*
* @author Alberto Parra 
*/
public class Ejercicio12 {
public static void main(String[] args) {
	System.out.println("Problemas");
	
	//Introducimos la nota del primer examen
	System.out.print("Introduce la nota del primer examen: ");
    double examen1 = Double.parseDouble(System.console().readLine());

    //La nota que deseamos
    System.out.print("¿Qué nota quieres sacar en el trimestre? ");
    double notaFinal = Double.parseDouble(System.console().readLine());
    
	//La factorización del examen1 con la notaFinal deseada.
	double examen2 = ((notaFinal * 100) - (examen1 * 40)) / 60;
    
    System.out.println("Para poder tener un " + notaFinal + " en el trimestre, necesitas sacar al menos  " + examen2 + " en el segundo examen.");	    
 }
}
