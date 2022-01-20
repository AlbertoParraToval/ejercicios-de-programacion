/** Realiza un programa que pida 10 números por teclado y que los almacene en
 * un array.A continuación se mostrará el contenido de ese array junto al índice
 * (0 – 9) utilizando para ello una tabla .  Seguidamente el programa pasará los 
 * primos a las primeras posiciones, desplazando el resto de números (los que no
 * son primos) de tal forma que no se pierda ninguno.Al final se debe mostrar el
 * array resultante.
 *
 * @author Alberto Parra Toval
 */
public class Ex19_07 {
    public static void main(String[] args) {
        System.out.println("\nA continuación se muestran en tres columnas, un numero aleatorio entre 0 y 100, su cuadrado y su cubo:\n");
        System.out.print("El programa te muestra el los primos primeros.\n");
        int [] numero = new int[10]; //Longitud de mi array
        System.out.print("Introduce 10 numeros porfavor : \n");
        for (int i = 0; i < 10;i++){
            numero[i] = Integer.parseInt(System.console().readLine());
        }
        //Muestra el indice del array
        for (int i = 0; i < 10;i++){
        System.out.printf("%3d|",i); 
        }
        System.out.println("");
        
        //Muestra el valor del array inicial
        int indice = 0;
        while  (indice < 10){ 
        System.out.printf("%3d|",numero[indice]);
        indice++;
        }
        System.out.println("");
        System.out.println("");
    
        //Muestra el indice del array
        for (int i = 0; i < 10;i++){
        System.out.printf("%3d|",i);
        }
        System.out.println("");
        
        //El array solo con los primos
        indice = 0; 
        boolean esPrimo; 
        do{
        esPrimo = true; 
        for (int i=2; i < numero[indice]; i++){
            if ((numero[indice] % i) == 0){
            esPrimo = false;
            }
        }
        
        if (esPrimo){
        System.out.printf("%3d|",numero[indice]);
        }
        indice++;
        }while (indice < 10);
    
        //El array solo con los no primos
        indice = 0; 
        do{
        esPrimo = true; 
        for (int i=2; i < numero[indice]; i++){
            if ((numero[indice] % i) == 0){
            esPrimo = false;
            }
        }
        
        if (!esPrimo){
            System.out.printf("%3d|",numero[indice]);
        }
        indice++;
        }while (indice < 10);
    }
}
