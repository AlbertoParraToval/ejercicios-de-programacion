/**
 *  Escribe un programa que dados dos números, uno real (base) y un entero
    positivo (exponente), saque por pantalla todas las potencias con base el
    numero dado y exponentes entre uno y el exponente introducido. No se deben  
    utilizar funciones de exponenciación. Por ejemplo, si introducimos el 2 y el 5,
    se deberán mostrar 2^1, 2^2, 2^3, 2^4 y 2^5
.

 * @author Alberto Parra Toval
 */
public class Ejercicio15 {
    public static void main(String[] args) {
        System.out.println("[Ejercicio Base y Exponente]");
        System.out.println("----------------------------");
        System.out.print("Introduzca la base: ");
        int base = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca el exponente: ");
        int exponenteIntroducido = Integer.parseInt(System.console().readLine());
    
       for (int i = 1; i <= exponenteIntroducido; i++) {
        System.out.println("El resultado es: " + base + "^" + i);
        System.out.println("--------------------");
       }
    }
}