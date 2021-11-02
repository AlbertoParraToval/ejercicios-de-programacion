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
public class Ejercicio26Tema4 {
	System.out.print("Por favor, dinos cuantas personas sois: ");
    int personas = Integer.parseInt(System.console().readLine());

    System.out.print("Por favor, dinos que dia de la semana deseas ir: (1-7):");
    int dia = Integer.parseInt(System.console().readLine());

    System.out.print("¿Tienes la tarjeta de CineCam? (s/n):");
    String carnetSocio = System.console().readLine();

    double precio = 0;
    double precioPareja = 0;
    double total = 0;
    double descuento = 0;

    if(dia > 0 && dia < 8 && personas > 0 && carnetSocio.equals("s") || carnetSocio.equals("n")){

      System.out.println("Aquí están sus entradas. Gracias por su compra");

        switch(dia){
          
        case 1:
        case 2:
        case 5:
        case 6:
        case 7:
          precio = 8 * personas;
          break;

          case 3:
          precio = 5 * personas;
          break;
          
        case 4:
        if(personas % 2 == 0){
          precio = (personas / 2) * 11;
          System.out.printf("Entradas parejas: %24d\n", personas/2);
          System.out.printf("Precio por entrada pareja %20.2f€\n", precio);
          personas = 0;
        } else {
          precioPareja = (personas - 1 / 2) * 11;
          precio =  + 8;
          System.out.printf("Entradas parejas: %8d\n", (personas-1)/2);
          System.out.printf("Precio por entrada pareja %20.2f€\n", precioPareja);
          personas = 1;
        }
        break;
        
        default:
        System.out.println("has introducido mal el dia de la semana, por favor, que esté entre el 1 y el 7\n");        
        
      }

      System.out.printf("Entradas individuales %20d\n", personas);
      
      if(personas > 0){
        System.out.printf("Precio entradas individuales %17.2f€\n", precio);
      } else{
        System.out.printf("Precio entradas individuales %16.2f€\n", precio * 0);
      }

      System.out.printf("Total %40.2f€\n", precio + precioPareja);
      
      if(carnetSocio.equals("s")){
        precio -= precio * 0.1;
        descuento = (precio + precioPareja) * 0.1;
        System.out.printf("Descuento %35.2f€\n", descuento);
      }
      total = precio + precioPareja - descuento;
      System.out.printf("A pagar %38.2f€\n", total - descuento);
    
    } else{
      System.out.println("Lo siento, pero algún dato se ha introducido de manera incorrecta\n");
    }
  }
}