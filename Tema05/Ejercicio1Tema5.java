/**
 * Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle for.
 *
 * @author Alberto Parra Toval
 */
public class Ejercicio1Tema5 {
    public static void main(String[] args) {
      for (int n = 0; n < 101; n += 5 ) {    
      System.out.println("n: " + n);
      System.out.println("--------");
      }
      //Se ejecuta una vez fuera de la condición impuesta por el bucle
      System.out.println("Fin");
    }
}

  //Opción 2
  //for(int n = 0; n <= 20; n++){
    //if (n % 5 == 0){
      //System.out.println(n);
    //}
  //}