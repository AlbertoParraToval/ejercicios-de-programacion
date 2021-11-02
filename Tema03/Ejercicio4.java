/**
* Escribe un programa que sume, reste, multiplique y divida dos números
  introducidos por teclado.
  
* @author Alberto Parra 
*/
public class Ejercicio4 {
public static void main(String[] args) {
	//Introducción de números
	System.out.println("Introduce un numero: ");
    int x = Integer.parseInt(System.console().readLine() );
    System.out.println("Introduce un numero: ");
    int y = Integer.parseInt(System.console().readLine() );
    
    //Suma
    int suma = (x + y);
    System.out.printf(" La suma de %d + %d es %d \n " ,x ,y ,suma );
    
    //Resta
    int resta = (x - y);
    System.out.printf("La resta de %d - %d es %d \n " ,x ,y ,resta );
    
    //Multiplicación
    int multiplicacion = (x * y );
    System.out.printf("La multiplicacion de %d - %d es %d \n " ,x ,y ,multiplicacion );
    
    //División
    double division = (double) x / (double) y;
    System.out.printf("La division es %d / %d es %f",x ,y ,division);


 }
}
