import funciones.Figuras;
import funciones.Matematicas;
/**
 * PAGINA DE PRUEBA EJERCICIO 2
 */
public class Ex06_14 {
  public static void main(String[] args) {
      System.out.println("Programa que le da la vuelta a un numero entero");
      System.out.println("----------------------------------------------------");
      System.out.print("Introduce el numero que desees: ");
      int n = Integer.parseInt(System.console().readLine());
      System.out.println(funciones.Matematicas.voltea(n));
  }
}


