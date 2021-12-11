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
        System.out.print("Introduzca un numero entero: ");
        int numeroIntroducido = Integer.parseInt(System.console().readLine());
        boolean numeroPrimo = true;
        
        // Definimos que i=2 para ahora dividirlo entre nuestro numero introducido y que si el resultado es == 0, numeroPrimo = false
        for (int i = 2; i < numeroIntroducido; i++) {
          if ((numeroIntroducido % i) == 0) {
            numeroPrimo = false;
          }
        }
        
        //Mostramos el resultado de la operacion anterior
        if (numeroPrimo) {
          System.out.println("El numero introducido es primo."); // El numero introducido al dividirlo por i no ha dado 0
        } else {
          System.out.println("El numero introducido no es primo.");// El numero introducido al dividirlo por i ha dado 0
        }
      }
    }