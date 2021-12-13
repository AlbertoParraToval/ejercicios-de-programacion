/**Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100 y 
 * que los almacene en un array . El programa debe ser capaz de pasar todos los 
 * números pares a las primeras posiciones del array(del 0 en adelante) y todos 
 * los números impares a las celdas restantes . Utiliza arrays auxiliares si es
 * necesario.
 *
 * @author Alberto Parra Toval
 */
public class Ex18_07 {
    public static void main(String[] args) {
        int [] numero = new int[10];
    for (int i = 0; i < 10;i++){
        numero[i] = (int)(Math.random()*201);
    }
    int indice = 0;
    /**Muestra el Valor del Array Original**/
    System.out.print("|Indice|");
    for (indice = 0; indice < 10; indice++){
        System.out.printf(" %d %-1s" ,indice ,"|");
    }
    
    System.out.println(" ");
    
    System.out.print("|Numero|");
    for (indice = 0; indice < 10; indice++) {
        System.out.printf("%3d%-1s" ,numero[indice] ,"|");
    }
    
    System.out.println(" ");
    
    System.out.println(" ");
    System.out.println("");
    
    /**Si es menor a 100 lo guardare en un el array menor, si es mayor a 100 lo guardare en el array mayor.**/
    int [] menor = new int[10];
    int [] mayor = new int[10];
    int contadorMenor = 0;
    int contadorMayor = 0;
    int indice2 = 0;
    int indice3 = 0;
    for (indice = 0; indice < 10; indice++) {
        if (numero[indice] <= 100){
        menor[indice2]=numero[indice];
        indice2++;
        contadorMenor++;
        }else {
            mayor[indice3]=numero[indice];
            indice3++;
            contadorMayor++;
        }
    }
    System.out.println("Array resultado:");

    System.out.print("|Indice|");
    
    for (indice = 0; indice < 10; indice++) {
        System.out.printf(" %d %-1s" ,indice ,"|");
    }
    System.out.println(" ");
    System.out.print("|Número|");
    
    for (indice = 0; indice < 10; indice++) {
        if (contadorMenor > 0){
            System.out.printf("%3d%-1s" ,menor[indice] ,"|");
            contadorMenor--;
        }
        if (contadorMayor > 0){
        System.out.printf("%3d%-1s" ,mayor[indice] ,"|");
        contadorMayor--;
        }
    }
    System.out.println(" ");
    }
}
