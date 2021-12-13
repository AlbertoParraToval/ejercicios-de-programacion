/** Realiza un programa que pida 8 números enteros y que luego muestre esos
 * números junto con la palabra par o impar según proceda.
 *
 * @author Alberto Parra Toval
 */
public class Ex17_07 {
    public static void main(String[] args) {
        System.out.print("Introduce 8 numeros y el programa te muestra el los impares y pares:\n");
        int [] numero = new int[8]; // Longitud de mi array 
        for (int i = 0; i < 8;i++){ // Numero de veces que se ha generado numero aleatorios que se guardan en mi array
        System.out.printf("%2dº numero: ",(i + 1));
        numero[i] = Integer.parseInt(System.console().readLine());
        }
        int indice = 0;
        while  (indice < 8){
        if ((numero[indice] % 2)== 0){ //Comprobamos si es par o impar
            System.out.println(numero[indice]+"Par ");
        
        }else {
            System.out.println(numero[indice]+"Impar ");
        }
        indice++; //Para que poco a poco se vaya del bucle
        } 
    }
}

