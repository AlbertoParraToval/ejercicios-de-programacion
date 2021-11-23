/** Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
separados por espacios. Muestra también el máximo, el mínimo y la media
de esos números.
 *
 * @author Alberto Parra Toval
 */
public class  Ex05_06 {
    public static void main(String[] args) {
        System.out.println("Programa que muestra 50 numeros aleatorios y dice el mayor , el menos y su media");
        int maximo = 100;
        int minimo = 199;
        int suma = 0;
        int n;
          
        for (int i = 0; i < 50; i++) {
          n = (int)(Math.random()*100) + 100;
          System.out.print(n + " ");
          suma += n;
            
          if (n < minimo) {
            minimo = n;
          }
            
          if (n > maximo) {
            maximo = n;
          }
        }
        System.out.println( );
        System.out.println("Num.Min: " + minimo);
        System.out.println("Num.Max: " + maximo);
        System.out.println("Num.Media: " + suma/50);
        }
      }