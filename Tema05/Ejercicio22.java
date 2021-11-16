/**
 * Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.
 * @author Alberto Parra Toval
 */
public class Ejercicio22 {
    public static void main(String[] args) {
        System.out.println("Programa que recoge los numeros primos desde el 2 hasta el 100");
        System.out.print("\n"); 
        int numInt = 2; 
      
        
        int contDivisores = 2;

        boolean pregPrimo = true;
        for (int i = numInt; i <= 101; i++) {
            i++;
            do {
                if (numInt % contDivisores == 0 && numInt != contDivisores) {
                pregPrimo = false;
            }
            contDivisores++;
            } while (contDivisores < numInt && pregPrimo == true);
            // Es menor que "<" porque np ùede ser el misom número
            if ( pregPrimo == true ) {
            System.out.print(numInt+" Es primo ");
            } else {
            System.out.print(numInt+" No es primo ");
            } 
        }
        
    }
}
   // Fin Primo