/*
 * Realiza un programa que calcule el precio de unas entradas de cine en función
	del número de personas y del día de la semana. El precio base de una entrada
	son 8 euros. El miércoles (día del espectador), el precio base es de 5 euros. Los
	jueves son el día de la pareja, por lo que la entrada para dos cuesta 11 euros.
	Con la tarjeta CineCampa se obtiene un 10% de descuento. Si un jueves, un
	grupo de 6 personas compran entradas, el precio total sería de 33 euros ya
	que son 3 parejas; pero si es un grupo de 7, pagarán 3 entradas de pareja más
	1 individual que son 41 euros (33 + 8).
 * 
 * 
 * */
import java.util.Scanner;

public class Ejercicio26Tema4 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Venta de entradas CineCampa");
    //Preguntamos el número de entradas
    System.out.print("Número de entradas: ");
    int entradas = Integer.parseInt(s.nextLine());
    //Preguntamos el dia de la semana
    System.out.print("Día de la semana: ");
    String dia = s.nextLine();
    //Tiene tarjeta mediante una boolean
    System.out.print("¿Tiene tarjeta CineCampa? (s/n): ");
    boolean tieneTarjeta = (s.nextLine()).equals("s");
    

    //Definimos las variables entradasIndividuales, entradasDePareja y total, descuento y aPagar
    int entradasIndividuales = entradas;
    double precioEntradaIndividual = 8;
    int entradasDePareja = 0;
    double total = 0;
    double descuento = 0;
    double aPagar = 0;

    //Usamos un switch para saber que dia vamos y si cae en algun dia que haya descuento 
    switch (dia) {
      case "miércoles":
      case "miercoles":
        precioEntradaIndividual = 5;
      case "jueves":
        entradasDePareja = entradas / 2;
        entradasIndividuales = entradas % 2;
      default:
    }

    //la variable total = precioEntradaIndividual * entradasIndividuales
    total = precioEntradaIndividual * entradasIndividuales;
    //varible total = 11 * entradasPareja
    total += 11 * entradasDePareja;
    
    //Un if para saber si tiene tarjeta o no
    if(tieneTarjeta) {
      descuento = total * 0.1;
    }
    //La operacion del descuento
    aPagar = total - descuento;

    System.out.println("\nAquí tiene sus entradas. Gracias por su compra.");

    //Se muestra el desgolaso final
    if (entradasDePareja > 0) {
      System.out.printf("Entradas de pareja            %2d\n", entradasDePareja);
      System.out.printf("Precio por entrada de pareja  %5.2f €\n", 11.0);
    }

    if (entradasIndividuales > 0) {
      System.out.printf("Entradas individuales         %2d\n", entradasIndividuales);
      System.out.printf("Precio por entrada individual %5.2f €\n", precioEntradaIndividual);
    }

    System.out.printf("Total                         %5.2f €\n", total);
    System.out.printf("Descuento                     %5.2f €\n", descuento);
    System.out.printf("A pagar                       %5.2f €\n", aPagar);
  }
}