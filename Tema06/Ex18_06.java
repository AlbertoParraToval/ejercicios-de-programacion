import java.util.Random;

/** Sinestesio y Casilda van a pintar los tres dormitorios de su casa, quieren
sustituir el color blanco por colores más alegres. Realiza un programa que
genere de forma aleatoria una secuencia de tres colores aleatorios (uno para
cada dormitorio) de tal forma que no se repita ninguno. Los colores entre los que
debe elegir el programa son los siguientes: rojo, azul, verde, amarillo, violeta y
naranja.
 *
 * @author Alberto Parra Toval
 */
public class Ex18_06 {
    public static void main(String[] args) {
        System.out.println("[Programa que genera secuencias de tres colores aleatorios sin repetirse.]");
        int color1;
        int color2;
        int color3;
    
        do {
          color1 = (int)(Math.random() * 6);
          color2 = (int)(Math.random() * 6);
          color3 = (int)(Math.random() * 6);
        } while ((color1 == color2) || (color1 == color3) || (color2 == color3));
        
        String primerColor = "";
        switch(color1) {
            case 0:
                primerColor = "\033[31m rojo";
                    break;
            case 1:
                primerColor = "\033[34m azul";
                    break;
            case 2:
                primerColor = "\033[32m verde";
                    break;
            case 3:
                primerColor = "\033[33m amarillo";
                    break;
            case 4:
                primerColor = "\033[95m violeta";
                    break;
            default:
                primerColor = "\033[37m naranja";
                    break;
        }

        String segundoColor = "";
        switch(color2) {
            case 0:
                segundoColor = "\033[31m rojo";
                    break;
            case 1:
                segundoColor = "\033[34m azul";
                break;
            case 2:
                segundoColor = "\033[32m verde";
                break;
            case 3:
                segundoColor = "\033[33m amarillo";
                break;
            case 4:
                segundoColor = "\033[95m violeta";
                break;
            default:
                segundoColor = "\033[37m naranja";
                break;
            }


            String tercerColor = "";
            switch(color3) {
                case 0:
                    tercerColor = "\033[31m rojo";
                        break;
                case 1:
                    tercerColor = "\033[34m azul";
                    break;
                case 2:
                    tercerColor = "\033[32m verde";
                    break;
                case 3:
                    tercerColor = "\033[33m amarillo";
                    break;
                case 4:
                    tercerColor = "\033[95m violeta";
                    break;
                default:
                    tercerColor= "\033[37m naranja";
                    break;
                }

                System.out.print(primerColor + segundoColor + tercerColor);
    }
}
        
