import funciones.Figuras;
import funciones.Matematicas;
/**
 * PAGINA DE PRUEBA EJERCICIO 5
 */

public class Ex05_14 {
  public static void main(String[] args) {
    System.out.println("Introduzca el numero que desee y le dire los digitos que tiene: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());
    System.out.println(funciones.Matematicas.digitos(numeroIntroducido));
  }
}




