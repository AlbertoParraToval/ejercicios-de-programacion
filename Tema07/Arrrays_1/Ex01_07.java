/** Define un array de 12 números enteros con nombre num y asigna los valores
según la tabla que se muestra a continuación. Muestra el contenido de todos
los elementos del array. ¿Qué sucede con los valores de los elementos que no
han sido inicializados?
 *
 * @author Alberto Parra Toval
 */
public class Ex01_07 {
    public static void main(String[] args) {
        System.out.println("[Programa que muestra y asigna valores a una tabla que se muestra acontinuación ]");
        //DEFINO LA LONGITUD DE MI ARRAY
        int[] num = new int[12];
        num[0] = 39; 
        num[1] = -2;
        num[4] = 0;
        num[6] = 14;
        num[8] = 5;
        num[9] = 120;
        //MUESTRO POR PANTALLA LOS DATOS QUE SI ESTÁN Y LOS QUE NO ESTÁN SE TRANSFORMAN EN CEROS.
        for (int i = 0; i < num.length; i++) {
            System.out.println("Indice:" + i + ":" + num[i]);
        }
    }
}

