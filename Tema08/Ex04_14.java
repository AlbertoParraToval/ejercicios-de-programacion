import funciones.Figuras;
import funciones.Matematicas;
/**
 * PAGINA DE PRUEBA EJERCICIO 4
 */
public class Ex04_14 {
  public static void main(String[] args) {
    System.out.println("[Ejercicio Base y Exponente]");
    System.out.println("----------------------------");
    // Pedimos al usuario que introduzca tanto la base como el exponente
    System.out.print("Introduzca la base: ");
    int base = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca el exponente: ");
    // Llamamos a nuestra funcion Potencia en el paquete matematicas y ponemos tanto la base como el exponente 
    int exponenteIntroducido = Integer.parseInt(System.console().readLine());
    System.out.println("El resultado es:");
    System.out.println(funciones.Matematicas.potencia(base, exponenteIntroducido));
    }
  }



