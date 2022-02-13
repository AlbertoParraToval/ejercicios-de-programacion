import funciones.funciones_EX14;
/**
 * Programa que forma un numero nuevo a partir de uno y añadiendole otro
 * 
 * @author Alberto Parra Toval
 */
public class Ex12_14 {
  public static void main(String[] args) {
    System.out.println("Programa que forma un numero nuevo a partir de uno y añadiendole otro");
    //Pedimos al usuario que nos deiga un numero y un digito
    System.out.print("Introduce un numero por teclado: ");
    Long numero = Long.parseLong(System.console().readLine());
    System.out.print("Introduce el numero que quieras añadir por delante: ");
    int digito = Integer.parseInt(System.console().readLine());
    
    System.out.println(funciones.funciones_EX14.pegaPorDelante(numero, digito));
  }
}


