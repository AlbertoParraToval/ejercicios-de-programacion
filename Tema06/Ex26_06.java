/** Realiza un programa que pinte una tableta de turrón con un bocado realizado de
forma aleatoria. El ancho y el alto de la tableta se pide por teclado. El bocado se
da alrededor del turrón, obviamente no se puede dar un bocado por en medio
de la tableta.
 * @author Alberto Parra Toval
 */
public class Ex26_06 {
    public static void main(String[] args) {
        System.out.println("Tableta de chocolate con bocados");
        //PIDO LAS MEDIDAS DE MI TABLETA
        System.out.println("Introduce la anchura de la tableta: ");
        int anchuraIntroducida = Integer.parseInt(System.console().readLine());
        System.out.println("Introduce la altura de la tableta: ");
        int alturaIntroducida = Integer.parseInt(System.console().readLine());
        //POSICION RAMDON DEL MORDISCO
        int posicionMordisco = (int) (Math.random() * (anchuraIntroducida * 2 + (alturaIntroducida - 2) * 2));
        //DEFINIMOS LA VARIABLE POSICION
        int posicion = 0;
        //DIBUJAMOS UNA LINEA
        for (int i = 0; i < alturaIntroducida; i++) {
            //DIBUJAMOS LA ANCHURA Y DEFINIMOS SI ESTA EN EL BORDE 
            for (int j = 0; j < anchuraIntroducida; j++) {
                boolean estaEnBorde = (i == 0) || (i == alturaIntroducida - 1) || (j == 0) || (j == anchuraIntroducida - 1);
                //CONDICION PARA QUE POSICION == MORDISCO Y TIENE QUE ESTAR EN EL BORDE
                if ((posicion == posicionMordisco) && estaEnBorde) {
                System.out.print(" ");
                } else {
                System.out.print("*");
                }
                //SI ESTA EN EL BORDE
                if (estaEnBorde) {
                posicion++;
                }
            }
            //DEJAMOS EL ESPACIO DEL BOCADO
            System.out.println();
        }
    }
}
