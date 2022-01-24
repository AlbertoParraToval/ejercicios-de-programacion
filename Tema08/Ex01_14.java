import funciones.Figuras;
import funciones.Matematicas;
/**
 * PAGINA DE PRUEBA EJERCICIO 1
 */

public class Ex01_14 {
  public static void main(String[] args) {
      System.out.println("Programa que dice si un numero es capicua o no");
      int numero = Integer.parseInt(System.console().readLine()); //Pedimos un numero
      if ((funciones.Matematicas.esCapicua(numero))) { //Ejecutamos nuestra funcion en el paquete matematicas.esCapicua
        System.out.println("El numero es capicua");
      } else {
        System.out.println("El numero no es capicua");
      }
  }
}


