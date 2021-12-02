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

        int position = 0;
        int positionPez = (int)(Math.random()*(alturaIntroducida - 2)*(anchuraIntroducida - 2));

        //PARTE SUPERIOR DE LA PECERA
        for (int p = 0; p < anchuraIntroducida; p++) {
            System.out.print(" * ");
        }

        //PARTE CENTRAL DE LA PECERA
        for(int i = 2; i <= alturaIntroducida; i++) {
            System.out.print("*"); // parte izquierda de la pecera
            for(int j = 2; j <= anchuraIntroducida; j++) {
                if (position == positionPez) {
                System.out.print("&");
                } else {
                    System.out.print(" ");
                }
                    position++;
            } // for j
                System.out.println("*"); // parte derecha de la pecera
            }


            //PARTE INFERIOR DE LA PECERA
            for(int i = 0; i <= anchuraIntroducida; i++) {
                System.out.print(" * ");
                }
        
    }
}