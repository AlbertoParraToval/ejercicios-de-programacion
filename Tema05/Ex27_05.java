/**
 *  Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay entre 1 y un número leído por teclado
 * 
 * @author Alberto Parra Toval
 */
public class Ex27_05 {
  public static void main(String[] args) {
    System.out.println("El programa muestra, cuenta y suma los multiplos de 3 corprendidos entre 1 y el numero elegido por el usuario.");
    // Pedimos al usuario un numero
    System.out.print("Introduce un numero por teclado: ");
    int numero = Integer.parseInt(System.console().readLine()) ;
    //Definimos las variables
    int multiplo = 0;
    int sumarMultiplo=0;
    // Mientras multiplo sea menor que el numero que introduzcamos
    while (multiplo < numero){
      multiplo+=3;
      System.out.print(multiplo +" ");
      sumarMultiplo = sumarMultiplo + multiplo;
    }
    //Mostramos los resultados
    System.out.println(" ");
    System.out.print("La suma de los multiplos es: "+ sumarMultiplo +" .");
  }
}
