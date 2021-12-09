import javax.sound.sampled.LineEvent;

/** Realiza un programa que pinte por pantalla diez líneas formadas por caracteres.
El carácter con el que se pinta cada línea se elige de forma aleatoria entre uno
de los siguientes: *, -, =, ., |, @. Las líneas deben tener una longitud aleatoria
entre 1 y 40 caracteres.

 *
 * @author Alberto Parra Toval
 */
public class Ex10_06 {
    public static void main(String[] args) {
        System.out.println("[Programa que pinta diez lineas formadas por caracteres]");
        int longitud = 10;

        for (int i = longitud; i <= 40; i++) {
            i++;
            int caracter = (int)(Math.random()*5); 
            switch (caracter) {
                case 1:
                System.out.print(" @ ");
                    break;
                case 2:
                System.out.print(" * ");
                    break;
                case 3:
                System.out.print(" = ");
                    break;
                case 4:
                System.out.print(".");
                    break;
                default:
                System.out.print(" | ");
                    break;
            }
        }

    }
}