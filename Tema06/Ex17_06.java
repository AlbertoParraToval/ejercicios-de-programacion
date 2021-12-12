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
        System.out.print("Introduce la altura del rectangulo por teclado(min. 4): ");
        int altura = Integer.parseInt(System.console().readLine()) ;
        System.out.print("Introduce la anchura del rectangulo por teclado(min. 4): ");
        int anchura = Integer.parseInt(System.console().readLine()) ;
        int posicionPez = (int)(Math.random()*((altura -2)*(anchura-2)))+1;;
        int posicion = 0;
        // Parte de Arriba de la pecera
        for (int i = 0; i < anchura -1; i++){
        System.out.print("*");
        }
        //Los laterales de la pecera
        for (int i = 2; i < altura; i++ ){
        System.out.println("");
        System.out.print("*");
            for (int aux = 2; aux <= anchura -2;aux++){
            //Si la posicion es igual a la posicion del pez pues que lo pinte
            if (posicion == posicionPez){
                System.out.print("&");
            }else{
                System.out.print(" ");
            }
            posicion++; //La posicion ira aumentando hasta que coincida con la posicion del pez
            }
        System.out.print("*");
        }
        System.out.println("");
        //Parte de abajo de la pecera
        for (int i = 1; i < anchura; i++){
        System.out.print("*");
        }
    }
}