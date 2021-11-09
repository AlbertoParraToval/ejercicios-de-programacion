/**
 * Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle while.
 *
 * @author Alberto Parra Toval
 */
public class Ejercicio2Tema5 {
    public static void main(String[] args) {
        int n = 0;
        while (n < 101) {  
        n += 5;
        System.out.println("n: " + n);
        System.out.println("--------");
        }
        //Se ejecuta una vez fuera de la condición impuesta por el bucle
        System.out.println("Fin");
    }
}
