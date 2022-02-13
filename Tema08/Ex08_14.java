import funciones.funciones_EX14;
/**
 * Programa que le quita a un numero n di­gitos por detras (por la
 * derecha)
 * 
 * @author Alberto Parra Toval
 */

public class Ex08_14 {
  public static void main(String[] args) {
    System.out.println("Programa que le quita a un numero a n digitos por detras");
    System.out.println("--------------------------------------------------------");
    System.out.print("Introduce un numero por teclado: ");
    int numero = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce un digito por teclado: ");
    int digito = Integer.parseInt(System.console().readLine());
    
    System.out.println(funciones.funciones_EX14.quitaPorDetras(numero, digito));
  }
}


