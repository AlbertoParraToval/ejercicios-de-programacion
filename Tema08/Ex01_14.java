import funciones.funciones_EX14;
/**
 * Escribe un programa que diga si un n?mero introducido por teclado es o no
 * capic?a. Los n?meros capic?a se leen igual hacia delante y hacia atr?s
 * 
 * @author Alberto Parra Toval
 */
public class Ex01_14 {
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE DICE SI UN NUMERO ES O NO CAPICUA");
    System.out.println("-----------------------------------------------");

    System.out.print("Introduce el numero que desees: ");
    long num = Long.parseLong(System.console().readLine());
    System.out.println();

    if (funciones.funciones_EX14.esCapicua(num)) {
      System.out.println(num + " es capicUa");
    } else {
      System.out.println(num + " no es capicUa");
    }
  }
}


