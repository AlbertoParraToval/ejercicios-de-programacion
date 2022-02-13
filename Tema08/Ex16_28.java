import funciones.funciones_EX14;
/**
 * Programa que calcula el numero de capicuas que hay entre 1 y 99999 
 * 
 * @author Alberto Parra Toval
 */
public class Ex16_28 {
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE MUESTRA LOS NUMEROS CAPICUAS QUE HAY ENTRE EL 1 Y EL 99999");
    System.out.println("-----------------------------------------------------------------------");
    System.out.println(" ");

    System.out.println("Los numeros capicua que hay entre el 1 y el 99999 son:");
    //comrpobar si un nuemro es capicua
    for (int i = 1;i <= 99999; i++) {
      if (funciones.funciones_EX14.esCapicua(i)) {
        System.out.print(i + " ");
      }
    }
  }
}
