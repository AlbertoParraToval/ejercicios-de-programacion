/**
 *  Programa que cuenta cuantos numeros positivos y negativos has introducido
 *
 * @author Alberto Parra Toval
 */
public class Ejercicio13 {
    public static void main(String[] args) {
      System.out.println("Programa que lee diez numeros y determine los negativos/positivos");
      System.out.println("Introduce diez numeros: ");
      int negativos = 0; //Contador de numeros negativos
      int positivos = 0; //Contador de numeros positivos
      //Definimos el numero maximo hasta 10 veces
      for (int numeroMax = 0; numeroMax < 10; numeroMax++) {
        //Le ponemos la condicion que si el numero introducido es mayor que 0 que sume al contador de los positivos
        if ( Integer.parseInt(System.console().readLine()) > 0) {
          positivos++;
        } else {   // Sino pues que sume al contador de los negativos
          negativos++;
        }
      }
      System.out.println("Los numeros positivos son " + positivos + " y los números negativos son " + negativos);
  }
}