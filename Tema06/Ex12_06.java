/** Realiza un programa que llene la pantalla de caracteres aleatorios (a lo Matrix)
    con el código ascii entre el 32 y el 126. Puedes hacer casting con (char) para
    convertir un entero en un carácter.
 * @author Alberto Parra Toval
 */
public class Ex12_06 {
    public static void main(String[] args) {
        System.out.println("[Programa que muestra en pantalla caracteres aleatorios del codigo ASCII entre el 32 y el 126]");
        int linea = 0;        
        for(int i = 0; i < 8000; i++) {
          System.out.print((char)(Math.random() * (126 - 32 + 1) + 32));
          
          if (linea++ == 60) {
            linea = 0;
            System.out.printf("");
            System.out.println("\033[92m");
          }
        }
      }
    }