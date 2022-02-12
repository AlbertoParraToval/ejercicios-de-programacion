import funciones.funciones_EX14;
public class Ex016_28 {
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE MUESTRA LOS NÚMEROS CAPICÚA QUE HAY ENTRE EL 1 Y EL 99999");
    System.out.println("-----------------------------------------------------------------------");
    System.out.println(" ");

    System.out.println("Los números capicúa que hay entre el 1 y el 99999 son:\n");
    //comrpobar si un nuemro es capicua
    for (int i = 1;i <= 99999; i++) {
      if (funciones.funciones_EX14.esCapicua(i)) {
        System.out.print(i + " ");
      }
    }
  }
}
