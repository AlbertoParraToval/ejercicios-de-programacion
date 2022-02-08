import funciones.funciones_EX14;
/**
 *  Escribe un programa que diga si un número introducido por teclado es o no
 * primo. Un número primo es aquel que sólo es divisible entre él mismo y la
 * unidad.
 * 
 * @author Alberto Parra Toval
 */

public class Ex02_14 {
  public static void main(String[] args) {
    System.out.println("Programa que te dice si un numero es primo o no");
      System.out.println("-----------------------------------------------");

      System.out.print("Introduce el numero que quieras: ");
      int numero = Integer.parseInt(System.console().readLine()); 

      if (funciones.funciones_EX14.esPrimo(numero)) {
        System.out.println("El "+ numero + " es primo");
      } else {
        System.out.println("El " + numero + " no es primo");
      }
  }
}



