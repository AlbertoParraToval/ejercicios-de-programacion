/**
 * Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.
 * 
 * @author Alberto Parra Toval
 */
public class Ejercicio22 {
    public static void main(String[] args) {
        System.out.println("[Programa que recoge los numeros primos desde el 2 hasta el 100]");
        System.out.println("----------------------------------------------------------------");
        boolean esPrimo = true;
        
        //Definimos n = 2 y le ponemos la condicion de que no puede ser mayor que 100.
        for (int n = 2; n <= 100; n++) {
          esPrimo = true;
          //Definimos otra vez dicha condicion esta vez implementando un if que nos permite saber si el esPrimo es false o true.
          for (int i = 2; i < n; i++) {
            if (n % i == 0) {
              esPrimo = false;
            }
          }
          // Si es primo le decimos que nos muestre solo el número primo 
          if (esPrimo) {
            System.out.print(n + " ");
          }
        }
        //Los resultados se muestran en pantalla
        System.out.println();
    }
}