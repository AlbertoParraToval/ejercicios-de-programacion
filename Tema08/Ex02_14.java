import funciones.Figuras;
import funciones.Matematicas;
/**
 * PAGINA DE PRUEBA EJERCICIO 2
 */
public class Ex02_14 {
  public static void main(String[] args) {
      System.out.println("Programa que te dice si un numero es primo o no");
      System.out.println("-----------------------------------------------");
      
      System.out.println("True = EsPrimo y False = No EsPrimo");      
      System.out.print("Introduce el numero que quieras: ");
      int numero = Integer.parseInt(System.console().readLine()); //Pido un numero por pantalla

      System.out.println(funciones.Matematicas.esPrimo(numero)); //Llamada a la funcion del paquete matematicas
  }
}


