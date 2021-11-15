/**
 *  Escribe un programa que obtenga los números enteros comprendidos entre dos
    números introducidos por teclado y validados como distintos, el programa debe
    empezar por el menor de los enteros introducidos e ir incrementando de 7 en
    7.
.

 * @author Alberto Parra Toval
 */
public class Ejercicio18 {
    public static void main(String[] args) {
        System.out.println("[Numeros enteros comprendidos entre dos números]");
        System.out.println("----------------------------------");
        System.out.print("Introduzca un número entero positivo: ");
        int primerNumero = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca un número entero positivo: ");
        int segundoNumero = Integer.parseInt(System.console().readLine());
        if (primerNumero == segundoNumero) {
            System.out.println("Los números introducidos no son correctos.");
        }
        int aux;

        if (primerNumero > segundoNumero) {
            aux = primerNumero;
            primerNumero = segundoNumero;
            segundoNumero = aux;
          }         
        for(int i = primerNumero; i <= segundoNumero; i += 7) {
            System.out.print(i + " ");
        }         
        
        System.out.println();
    }
}
