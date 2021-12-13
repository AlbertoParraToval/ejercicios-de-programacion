/**
 *  Realiza una programa que calcule las horas transcurridas entre dos horas de
dos días de la semana. No se tendrán en cuenta los minutos ni los segundos.
El día de la semana se puede pedir como un número (del 1 al 7) o como una
cadena (de lunes a domingo). Se debe comprobar que el usuario introduce
los datos correctamente y que el segundo día es posterior al primero
.

 * @author Alberto Parra Toval
 */
public class Ex63_05 {
    public static void main(String[] args) {
        System.out.println("El programa calcula el factorial de un número entero leído por teclado.");
        System.out.print("Introduce un numero por teclado: ");
        int numero = Integer.parseInt(System.console().readLine()) ;
        int factorial = 1;
        int multiplicarFactorial=1;
        int contador = 1;
        while (contador <= numero){ // Mientras contador sea menor o igual
            factorial=contador;
            multiplicarFactorial = multiplicarFactorial * factorial; //  multiplicarFactorial = facotira * el mismo
            System.out.println(contador +" = "+ multiplicarFactorial); // Mostramos el contador y el resultado de multiplicarFactorial
            contador++; //Le sumo al contador para que se acabe el bucle
            }
    }
}