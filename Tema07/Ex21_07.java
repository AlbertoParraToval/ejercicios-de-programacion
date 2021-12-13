/** Escribe un programa que rellene un array de 15 elementos con números enteros
 * comprendidos entre 0 y 500 (ambos incluidos). A continuación, se mostrará el
 * array cincuerizado, según el siguiente criterio: si el número que hay en una
 * posición del array es múltiplo de 5, se deja igual, y si no, se cambia por el
 * siguiente múltiplo de 5 que exista a partir de él.
 *
 * @author Alberto Parra Toval
 */
public class Ex21_07 {
    public static void main(String[] args) {
        System.out.println("Array original: ");
        int [] numero = new int[15]; //Longitud de mi array
        for (int i = 0; i < 15;i++){
            numero[i] = (int)(Math.random()*501); //Numeros
            System.out.print(numero[i]+" ");
        }
        System.out.println(" ");
        System.out.println(" ");
        for (int indice = 0; indice < 15;indice++){ 
            while ((numero[indice]%5)!= 0){ // Si es multiplo de 5
            numero[indice]= numero[indice]+=1;
            }
        }
        System.out.println("Array cincuerizado: "); //Se muestra el arrays
        for (int i = 0; i < 15;i++){    
            System.out.print(numero[i]+" ");
            }
    }
}

