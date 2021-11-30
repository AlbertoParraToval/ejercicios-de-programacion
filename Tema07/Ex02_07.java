/** Define un array de 12 números enteros con nombre num y asigna los valores
según la tabla que se muestra a continuación. Muestra el contenido de todos
los elementos del array. ¿Qué sucede con los valores de los elementos que no
han sido inicializados?
 *
 * @author Alberto Parra Toval
 */
public class Ex02_07 {
    public static void main(String[] args) {
        System.out.println("[Programa que muestra y asigna valores a una tabla que se muestra acontinuación ]");
        //DEFINO MI ARRAY DE SIMBOLOS = 10
        String[] simbole = new String[10];
        simbole[0] = "a"; 
        simbole[1] = "x";
        simbole[4] = "@" ;
        simbole[6] = "''";
        simbole[7] = "'+'";
        simbole[8] = "Q";
        //MUESTRO POR PANTALLA EL ARRAY Y LOS INDICES NO DEFINIDOS SE DETERMINAN COMO NULL
        for (int i = 0; i < simbole.length; i++) {
            System.out.println("Indice:" + i + ":" + simbole[i]);
        }
    }
}

