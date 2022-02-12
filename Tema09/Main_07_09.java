import Ex07_09.Zona;
public class Main_07_09 {
  public static void main(String[] args) {
    System.out.println("ExpoCoches Campanillas");
    System.out.println("=======================");

    Zona zona1 = new Zona(1000); //Zona principal
    Zona zona2 = new Zona(200); //Zona de compra-venta
    Zona zona3 = new Zona(25); //Zona vip

    System.out.println("Que desea hacer: ");
    System.out.print("a) Mostrar numero de entradas libres");
    System.out.println(" ");
    System.out.print("b) Vender entradas ");
    System.out.println(" ");
    System.out.println("c) Salir ");

    String opcion = System.console().readLine();

    if (opcion.equals("a")){
      zona1.getEntradasPorVender();
      System.out.println(zona1);
    }
  }
}
