/** Escribe un programa que muestre por pantalla 100 números enteros separados
por un espacio. Los números deben estar generados de forma aleatoria en
un rango entre 10 y 200 ambos incluidos. Los primos deben aparecer entre
almohadillas (p. ej. #19#) y los múltiplos de 5 entre corchetes (p. ej. [25]).
 *
 * @author Alberto Parra Toval
 */
public class Ex25_06 {
    public static void main(String[] args) {
        System.out.println("[Programa que muestra 50 numeros entre el -100 y el 200 , su max par y la media de todos]");
        // Que se generen 100 numeros
        for (int i = 0; i < 100; i++) {
            int numero = (int)(Math.random() * 191) + 10;
            boolean esPrimo = true; // Definimos esPrimo como true d
            for (int j = 2; j < numero; j++) { // Si dividimos numero entre j que es igual a 2 y su resultado da 0, esPrimo es igual a false 
                if ((numero % j) == 0) {
                esPrimo = false;
                }
            }
            
            // Si esPrimo pues que muestre el numero entre almohadillas
            if (esPrimo) {
                System.out.print(" #" + numero + "# ");
            } else if ((numero % 5) == 0) {   // Si es divisible entre 5 que se muestre el numero en corchetes
                System.out.print(" [" + numero + "] ");
            } else {
                System.out.print(" " + numero + " "); // Que se muestren los demas numeros
            }
        }
    }
}
    
    
