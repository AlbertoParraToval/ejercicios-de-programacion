import Ex01_09.Caballo;
import Ex02_09.Vehiculo;
import Ex04_09.Fraccion;
import Ex05_09.Pizza;

public class Main_01_05 {
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

    /**
     * Ejercicio 4 Crea la clase Fracción. Los atributos serán numerador y
     * denominador. Y algunos de los
     * métodos pueden ser invierte, simplifica, multiplica, divide, etc.e
     */
    System.out.println("EJERCICIO 4");
    System.out.print("===============");
    System.out.println();
    System.out.print("Introduce el numerador: ");
    int numerador = Integer.parseInt(System.console().readLine());
    System.out.println();
    System.out.print("Introduce el denominador: ");
    int denominador = Integer.parseInt(System.console().readLine());
    System.out.println();
    Fraccion fraccion1 = new Fraccion();
    fraccion1.multiplicar(numerador, denominador);
    fraccion1.dividir(numerador, denominador);
    fraccion1.invertido(numerador, denominador);
    fraccion1.simplificacion(numerador, denominador);

    /**
     * Crea la clase Pizza con los atributos y métodos necesarios. Sobre cada pizza
     * se necesita saber el tamaño - mediana o familiar - el tipo - margarita,
     * cuatro
     * quesos o funghi - y su estado - pedida o servida. La clase debe almacenar
     * información sobre el número total de pizzas que se han pedido y que se
     * han servido. Siempre que se crea una pizza nueva, su estado es pedida. El
     * siguiente código del programa principal debe dar la salida que se muestra:
     */
    System.out.println("EJERCICIO 5");
    System.out.print("===============");
    System.out.println();
    System.out.println("Las pizzas pedidas son");
    Pizza p1 = new Pizza(" margarita","mediana", "pedida");
    Pizza p2 = new Pizza(" funghi", "familiar", "servida");
    p2.sirve();
    Pizza p3 = new Pizza(" cuatro quesos", "mediana", "pedida");
    System.out.println(p1);
    System.out.println(p2);
    System.out.println(p3);
    p2.sirve();
    System.out.println("pedidas: " + Pizza.getTotalPedidas()); 
    System.out.println("servidas: " + Pizza.getTotalServidas());
    
  }
}