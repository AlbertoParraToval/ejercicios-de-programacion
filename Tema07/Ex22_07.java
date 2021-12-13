/** Escribe un programa que rellene un array de 15 elementos con números enteros
 * comprendidos entre 0 y 500 (ambos incluidos). A continuación, se mostrará el
 * array cincuerizado, según el siguiente criterio: si el número que hay en una
 * posición del array es múltiplo de 5, se deja igual, y si no, se cambia por el
 * siguiente múltiplo de 5 que exista a partir de él.
 *
 * @author Alberto Parra Toval
 */
public class Ex22_07 {
    public static void main(String[] args) {
        System.out.print("Introduzca el tamano del array: ");
        int tamano = Integer.parseInt(System.console().readLine()); //Tamaño del array
        System.out.println("Array original: ");
        System.out.print("Indice ");
        int [] numero = new int[tamano]; 
        for (int i = 0; i < tamano;i++){ //Se pinta el indice el nuemro de veces del array
        System.out.printf(" %3d|",i);
        }
        System.out.println(" ");
        System.out.print("Valor  ");
        for (int i = 0; i < tamano;i++){  
        numero[i] = (int)(Math.random()*201); //Las posibilidades
        System.out.printf(" %3d|",numero[i]); 
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Array resultado: ");
        System.out.print("Indice ");
        for (int i = 0; i < tamano;i++){
            System.out.printf(" %3d|",i);
        }
        System.out.println(" ");
        System.out.print("Valor  ");
        System.out.printf(" %3d|",numero[0]);
        int [] numerosHaciaDentro = new int[tamano];
        int [] numerosHaciaFuera = new int[tamano];
        int indice2=0;
        int indice3=0;
        
        for (int i = 0; i < tamano; i++){ 
        switch (i){
        case 0:
        break;
        default:
        //Los numeros que sean pares se mostraran de menor a mayor ("Hacia Dentro")
            if ((numero[i]%2)==0){
                numerosHaciaDentro[indice2]=numero[i];
                indice2++;
            }else{
        //Y los que sean impares hacia fuera de mayor a menor 
            numerosHaciaFuera[indice3]=numero[i];
            indice3++;
            }
            break;
            }
        }
    
    /** Primero muestro los numeros pares de menor a mayor **/
        for (int i = 0; i < indice2; i++){
        System.out.printf(" %3d|",numerosHaciaDentro[i]);
        }
        /** Primero muestro los numeros pares de mayor a menor **/
        for (int i = indice3 -1; i >= 0; i--){
        System.out.printf(" %3d|",numerosHaciaFuera[i]);
        }
    }
}

