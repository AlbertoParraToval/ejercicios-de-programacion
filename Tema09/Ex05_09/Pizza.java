package Ex05_09;

/**
 * Crea la clase Pizza con los atributos y métodos necesarios. Sobre cada pizza
 * se necesita saber el tamaño - mediana o familiar - el tipo - margarita,
 * cuatro
 * quesos o funghi - y su estado - pedida o servida. La clase debe almacenar
 * información sobre el número total de pizzas que se han pedido y que se
 * han servido. Siempre que se crea una pizza nueva, su estado es pedida. El
 * siguiente código del programa principal debe dar la salida que se muestra:
 */

public class Pizza {
  String tipoPizza;
  String tamano;
  String estado;
  static int totalPedidas;
  static int totalServidas;

  //tipo de pizza, tamaño y estado
  public Pizza(String tipoPizza, String tamano, String estado) {
    this.tipoPizza = tipoPizza;
    this.tamano = tamano;
    this.estado = estado;
    Pizza.totalPedidas++;
  }

  //Devolvemos pizza con el tamaño tipo y estado mediante un toStreing
  public String toString() {
    
    return "pizza" + this.tipoPizza + " " + this.tamano + ", " + this.estado;
  }

  //Almacenar las pizzas pedidas
  public static int getTotalPedidas() {
    return Pizza.totalPedidas;
  }

  //Almacenar las pizzas servidas
  public static int getTotalServidas() {
    return Pizza.totalServidas;
  }

  //Si sirve es igual al estado pedida le sumamos al estado una pizza servida y que estado sea igual a pedida
  public void sirve() {
    if (this.estado.equals("pedida")) {
    this.estado = "servida";
    Pizza.totalServidas++;
    } else {
    System.out.println("esa pizza ya se ha servido");
    }
    }
}
