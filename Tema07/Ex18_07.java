/**Realiza un programa que sea capaz de insertar un número en una posición
 * concreta de un array. En primer lugar, el programa generará un array de 12
 * números enteros aleatorios entre 0 y 200 ambos incluidos. A continuación se
 * debe mostrar el contenido de ese array junto al índice (0 – 11). Seguidamente
 * el programa preguntará por el número que se quiere insertar y por la posición
 * donde será insertado. Los números del array se desplazan a la derecha para de
 * jar sitio al nuevo. El último número (el que se encuentra en la posición 11)
 * siempre se perderá.
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
