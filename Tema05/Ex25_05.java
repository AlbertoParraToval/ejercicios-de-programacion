/**
 *  Programa te pedira un numero y te lo leera al reves
.

 * @author Alberto Parra Toval
 */
public class Ex25_05 {
    public static void main(String[] args) {
        System.out.println("El programa leera un numero y mostrara ese numero al reves.");
        // Pedimos al usuario un numero
        System.out.print("Introduce un numero por teclado: ");
        int n = Integer.parseInt(System.console().readLine()) ;
        int voltear = 0;
        while (n > 0){
            //Voltear lo multiplicamos por 10 situandolo en el digito sigueinte y le sumamos la division del numero etre 10
            voltear = (voltear * 10) + (n %10);
            n /= 10; // Al numero le dividimos 10 para situalrnos en la posicion 1
        }
        //Mostramos el resultado por pantalla
        System.out.println("La numero con el orden distinto es: " + voltear);
    }
}