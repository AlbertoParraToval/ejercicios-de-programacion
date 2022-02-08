/**   Escribe un programa que rellene un array de 20 elementos con números enteros
 * aleatorios comprendidos entre 0 y 400 (ambos incluidos). A continuación el
 * programa mostrará el array y preguntará si el usuario quiere resaltar los
 * múltiplos de 5 o los múltiplos de 7. Seguidamente se volverá a mostrar el 
 * array escribiendo los números que se quieren resaltar entre corchetes.
 *
 * @author Alberto Parra Toval
 */
public class Ex16_07 {
    public static void main(String[] args) {
        System.out.print("Introduce 15 numeros y el programa rota los elementos de ese array: \n");
        int [] numero = new int[20];
        for (int i = 0; i < 20;i++){
            numero[i] = (int)(Math.random()*401);
            }
        /**Muestra el Valor del Array Inicial**/
        int indice = 0;
        while  (indice < 20){
            System.out.print(numero[indice]+" ");
            indice++;
            }

        System.out.println("");
        System.out.println("");
        /**Pido la opcion y saco el numero destacado**/
        System.out.print("¿Que numeros quiere resaltar? (1) los multiplos de 5, 2() los multiplos de 7): \n");
        int opcion = Integer.parseInt(System.console().readLine());
        indice = 0;
        
        switch (opcion){
            case 1:
          /**Muestra el Valor del Array Final **/
            while  (indice < 20){
                if ((numero[indice] % 5) == 0){
                System.out.print("["+ numero[indice]+"] ");
                }else{
                System.out.print(""+numero[indice]+" ");
                }
                indice++;
            }
            break;
            case 2:
            /**Muestra el Valor del Array Final **/
            while  (indice < 20){
                if ((numero[indice] % 7) == 0){
                    System.out.print("["+numero[indice]+"] ");
                }else{
                    System.out.print(""+numero[indice]+" ");
                }
                indice++;
                }
            break;
            default:
            }
        }
    }