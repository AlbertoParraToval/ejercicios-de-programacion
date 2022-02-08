import funciones.funciones_EX14;
/**
 * Programa que le quita a un número n dígitos por delante (por la
 * izquierda)
 * 
 * @author Alberto Parra Toval
 */

public class Ex09_14 {
  public static void main(String[] args) {
    System.out.println("El programa nos dara la posición  de un ese dígito en el número introducido.");
    //Pedimos al usuario que nos deiga un numero y un digito
    System.out.print("Introduce un numero por teclado: ");
    int numero = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce un digito por teclado: ");
    int digito = Integer.parseInt(System.console().readLine());
    
    System.out.println(funciones.funciones_EX14.quitaPorDelante(numero, digito));
  }
}


