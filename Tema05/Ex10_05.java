/**
 *  Escribe un programa que calcule la media de un conjunto de números positivos
    introducidos por teclado. A priori, el programa no sabe cuántos números se
    introducirán. El usuario indicará que ha terminado de introducir los datos
    cuando meta un número negativo.
 *
 * @author Alberto Parra Toval
 */
public class Ex10_05 {
    public static void main(String[] args) {
        // Defino tanto mi contador como la suma y pido la introduccion de un numero
        System.out.println("Introduce los numeros que desees: ");
        int num = Integer.parseInt(System.console().readLine());  
        int contador = 0;
        int suma = 0;
        // El programa seguira pidiendo numeros y sumando al contador mientras no introduzcamos un numero negativo
        while(num >= 0){
            System.out.println("Introduce el siguiente numero: ");
            num = Integer.parseInt(System.console().readLine());  
            contador++;
            suma += num;
        }  
        // Muestro la media de los numeros elegidos
        System.out.println("La media de los numeros elegidos es de:" + (suma - num)/(contador - 1));
        
    }
  }