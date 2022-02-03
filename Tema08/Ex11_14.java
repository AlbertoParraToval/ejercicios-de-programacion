import funciones.Figuras;
import funciones.Matematicas;
/**
 * PAGINA DE PRUEBA EJERCICIO 7
 */

public class Ex11_14 {
  public static void main(String[] args) {
    System.out.println("El programa nos dara la posición  de un ese dígito en el número introducido.");
    //Pedimos al usuario que nos deiga un numero y un digito
    System.out.print("Introduce un numero por teclado: ");
    int numero = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce un digito por teclado: ");
    int digito = Integer.parseInt(System.console().readLine());
    
    System.out.println(funciones.Matematicas.NDigitos(numero, digito));
  }
}


