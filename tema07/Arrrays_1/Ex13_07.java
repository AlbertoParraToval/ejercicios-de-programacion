/**  Escribe un programa que rellene un array de 100 elementos con números enteros 
 * aleatorios comprendidos entre 0 y 500 ( ambos incluidos ). A continuación el
 * programa mostrará el array y preguntará si el usuario quiere destacar el máx
 * -imo o el mínimo . Seguidamente se volverá a mostrar el array escribiendo el 
 * número destacado entre dobles asteriscos.
 *
 * @author Alberto Parra Toval
 */
public class Ex13_07 {
    public static void main(String[] args) {
    System.out.println("Maximos y Minimos de un Array de 100 numeros");
    int [] numero = new int[100]; //Longitud de mi array
    for (int i = 0; i < 100;i++){
        numero[i] = (int)(Math.random()*501); //Hasta que numero llega
    }
    /**Muestra el Valor del Array Inicial**/
    int indice = 0;
    while  (indice < 100){
        System.out.print(numero[indice]+" "); //Que muestre el valor del array inicial
        indice++;
    }
    System.out.println("");
    System.out.println("");
    //Pido la opcion que quiera el usuario y saco el nuemro
    System.out.print("¿Qué quiere destacar? (1 – mínimo, 2 – máximo): \n");
    int opcion = Integer.parseInt(System.console().readLine());
    int destacadoIndice = 0; //Guardare el numero del indice del numero destacado
    int destacado = 0; 
    switch (opcion){
        case 1:
        indice = 0;
        destacado = numero[0];
        while  (indice < 100){
            if (numero[indice] < destacado){ //Destacado mayor al numero indice 
                destacado = numero[indice]; //destacado lo igualamos al nuemro indice 
                destacadoIndice = indice; //hacemos lo mismo con los dos indices
            }
            indice++;
        }
        break;
        case 2:
            indice = 0;
            destacado = 0;
            while  (indice < 100){
            if (numero[indice] > destacado){ //Destacado menor al numero indice 
                destacado = numero[indice]; //destacado lo igualamos al nuemro indice 
                destacadoIndice = indice; //hacemos lo mismo con los dos indices
            }
            indice++;
            }
        break;
        default:
        }
        // Muestro el array final
        indice = 0; 
        do{
        if ( indice == destacadoIndice ){
            System.out.print(" *"+numero[destacadoIndice]+"* ");
        }else {
            System.out.print(numero[indice]+" ");
        }
        indice++;
        }while (indice < 100);
    
    }
}


