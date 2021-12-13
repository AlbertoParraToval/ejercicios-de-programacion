/**
 *   Realiza un programa que pinte un triángulo hueco tal como se muestra en los
 * ejemplos. El usuario debe introducir la altura de la figura.
.

 * @author Alberto Parra Toval
 */
public class Ex54_05 {
    public static void main(String[] args) {
        System.out.print("Introduzca la altura de la figura: ");
    int altura = Integer.parseInt(System.console().readLine()) ;
    for (int i = 0; i < altura;i++){ //QPinta has que la altura sea menor que la i
        System.out.print("*");
    }
    System.out.println("");
    while (altura -2 > 0){ // Mientras altura -2 es mayor que 0
        for (int i = altura -1; i > 0; i--){
            if ( i == altura -1){
            System.out.print("*");
            }else if( i == 1 ){
            System.out.print("*");
            }else{
            System.out.print(" ");
            }
        }
        System.out.println("");
        altura--;
        }
        System.out.print("*");
    }
}