
/** Escribe un programa que simule la tirada de dos dados. El programa deberá
    continuar tirando los dados una y otra vez hasta que en alguna tirada los dos
    dados tengan el mismo valor
 *
 * @author Alberto Parra Toval
 */
public class Ex20_06 {
    public static void main(String[] args) {
        System.out.println("Programa que muestra una serpiente");
        System.out.print("Introduzca la longituda de tu serpiente: ");
        int snakeSize = Integer.parseInt(System.console().readLine());
        System.out.println("Aqui tiene su serpiente\n");
        // PINTO LA CABEZA CON 12 ESPACIOS
        System.out.println("            @");
    
        // VARIABLES PARA EL CUERPO DE LA SERPIENTE
        int movPosition;
        int position = 13;
        
        while (snakeSize> 1) {
        // LAS TRES POSIBLES POSICIONES DEL CUERPO LA SERPIENTE
        position += (int)(Math.random() * 3) - 1;
    
        // PINTA LOS ESPACIOS DE LAS POSICIONES
        for (movPosition = 1; movPosition < position; movPosition++) {
            System.out.print(" ");
        }

        // PINTA EL CUERPO
        System.out.println("#");

        snakeSize--;
        }
    }
}