import funciones.funciones_EX14;
/**
 * Escribe un programa que pida una base y un exponente (entero positivo) y que
 * calcule la potencia. 
 * 
 * @author Alberto Parra Toval
 */
public class Ex04_14 {
  public static void main(String[] args) {
    System.out.println("[Ejercicio Base y Exponente]");
    System.out.println("----------------------------");
    
    System.out.print("Introduzca la base: ");
    int base = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca el exponente: ");
    
    int exponenteIntroducido = Integer.parseInt(System.console().readLine());
    System.out.println("El resultado es:");
    System.out.println(funciones.funciones_EX14.potencia(base, exponenteIntroducido));
    }
  }



