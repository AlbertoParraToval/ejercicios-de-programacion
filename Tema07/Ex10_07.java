/** Escribe un programa que lea 10 números por teclado y que luego los muestre
en orden inverso, es decir, el primero que se introduce es el último en mostrarse
y viceversa.
 *
 * @author Alberto Parra Toval
 */
public class Ex10_07 {
    public static void main(String[] args) {
        System.out.println("[Programa que muestra y asigna valores a una tabla que se muestra acontinuación donde el primer numero es el ultimo en mostrarse ]");
        //DEFINO EL TAMAÑO DE MI ARRAY 
        int num[] = new int[11];
        //lE PIDO AL USUARIO QUE INTRODUZCA 10 NUMEROS
        System.out.println("Introduce 10 numero y pulsa INTRO: ");
        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(System.console().readLine());
        }
        //MUESTRO LOS NUMEROS EN PANTALLA DONDE EL ULTIMO ES EL PRIMERO Y EL PRIMERO ES MOSTRADO EL ULTIMO.
        for (int j = 10; j < num.length; j--) {
            System.out.println("Numero " + j + " = " + num[j]);
        }
    }
}

