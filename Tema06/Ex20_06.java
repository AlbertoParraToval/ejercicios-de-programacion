
/** agua. La capacidad será indicada por el usuario. La cuba se llenará con una
cantidad aleatoria de agua que puede ir entre 0 y la capacidad máxima que
pueda admitir. El ancho de la cuba no varía.
Ejemplo:
Por favor, indique la capacidad de la cuba en litros: 3
*    *
*====*
*====*
******
La cuba tiene una capacidad de 3 litros y contiene 2 litros de agua.
 *
 * @author Alberto Parra Toval
 */
public class Ex20_06 {
    public static void main(String[] args) {
        System.out.println("Programa que dibuja una Cuba con cierta cantidad de agua");
        System.out.println("Introduce la capacidad maxima de tu cuba");
        //DEFINO LA CAPACIDAD Y LOS LITROS QUE SE VAN O NO INCLUIR EN LA CUBA
        int capacidad = Integer.parseInt(System.console().readLine());
        int litros = (int)(Math.random() * (capacidad + 1));
        //SI I ES MENOR QUE LA CAPACIDAD QUE DIBUJE LAS PAREDES
        for (int i = 1; i < capacidad; i++) {
            //SI i ES MAYO QUE LA RESTA DE CAPACIDAD Y LITROS QUE SIGA PINTANDO LAS PAREDES SINO QUE DIBUJO EL AGUA TAMBIEN
            if (i < (capacidad - litros)) {
                System.out.println("#    #");
                } else {
                System.out.println("#====#");
                }
        }
        //EL FONDO DE LA CUBA
        System.out.println("######"); 
        // EL RESULTADO DE LOS LITROS QUE HAY EN LA CUBA
        System.out.print("La cuba tiene una capacidad de " + capacidad + " litros y contiene " + litros + " litros de agua.");
        
    }
}