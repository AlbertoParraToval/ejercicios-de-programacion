/**
 * De pesetas a euros.
 *
 * @author Alberto Parra Toval
 */
public class Ejercicio5 {
  public static void main(String[] args) {
    
    double pesetas = 2340.00;
    
    int euros = (int) (pesetas / 166.386);
    
    System.out.print(pesetas + " pesetas son " + euros + " euros. "); 
  }
}
