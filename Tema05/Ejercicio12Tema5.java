/**
 * Escribe un programa que muestre los n primeros términos de la serie de
    Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo es 1 y
    el resto se calcula sumando los dos anteriores, por lo que tendríamos que los
    términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144… El número n se debe
    introducir por teclado.
 *
 * @author Alberto Parra Toval
 */
public class Ejercicio12Tema5 {
    public static void main(String[] args) {
        System.out.println("Serie de Fibonacci");
        int numero;
        int fibo1;
        int fibo2;
        int i;
        // Ponemos la condición de que el numero introducido tiene que ser mayor que 1.
        do{
            System.out.println("Introduce numero mayor que 1: ");
             numero = Integer.parseInt(System.console().readLine());
        } while(numero <= 1);
        //Mostramos en pantalla los dos primeros numeros que son 1 y 1, nos apoyaremos en ellos.
        System.out.println("Los " + numero + " son los términos de la serie de Fibonacci son:");                 
        fibo1=1;
        fibo2=1;
        System.out.println(fibo1 + " ");
        //Con un for vamos sumando ambos números.
        for(i = 2; i <= numero; i++){
            System.out.println(fibo2 + " ");
            fibo2 = fibo1 + fibo2;
            fibo1 = fibo2 - fibo1;
        }
    }
}