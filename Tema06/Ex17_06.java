/** Realiza un programa que pinte por pantalla una pecera con un pececito dentro.
Se debe pedir al usuario el ancho y el alto de la pecera, que como mínimo
serán de 4 unidades. No hay que comprobar que los datos se introducen
correctamente; podemos suponer que el usuario los introduce bien. Dentro de
la pecera hay que colocar de forma aleatoria un pececito, que puede estar
situado en cualquiera de las posiciones que quedan en el hueco que forma el
rectángulo.
 *
 * @author Alberto Parra Toval
 */
public class Ex17_06 {
    public static void main(String[] args) {
        System.out.println("[Programa que muestra una pecera y un pez en su interior]");
        System.out.println("---------------------------------------------------------");
        System.out.println("Introduzca la altura de la pecera, por favor: ");
        int alturaIntroducida = Integer.parseInt(System.console().readLine());
        System.out.println("Introduzca la anchura de la pecera, por favor: ");
        int anchuraIntroducida = Integer.parseInt(System.console().readLine());

        for (int i = 0; i < alturaIntroducida; i++) {
            System.out.println("*");
        }

        for (int j = 0; j < anchuraIntroducida; j++) {
            System.out.print(" * ");
        }

        
    }
}