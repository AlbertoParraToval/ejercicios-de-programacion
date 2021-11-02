/**
 * Escribe un programa que calcule el total de una factura a partir de la base
  imponible (precio sin IVA). La base imponible estará almacenada en una
  variable.
 *
 * @author Alberto Parra Toval
 */
public class Ejercicio6 {
  public static void main(String[] args) {
    
    double euros = 340.00;
    
    int Iva = (int) (euros / 0.79);
    
    System.out.print(" La factura será de " + Iva + " euros "); 
  }
}
