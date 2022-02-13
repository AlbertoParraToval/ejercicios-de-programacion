import funciones.funciones_EX14;
/**
 * Pega por detras el numero que le digamos
 */

public class Ex11_14 {
  public static void main(String[] args) {
    System.out.println("El programa nos dara la posición  de un ese dígito en el número introducido.");
    //Pedimos al usuario que nos deiga un numero y un digito
    System.out.print("Introduce un numero por teclado: ");
    Long numero = Long.parseLong(System.console().readLine());
    System.out.print("Introduce el numero que quieras a�adir: ");
    int digito = Integer.parseInt(System.console().readLine());
    
    System.out.println(funciones.funciones_EX14.pegaPorDetras(numero, digito));
  }
}


