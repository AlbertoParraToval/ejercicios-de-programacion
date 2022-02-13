import funciones.funciones_EX14;
/**
 *  Devuelve el digito que esta en la posicion n de un número entero.
 * Se empieza contando por el 0 y de izquierda a derecha.
 * 
 * @author Alberto Parra Toval
 */

public class Ex07_14 {
  public static void main(String[] args) {
    System.out.println("El programa nos dara la posicion  de un ese digito en el número introducido.");
    //Pedimos al usuario que nos deiga un numero y un digito
    System.out.print("Introduce un numero por teclado: ");
    long numero = Long.parseLong(System.console().readLine());
    System.out.print("Introduce un digito por teclado: ");
    int digito = Integer.parseInt(System.console().readLine());
    
    System.out.println("El digito en la posicion numero " + digito + " es el " + funciones.funciones_EX14.digitoN(numero, digito));
  }
}


