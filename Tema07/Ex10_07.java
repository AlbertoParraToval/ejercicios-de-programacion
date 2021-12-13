/**Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100 y 
 * que los almacene en un array . El programa debe ser capaz de pasar todos los 
 * números pares a las primeras posiciones del array(del 0 en adelante) y todos 
 * los números impares a las celdas restantes . Utiliza arrays auxiliares si es
 * necesario.
 *
 * @author Alberto Parra Toval
 */
public class Ex10_07 {
    public static void main(String[] args) {
        System.out.print("El programa pasa los numeros pares a primeras posiciones.\n");
        int [] numero = new int[20]; // Longitud de mi array
        for (int i = 0; i < 20;i++){
            numero[i] = (int)(Math.random()*101);; //Numero de veces que se genra un numero aleatorio
        }
        //Solo pinto los pares para que salga los primeros
        int indice = 0;
        while  (indice < 20){ 
            if ((numero[indice] % 2)== 0){ //Compruebo si es par
            System.out.print(numero[indice]+" ");
            
            }
            indice++;
        }
        //pinto los impares despues de pintar los pares
        indice = 0;
        while  (indice < 20){
            if ((numero[indice] % 2)!= 0){ //Compruebo si no es par
            System.out.print(numero[indice]+" ");
            }
            indice++;
        }
    }
}

