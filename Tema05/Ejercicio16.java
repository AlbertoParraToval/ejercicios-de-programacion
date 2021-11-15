/**
 *  Escribe un programa que diga si un número introducido por teclado es o no
    primo. Un número primo es aquel que sólo es divisible entre él mismo y la
    unidad
 * @author Alberto Parra Toval
 */
public class Ejercicio16 {
    public static void main(String[] args) {
        System.out.println("[Numeros Primos o no Primos]");
        System.out.println("----------------------------");
        System.out.print("Introduzca un número entero: ");
        int numeroIntroducido = Integer.parseInt(System.console().readLine());
        boolean numeroPrimo = true;
        
        for (int i = 2; i < numeroIntroducido; i++) {
          if ((numeroIntroducido % i) == 0) {
            numeroPrimo = false;
          }
        }
            
        if (numeroPrimo) {
          System.out.println("El número introducido es primo.");
        } else {
          System.out.println("El número introducido no es primo.");
        }
      }
    }