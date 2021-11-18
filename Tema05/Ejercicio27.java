/**
 *  Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay entre 1 y un número leído por teclado
 * 
 * @author Alberto Parra Toval
 */
public class Ejercicio27 {
  public static void main(String[] args) {
    System.out.println("Ejercicio que muestra las suma de 100 numeros a partir de uno");
    int numeroIntroducido = 0;

    do {
        System.out.print("Introduzca un numero entero positivo: ");
        numeroIntroducido = Integer.parseInt(System.console().readLine());
    
        if(numeroIntroducido < 1) {
      System.out.println("El número introducido no es correcto.");
        }
    } while (numeroIntroducido < 1);

    int multiplo = 3;
    for(int n = numeroIntroducido; n < numeroIntroducido ; n++) {
      n += multiplo;
      System.out.println(numeroIntroducido + " ");
    }
    System.out.println(" ");
  }
}