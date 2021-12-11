/** Escribe un programa que muestre tres apuestas de la quiniela en tres columnas
para los 14 partidos y el pleno al quince (15 filas).
 *
 * @author Alberto Parra Toval
 */
public class Ex07_06 {
    public static void main(String[] args) {
      int resultadoPartido;
      int columnas = 3;
      // Dibujo las diferentes filas que va haber
      for (int fila = 1; fila <= 14; fila++) {
        System.out.printf("%4d. |", fila);
        // Mientras la apuesta sea menor o igal a las columnas que genere numeros aleatorios de mi switch
        for (int apuesta = 1; apuesta <= columnas; apuesta++) {
          resultadoPartido = (int)(Math.random() * 3) + 1;
          switch(resultadoPartido) {
            case 1:
              System.out.print(" 1 |");
              break;
            case 2:
              System.out.print(" 2 |");
              break;
            case 3:
              System.out.print(" X |");
            default:
          }
        }
        System.out.println();
      }
      // A parte creo que pleno al quince con mi varible goles que es un num rando de 0 a 4
      System.out.print("\nPLENO AL 15 - Local...");
      int goles = (int)(Math.random() * 4);
      System.out.print(goles < 3 ? goles : "M");
      //Repito lo mismo que arriba
      System.out.print("   Visitante...");
      goles = (int)(Math.random() * 4);
      System.out.print(goles < 3 ? goles : "M");
    }
  }

