/**
 * Escribe un programa que lea un número n e imprima una pirámide de números con
 * n filas como en la siguiente figura:
 * 
 * @author Alberto Parra Toval
 * 
 * 
 */
public class Ex24_05 {
    public static void main(String[] args) {
        System.out.println("[Piramide de Numeros]");
        System.out.println("---------------------");
        // Pedimos la altura al usuario y definimos nuestras varibles
        System.out.print("Introduce un numero por teclado: ");
        int altura = Integer.parseInt(System.console().readLine()) ;
        int linea = 1;
        int n = 0;
        int espaciado = altura - 1;

        // Mientras linea sea menor o igual altura
          while (linea <= altura){
            //Espaciados
            for (int espacio = 1; espacio <= espaciado; espacio++){
              System.out.print(" ");
              }
            //Pintando linea
            for (int largoLinea = 1; largoLinea <= n; largoLinea++){
              System.out.print(largoLinea);
              }
            //Pintando Filas
            for (int filas = linea; filas > 0; filas--){
              System.out.print(filas);
            }
            System.out.println(" ");
            
            //aumenta el numero de filas
            linea++;
            //aumenta el numero de la cifra de caracteres
            n++;
            // dismimnuye la cantidad de espacios
            espaciado--;
            }
      }
    }