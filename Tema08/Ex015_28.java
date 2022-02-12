import funciones.funciones_EX14;
/**
 * Muestra los n�meros primos que hay entre 1 y 1000.
 * 
 * @author Alberto Parra Toval
 */
public class Ex015_28 {
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE MUESTRA LOS NÚMEROS PRIMOS QUE HAY ENTRE EL 1 Y EL 1000");
    System.out.println("---------------------------------------------------------------------");
    System.out.println(" ");

    System.out.println("Los números primos que hay entre el 1 y el 1000 son:\n");
    //Los numeros que me piden pues que se repita hasta 1000
    for(int i = 1;i<=1000;i++) {
      if (funciones.funciones_EX14.esPrimo(i)) {
        System.out.print(i + " ");
      }
    }
  }
}
