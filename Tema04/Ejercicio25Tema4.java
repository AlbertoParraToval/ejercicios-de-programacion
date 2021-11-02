/*	La tienda online BanderaDeEspaña.es vende banderas personalizadas de la
	máxima calidad y nos ha pedido hacer un configurador que calcule el precio
	según el alto y el ancho. El precio base de una bandera es de un céntimo de
	euro el centímetro cuadrado. Si la queremos con un escudo bordado, el precio
	se incrementa en 2.50 € independientemente del tamaño. Los gastos de envío
	son 3.25 €. El IVA ya está incluido en todas las tarifas.
*/
public class Ejercicio25Tema4 {
  public static void main(String[] args) {
    System.out.print("Introduzca la altura de la bandera en cm: ");
    double alto = Double.parseDouble(System.console().readLine());

    System.out.print("\nAhora introduzca la anchura en cm: ");
    double ancho = Double.parseDouble(System.console().readLine());

    System.out.print("\n¿Quiere el escudo bordado? (s/n): ");
    String bordado = System.console().readLine();

    if( alto < 0 || ancho < 0 || bordado.equals("s") && bordado.equals("n")){
      System.out.println("Has introducido mal los datos");
    } else{
      System.out.println("\nGracias por tu compra. Aquí tienes el desglose");
      
      double area = ancho * alto;
      double precioPorArea = area / 100;
      
      System.out.print("Bandera de " + area + "cm²:");
      System.out.printf("%8.2f€\n", precioPorArea);
      
      double precioBordado = 0;
      if(bordado.equals("s")){
        precioBordado = 2.50;
        System.out.printf("Con escudo: %16.2f€\n", precioBordado);
      }
      double precioDeEnvio = 3.25;
      double precioFinal = precioPorArea + precioDeEnvio + precioBordado;
      System.out.printf("Gastos envío: %14.2f€\n", precioDeEnvio);
      System.out.printf("Total: %22.2f€\n", precioFinal);
		}
  }
}
