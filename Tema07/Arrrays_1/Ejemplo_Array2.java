/** Escribe un programa que simule la tirada de dos dados. El programa deberá
    continuar tirando los dados una y otra vez hasta que en alguna tirada los dos
    dados tengan el mismo valor
 *
 * @author Alberto Parra Toval
 */
public class Ejemplo_Array2 {
    public static void main(String[] args) {
    System.out.println("[Compra del BlackFriday]");
        String[] frutas = new String [] {"chirimoya", "mandarina", "mango", "manzana", "pera", "platano"};
        System.out.println("Introduzca 6 nombres de frutas y vaya pulsando INTRO");
        //Lee los datos del teclado
        for (int i = 0; i < 6; i++) {
            frutas[i] = System.console().readLine();
        }

        //Muestra el contenido de la array
        System.out.println("---------------");
        for (int i = 0; i < frutas.length; i++) {
            System.out.printf("| %1d | %-8s | \n", i, frutas[i]);
            if (i != 5) {
                System.out.println("----------------");
            }
        }
        System.out.println("---------------");
    }
}