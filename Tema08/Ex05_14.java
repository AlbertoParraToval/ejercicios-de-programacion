import funciones.funciones_EX14;
/**
 * Realiza un programa que nos diga cuántos dígitos tiene un número introducido
 * por teclado. 
 *  
 * @author Alberto Parra Toval
 */

public class Ex05_14 {
  public static void main(String[] args) {
    System.out.println("Introduzca el numero que desee y le dire los digitos que tiene: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());
    System.out.println("Tiene " + funciones.funciones_EX14.digitos(numeroIntroducido) + " cifras");
  }
}




