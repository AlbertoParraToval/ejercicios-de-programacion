/**
* Realiza un programa que resuelva una ecuación de segundo grado (del tipo ax2 + bx + c = 0).
*
* @author Alberto Parra 
*/
public class Ejercicio9Tema4 {

  public static void main(String[] args) {
    
    double x1, x2;

    System.out.println("Este programa resuelve ecuaciones de segundo grado.");
    System.out.println("ax^2 + bx + c = 0");
    
    System.out.println("Por favor, introduzca los valores.");
    
    System.out.print("x = ");
    double x = Double.parseDouble(System.console().readLine());
    
    System.out.print("y = ");
    double y = Double.parseDouble(System.console().readLine());
    
    System.out.print("c = ");
    double c = Double.parseDouble(System.console().readLine());
   
    
    if ((x == 0) && (y == 0) && (c == 0)) {
      System.out.println("La ecuación tiene infinitas soluciones.");
    }
   
    
    if ((x == 0) && (y == 0) && (c != 0)) {
      System.out.println("La ecuación no tiene solución.");
    }
      
   
    if ((x != 0) && (y != 0) && (c == 0)) {
      System.out.println("x1 = 0");
      System.out.println("x2 = " + (-y / x));
    }
    
    
    if ((x == 0) && (y != 0) && (c != 0)) {
      System.out.println("x1 = x2 = " + (-c / y));
    }

    
    if ((x != 0) && (y != 0) && (c != 0)) {
        
      double discriminante = y*y - (4 * x * c);
      
      if (discriminante < 0) {
          System.out.println("La ecuación no tiene soluciones reales");
      }  else {
        System.out.println("x1 = " + (-y + Math.sqrt(discriminante))/(2 * x));
        System.out.println("x2 = " + (-y - Math.sqrt(discriminante))/(2 * x));
      }
    }
  }
}
