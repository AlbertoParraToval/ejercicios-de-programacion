import javax.print.attribute.standard.Media;

/** Escribe un programa que muestre 50 números enteros aleatorios comprendidos
entre el -100 y el 200 ambos incluidos y separados por espacios. Muestra luego
el máximo de los pares el mínimo de los impares y la media de todos los
números generados.
 * @author Alberto Parra Toval
 */
public class Ex19_06 {
    public static void main(String[] args) {
      System.out.println("[Programa que muestra 50 numeros entre el -100 y el 200 , su max par y la media de todos]");
        int num = 0;
        int maxPar =0;
        int suma = 0;
        int minImpar = 0;
        //FOR PARA EL NUMERO DE VECES QUE SE REPITE EL NUMERO ALEATORIO 
        for (int i = 0; i < 50; i++) {
          num = (int)(Math.random() * 301) - 100;
          System.out.print(num + " ");
          //PARA SABER SI ES PAR O IMPAR
          if (num % 2 == 0) { 
            if (num > maxPar) maxPar = num;
          } else {
            if (num < minImpar) minImpar = num;
          }
          //REALIZAMOS LA SUMA DE LOS NUMEROS
          suma += num;
        }
        System.out.print("\nEl numero maximo Par es igual a " + maxPar + ".");
        System.out.print("\nLa media de todos los numeros es igual a " + suma/50 + ".");
        System.out.println("\nEl numero minimo Impar es igual a " + minImpar + ".");
        
    
  
    }
}