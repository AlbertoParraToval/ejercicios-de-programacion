import Ex01_09.Caballo;

public class Main_01_09 {
  public static void main(String[] args) {
    /**
     * Implementa la clase Caballo vista en un ejercicio anterior. Pruébala creando
     * instancias y aplicándole algunos métodos.
     */
    System.out.println("EJERCICIO 1");
    System.out.print("===============");
    System.out.println();
    Caballo caballo1 = new Caballo();
    // El caballo es presentado
    caballo1.presenta();
    System.out.println();
    // Se determina la velocidad del caballo 1
    caballo1.velocidad();
    System.out.println();
  }
}