/** Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6. El
programa intentará adivinar el número que estás pensando - un número entre 0
y 100 - teniendo para ello 5 oportunidades. En cada intento fallido, el programa
debe preguntar si el número que estás pensando es mayor o menor que el que
te acaba de decir.
 * @author Alberto Parra Toval
 */
public class Ex14_06 {
    public static void main(String[] args) {
        int oportunidades = 5;
        int numeroIntroducido = 45;
        boolean acertado = false;
        int numeroMisterioso = (int)(Math.random() * 100);
        
        System.out.println("Programa que intenta adivinar un numero del 0 al 100");
    
        do {
            numeroMisterioso = (int)(Math.random() * 100);
            if ( (numeroMisterioso > numeroIntroducido) && (oportunidades > 0) ){
            System.out.println("El numero que estoy pensando es menor que " + numeroMisterioso);
            System.out.println("Te quedan " + oportunidades + " oportunidades.");
            }
        
            if ( (numeroMisterioso < numeroIntroducido) && (oportunidades > 0) ){
            System.out.println("El numero que estoy pensando es mayor que " + numeroMisterioso);
            System.out.println("Te quedan " + oportunidades + " oportunidades.");
            }
        
            if (numeroIntroducido == numeroMisterioso) {
            acertado = true;
            System.out.println("¡Enhorabuena! ¡has acertado!");
            }
            oportunidades--;
        } while (!acertado && (oportunidades > 0));
        
        if (!acertado) {
            System.out.println("Lo siento, no has acertado, el numero que estaba pensando era el " + numeroIntroducido);
        }
    }
}

