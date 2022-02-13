import funciones.funciones_EX14;
/**
 * Pega dos numeros que introduzcamos para formar 1 soltero
 * 
 * @author Alberto Parra Toval
 */

public class Ex14_14 {
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE PEGA DOS NUMEROS PARA FORMAR UNO");
    System.out.println("----------------------------------------------");
    
    System.out.print("Introduzca un numero entero, por favor: ");
    System.out.println(" ");
    long numero1 = Long.parseLong(System.console().readLine());
    System.out.println(" ");

    System.out.print("Introduzca otro numero entero, por favor: ");
    System.out.println(" ");
    long numero2 = Long.parseLong(System.console().readLine());
    System.out.println(" ");
  
    System.out.print("El nuevo numero es " + funciones.funciones_EX14.pegaPorDelante(numero2, (int)numero1));
  } 
}

