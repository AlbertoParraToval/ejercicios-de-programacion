/**
 * Escribe un programa que calcule el factorial de un número entero leído por
 * teclado.
 * 
 * @author Alberto Parra Toval
 */
public class Ex28_05 {
  public static void main(String[] args) {
    System.out.println("El programa calcula el factorial de un numero entero leido por teclado.");
    System.out.print("Introduce un numero por teclado: ");
    int numero = Integer.parseInt(System.console().readLine()) ;
    int facto = 1;
    int multiplicarFactorial= 1;
    // Mientras facto menor al numero introducido +1 facto y definimos multiplicarFactorial
    while (facto < numero){
      facto++;
      multiplicarFactorial = multiplicarFactorial * facto;
    }
    //Mostramos el resultado por pantalla
    System.out.println(" ");
    System.out.print("El factorial de "+ numero +" es "+ multiplicarFactorial);
  }
}
