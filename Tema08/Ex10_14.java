import funciones.funciones_EX14;
/**
 * PAGINA DE PRUEBA EJERCICIO 7
 */

public class Ex10_14 {
  public static void main(String[] args) {
    System.out.println("El programa nos dara la posición  de un ese dígito en el número introducido.");
    //Pedimos al usuario que nos deiga un numero y un digito
    System.out.print("Introduce un numero por teclado: ");
    long numero = Long.parseLong(System.console().readLine());
    System.out.print("Introduce un digito por teclado: ");
    int digito = Integer.parseInt(System.console().readLine());
    
    System.out.print("El nuevo número es " + funciones.funciones_EX14.quitaPorDelante(numero, digito));
  }
}


