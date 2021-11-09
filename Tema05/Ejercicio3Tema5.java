/**
 * Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle do-while.
 *
 * @author Alberto Parra Toval
 */
public class Ejercicio3Tema5 {
    public static void main(String[] args) {
        int suma;
        int n = 0;
        while (n < 101) { 
            suma += 5;
        System.out.println("n: " + n);
        System.out.println("--------");
        }
        //Se ejecuta una vez fuera de la condición impuesta por el bucle
        System.out.println("Fin");
    }
}