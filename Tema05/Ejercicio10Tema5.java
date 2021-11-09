/**
 *  Escribe un programa que calcule la media de un conjunto de números positivos
    introducidos por teclado. A priori, el programa no sabe cuántos números se
    introducirán. El usuario indicará que ha terminado de introducir los datos
    cuando meta un número negativo.
 *
 * @author Alberto Parra Toval
 */
public class Ejercicio10Tema5 {
    public static void main(String[] args) {
        System.out.println("Introduce los numeros que desees: ");
        int num = Integer.parseInt(System.console().readLine());  
        int numeros = 0;
        int suma = 0;
        while(num >= 0){
            System.out.println("Introduce el siguiente numero: ");
            num = Integer.parseInt(System.console().readLine());  
            numeros++;
            suma += num;
        }  
        System.out.println("La media de los numeros elegidos es de:" + (suma - num)/(numeros - 1));
    }
  }