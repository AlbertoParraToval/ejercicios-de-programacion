/**
 * Mejora el juego Busca el tesoro de tal forma que si hay una mina a una
 * casilla
 * de distancia, el programa avise diciendo ¡Cuidado! ¡Hay una mina cerca!
 * 
 * @author Alberto Parra Toval
 */
public class Ex07_07 {
  public static void main(String[] args) throws InterruptedException {
    // se definen constantes para representar el
    // contenido de las celdas
    final int VACIO = 0;
    final int MINA = 1;
    final int TESORO = 2;
    final int INTENTO = 3;
    int x,y;
    int[][] cuadrante = new int[7][6];
    //Inicializo el Array
    for (x = 0; x < 6; x++) {
      for (y = 0; y < 5; y++) {
        cuadrante[x][y] = VACIO;
      }
    }
    // coloca la mina
    int minaX = (int) (Math.random() * 6);
    int minaY = (int) (Math.random() * 5);
    cuadrante[minaX][minaY] = MINA;
    // coloca el tesoro
    int tesoroX;
    int tesoroY;
    do {
      tesoroX = (int) (Math.random() * 6);
      tesoroY = (int) (Math.random() * 5);
    } while ((minaX == tesoroX) && (minaY == tesoroY));
    cuadrante[tesoroX][tesoroY] = TESORO;
    // juego
    System.out.println("¡BUSCA EL TESORO!");

    boolean salir = false;
    String c = "";
    do {
      // pinta el cuadrante
      for (y = 5; y >= 0; y--) {
        System.out.print(y + "|");
        for (x = 0; x < 6; x++) {
          if (cuadrante[x][y] == INTENTO) {
            System.out.print("X ");
          } else {
            System.out.print(" ");
          }
        }
        System.out.println();
      }
      System.out.println(" ----------\n 0 1 2 3 4 5\n");
      // pide las coordenadas
      System.out.print("Coordenada x: ");
      x = Integer.parseInt(System.console().readLine());
      System.out.print("Coordenada y: ");
      y = Integer.parseInt(System.console().readLine());
      // mira lo que hay en las coordenadas indicadas por el usuario
      switch (cuadrante[x][y]) {
        case VACIO:
          cuadrante[x][y] = INTENTO;
          break;
        case MINA:
          System.out.println("Lo siento, has perdido.");
          salir = true;
          break;
        case TESORO:
          System.out.println("¡Enhorabuena! ¡Has encontrado el tesoro!");
          salir = true;
          break;
        default:
      }
    } while (!salir);
    // pinta el cuadrante
    for (y = 3; y >= 0; y--) {
      System.out.print(y + " ");
      for (x = 0; x < 5; x++) {
        switch (cuadrante[x][y]) {
          case VACIO:
            c = " ";
            break;
          case MINA:
            c = "* ";
            break;
          case TESORO:
            c = "€ ";
            break;
          case INTENTO:
            c = "X ";
            break;
          default:
        }
        System.out.print(c);
      }
      System.out.println();
    }
    System.out.println(" ------------\n 0 1 2 3 4 5 6\n");
  }
}