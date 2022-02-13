import funciones.funciones_EX14;
/**
 * Realiza un programa que pida un numero por teclado y que luego muestre ese
 * numero al reves.
 * 
 * @author Alberto Parra Toval
 */
public class Ex06_14 {
  public static void main(String[] args) {
      System.out.println("Programa que le da la vuelta a un numero entero");
      System.out.println("----------------------------------------------------");
      System.out.print("Introduce el numero que desees: ");
      int n = Integer.parseInt(System.console().readLine());
      System.out.println(funciones.funciones_EX14.voltea(n));
  }
}


