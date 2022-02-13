import funciones.funciones_EX14;
/**
 * Escribe un programa que devuelva por pantalla el menor número primo
 * que sea mayor a un número introducido
 * 
 * @author Alberto Parra Toval
 */
public class Ex03_14 {
  public static void main(String[] args) {
    System.out.println("Programa que devuelve un menor primo que es mayor al numero introducido");
    System.out.println("Introduce el numero que desees: ");
    int numero = Integer.parseInt(System.console().readLine());
    System.out.println("El menor numero primo que sea mayor a " + numero + " es " + funciones.funciones_EX14.siguientePrimo(numero));
      
  }
}



