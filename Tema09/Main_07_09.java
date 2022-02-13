import Ex07_09.Zona;

public class Main_07_09 {
  public static void main(String[] args) {
    System.out.println("ExpoCoches Campanillas");
    System.out.println("=======================");

    Zona principal = new Zona(1000);
    Zona compraVenta = new Zona(200);
    Zona vip = new Zona(25);

    int opcion = 0;
    int opcion2 = 0;
    int n = 0;
    // Que lo haga una y otra vez para que al mostrar el numero de entradas en la opcion 1 poder volver a elegir la opcion
    do {
      System.out.println("1. Mostrar número de entradas libres");
      System.out.println("2. Vender entradas");
      System.out.println("3. Salir");
      System.out.print("Elige una opción: ");
      opcion = Integer.parseInt(System.console().readLine());
      System.out.println(" ");

      if (opcion == 1) {
        System.out.println("\n\nEn la zona principal hay " + principal.getEntradasPorVender());
        System.out.println("En la zona de compra venta hay " + compraVenta.getEntradasPorVender());
        System.out.println("En la zona vip hay " + vip.getEntradasPorVender());
        System.out.println();
      }

      if (opcion == 2) {
        System.out.println("\n\n1. Principal");
        System.out.println("2. Compra-venta");
        System.out.println("3. Vip");
        System.out.print("Elige la zona para la que quieres comprar las entradas: ");

        opcion2 = Integer.parseInt(System.console().readLine());

        System.out.print("¿Cuántas entradas quieres?");
        n = Integer.parseInt(System.console().readLine());

        // Dentro de la opcion 2 para poder saber que tipo de entrada quiere comprar
        switch (opcion2) {
          case 1:
            principal.vender(n);
            System.out.println();
            break;
          case 2:
            compraVenta.vender(n);
            System.out.println();
            break;
          case 3:
            vip.vender(n);
            System.out.println();
            break;
          default:
        }
      }
    } while (opcion < 3); // Menu principal
  }
}