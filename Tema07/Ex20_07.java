/** Realiza un programa que pida 10 números por teclado y que los almacene en un 
 * array . A continuación se mostrará el contenido de ese array junto al índice
 * (0 – 9). Seguidamente el programa pedirá dos posiciones a las que llamaremos
 * inicial y final . Se debe comprobar que inicial es menor que final y que 
 * ambos números están entre 0 y 9 . El programa deberá colocar el número de la 
 * posición inicial en la posición final , rotando el resto de números para que 
 * no se pierda ninguno. Al final se debe mostrar el array resultante.
 *
 * @author Alberto Parra Toval
 */
public class Ex20_07 {
    public static void main(String[] args) {
        System.out.print("Introduzca el número total de nombres de reyes: ");
        int numReyes = Integer.parseInt(System.console().readLine()); //Introducir el nuemro de relles
        String [] nomRey = new String[numReyes];
        int [] auxiliar = new int[numReyes];
        System.out.print("Vaya introduciendo los nombres de los reyes y pulsando INTRO. \n"); 
        for (int i = 0; i < numReyes;i++){ // Se repite hasta el numero de reyes que le hayamos dicho que es la long del array
            nomRey[i] = System.console().readLine();
        }
        int contadorRey=0; 
        for (int i = 0; i < numReyes  ;i++){ // Mientras sea menor al numero de reyes
            for (int indice = 0; indice < numReyes;indice++){
                if (nomRey[i].equals(nomRey[indice])){ 
                    if (i == 0){ 
                    contadorRey= i + 1;
                    auxiliar[i]=contadorRey = i + 1;
                }else{
                    auxiliar[i]= i;
                    }
                }
            }
        }
        
        System.out.println("Los reyes introducidos son: ");
        for (int i = 0; i < numReyes;i++){ // NQue se muestren los reyes que hemos introducido
            System.out.println(nomRey[i]+" "+ auxiliar[i] +"º");
            }
        }
    }