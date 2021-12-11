/** Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
separados por espacios. Muestra también el máximo, el mínimo y la media
de esos números.
 *
 * @author Alberto Parra Toval
 */
public class  Ex05_06 {
    public static void main(String[] args) {
        System.out.println("Programa que muestra 50 numeros aleatorios y dice el mayor , el menos y su media");
        //Definimos las variables 
        int maximo = 100;
        int minimo = 199;
        int suma = 0;
        int n;
        // Mientras i sea menor que 50 que se generen numeros aleatorios entre 100 y 199
        for (int i = 0; i < 50; i++) {
          n = (int)(Math.random()*100) + 100;
          System.out.print(n + " ");
          //Se vayan sumando los numeros que se generen
          suma += n;
          // obtenemos el minimo
          if (n < minimo) {
            minimo = n;
          }
          //Obtenemos el maxima
          if (n > maximo) {
            maximo = n;
          }
        }
        //Mostramos los resultados 
        System.out.println( );
        System.out.println("Num.Min: " + minimo);
        System.out.println("Num.Max: " + maximo);
        System.out.println("Num.Media: " + suma/50);
        }
      }