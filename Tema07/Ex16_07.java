/**  Escribe un programa que lea 15 números por teclado y que los almacene en un
 * array. Rota los elementos de ese array, es decir, el elemento de la posición 0
 * debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra
 * en la última posición debe pasar a la posición 0. Finalmente, muestra el conte
 * -nido del array.
 *
 * @author Alberto Parra Toval
 */
public class Ex16_07 {
    public static void main(String[] args) {
        System.out.print("Introduce 15 numeros y el programa rota los elementos de ese array: \n");
        int [] numero = new int[15]; // Numeros que introducimos
        for (int i = 0; i < 15;i++){ // Que nos deje insertar hasta 15 numeros
        numero[i] = Integer.parseInt(System.console().readLine());
        }
        int indice = 0; //Nuestro indice 
        while  (indice < 15){
        if (indice == 0 ){ // Si es igual a 0 que muestre los 14 numeros
            System.out.print(numero[14] + " ");
        }else{
            System.out.print(numero[indice - 1] + " ");
        }
        indice++;
        }
    }
}
    