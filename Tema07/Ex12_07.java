/** Escribe un programa que pida 10 números por teclado y que luego muestre los
números introducidos junto con las palabras máximo y mínimo al lado del
máximo y del mínimo respectivamente.
 *
 * @author Alberto Parra Toval
 */
public class Ex12_07 {
    public static void main(String[] args) {
        System.out.println("[Programa que pida 10 numeros y luego mostrar el max y el min]");
        System.out.println("Introduzca 10 numeros y pulse INTRO: ");
        int[] num = new int[10];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int i;
        
        
        for (i = 0; i < 10; i++) {
            num[i] = Integer.parseInt(System.console().readLine());
        
            if (num[i] < min) {
                min = num[i];
            }
        
            if (num[i] > max)  {
            max = num[i];
            }
        }
        
        System.out.println();
        
        for (i = 0; i < 10; i++) {
            System.out.print(num[i]);
            if (num[i] == max) {
            System.out.print(": maximo");
            }
        
            if (num[i] == min) {
            System.out.print(": minimo");
            }
            System.out.println();
        }
    }
}


