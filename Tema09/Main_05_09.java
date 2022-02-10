import Ex05_09.Pizza;
public class Main_05_09 {
  public static void main(String[] args) {
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