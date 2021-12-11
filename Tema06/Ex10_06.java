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
        int numAleatorio=0;
        int longitudLinea=0;
        int contador = 0;
        while (contador < 10){
        
        numAleatorio=(int)(Math.random()*6);
        switch (numAleatorio){
        case 0:
            longitudLinea=(int)(Math.random()*40)+1;
            for (int i = 0; i < longitudLinea; i++){
            System.out.print("*");
            }
        break;
        case 1:
            longitudLinea=(int)(Math.random()*40)+1;
            for (int i = 0; i < longitudLinea; i++){
            System.out.print("-");
            }
        break;
        case 2:
            longitudLinea=(int)(Math.random()*40)+1;
            for (int i = 0; i < longitudLinea; i++){
            System.out.print("=");
            }
        break;
        case 3:
            longitudLinea=(int)(Math.random()*40)+1;
            for (int i = 0; i < longitudLinea; i++){
            System.out.print(".");
            }
        break;
        case 4:
            longitudLinea=(int)(Math.random()*40)+1;
            for (int i = 0; i < longitudLinea; i++){
            System.out.print("|");
            }
        break;
        default:
            longitudLinea=(int)(Math.random()*40)+1;
            for (int i = 0; i < longitudLinea; i++){
            System.out.print("@");
            }
        break;
        }
        System.out.println("");
        contador++;
        }
    }
}
