import java.util.Random;

/** Realiza un generador de melodía con las siguientes condiciones:
a) Las notas deben estar generadas al azar. Las 7 notas son do, re, mi, fa, sol,
la y si.
b) Una melodía está formada por un número aleatorio de notas mayor o igual
a 4, menor o igual a 28 y siempre múltiplo de 4 (4, 8, 12…).
c) Cada grupo de 4 notas será un compás y estará separado del siguiente
compás mediante la barra vertical (Alt + 1). El final de la melodía se marca
con dos barras.
d) La última nota de la melodía debe coincidir con la primera.

 *
 * @author Alberto Parra Toval
 */
public class Ex15_06 {
    public static void main(String[] args) {
        System.out.println("[Programa que muestra una melodia]");
        for (int longitudMelodia = (int)(Math.random()*28); longitudMelodia <= 28; longitudMelodia+=4) {
            for (int i = 0; i <=4; i++) {
                int notaMusical = (int)(Math.random() * 7);
                switch (notaMusical) {
                    case 1:
                        System.out.print("do" + " ");
                        break;
        
                    case 2:
                        System.out.print("re" + " ");
                        break;
        
                    case 3:
                        System.out.print("mi" + " ");
                        break;
        
                    case 4:
                        System.out.print("fa" + " ");
                        break;
        
                    case 5:
                        System.out.print("sol" + " ");
                        break;
        
                    case 6:
                        System.out.print("la" + " ");
                        break;
                
                    default:
                        System.out.print("si" + " ");
                        break;
                }
                
            }
            System.out.print(" | ");
        }
        System.out.println("|");
    }
}