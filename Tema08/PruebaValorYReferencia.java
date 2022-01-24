/**
 * PRUEBA EJEMPLO LUIS
 */
public class PruebaValorYReferencia {
  public static void main(String[] args) {
      int x = 50;
      suma5(x);
      System.out.println("x del main: " + x);
      int n[] = {4, 7, 9, 11, 22, 55, 67, 87};
      
      for (int i : n) {
        System.out.println("n del main:" + n);
      }
  }
  //Si modifico el parametro dentro del main en la funcion se modifica tambien.
  //Si modifico el parematro dentro de la funcion solo se modificará en la funcion.

  public static void suma5(int x){ 
    x = x + 5;
    System.out.println("x desde dentro de la funcion + 5: " + x);
  }

  public static void suma5(int[] n){ 
    for (int i = 0; i < n.length; i++) {
      n[i] = n[i] + 5;
    }
    for (int i : n) {
      System.out.println("N desde dentro de la funcion : " + n);  
    }
    
  }
}


