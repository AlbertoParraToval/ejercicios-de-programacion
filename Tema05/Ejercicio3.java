/**
 * Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle do-while.
 *
 * @author Alberto Parra Toval
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        int n = 0;
        do { 
        n += 5;
        System.out.println("n: " + n);
        System.out.println("--------");
        } while (n < 101);

        //Se ejecuta una vez fuera de la condición impuesta por el bucle
        System.out.println("Fin");
    }
}