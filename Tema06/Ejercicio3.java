/** Realiza un programa que muestre al azar el nombre de una carta de la baraja
francesa. Esta baraja está dividida en cuatro palos: picas, corazones, diamantes
y tréboles. Cada palo está formado por 13 cartas, de las cuales 9 cartas son
numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que sería el
1). Para convertir un número en una cadena de caracteres podemos usar
String.valueOf(n).
 *
 * @author Alberto Parra Toval
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.println("Programa que muestra al azar una carta de la baraja Española");
        int familia = (int)(Math.random()*4); 
        switch (familia) {
          case 1:
            System.out.println("Oro");
            break;
          case 2:
          System.out.println("Espadas");
            break;
          case 3:
            System.out.println("Copas");
              break;
          default:
            System.out.println("Bastos");
            break;
        }

        int num = (int)(Math.random()*13);
        switch (num) {
          case 1:
          System.out.println("Sota");
            break;
          case 2:
          System.out.println("Caballo");
            break;
          case 3:
          System.out.println("Rey");
            break;
          case 4:
          System.out.println("As");
            break;
          case 5:
            System.out.println("2");
            break;
          case 6:
          System.out.println("3");
            break;
          case 7:
          System.out.println("4");
            break;
          case 8:
          System.out.println("5");
            break;
          case 9:
          System.out.println("6");
            break;
          default:
          System.out.println("7");
            break;
        }
    }
}