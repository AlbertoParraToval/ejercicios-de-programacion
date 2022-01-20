/**
 * Juego de tres en raya vs la maquina
 * 
 * @author Alberto Parra Toval
 */
public class Ex10_07 {
  public static void main(String[] args) {
    System.out.println("Juego de tres en raya vs la máquina");
    System.out.println("-----------------------------------");
    System.out.println(" ");

    final int VACIO = 0;
    final int MINA = 1;
    final int TESORO = 2;
    final int INTENTO = 3;


    int x,y;
    String[] [] tablero = new String [3][3]; //El tamaño de nuestro tablero de tres en raya
    for (x = 0; x < 3; x++) {
      for (y = 0; y < 3; y++) {
        tablero[x][y] = " ";
      }
    }

    
  }
}