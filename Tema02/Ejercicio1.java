/**
 * Ejercicio 1
 *
 * @author Alberto Parra Toval
 */
public class Ejercicio1 {
  public static void main(String[] args) {
    //Variables con la que haremos las operaciones
    int y;  y = 999;
    int x;  x = 144;
    
    //Suma    
    int Suma;
    Suma = x + y;    
    System.out.println(" El resultado de la suma es " + Suma); 
    
    //Resta
    int Resta;
    Resta = x - y;
	System.out.println(" El resultado de la resta es " + Resta);
	
	//Multiplicación
	int Multiplicacion;
	Multiplicacion = x * y;
	System.out.println(" El resultado de la multiplicación es " + Multiplicacion);
	
	//Division
    double Division;
    Division = (double) y / (double) x;
    System.out.println(" El resultado de la división es " + Division);  
  } 
}
