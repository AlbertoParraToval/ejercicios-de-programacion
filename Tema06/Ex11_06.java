/** Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) separados por espacios
 *
 * @author Alberto Parra Toval
 */
public class Ex11_06 {
    public static void main(String[] args) {
        System.out.println("[Programa que muestra 20 notas generadas al azar]");
        int notas;
        int numBien = 0;
        int numNotable = 0;
        int numSobre = 0;
        int numSuficientes = 0;
        int numSuspensos = 0;
        for (int i = 1; i <= 20; i++) {
            notas = (int)(Math.random()*9 + 1);
            switch (notas) {
                case 1:
                System.out.println("Sobresaliente");
                numSobre++;
                    break;

                case 2:
                System.out.println("Notable");
                numNotable++;
                    break;

                case 3:
                System.out.println("Bien");
                numBien++;
                    break;
            
                case 4:
                System.out.println("Suficiente");
                numSuficientes++;
                    break;
            
                default:
                System.out.println("Suspenso");
                numSuspensos++;
                    break;
            }
        }
        System.out.println(" ");;
        System.out.println("Las notas con sobresaliente son: " + numSobre);
        System.out.println("Las notas con notable son: " + numNotable);
        System.out.println("Las notas con bien son: " + numBien);
        System.out.println("Las notas con suficiente " + numSuficientes);
        System.out.println("Las notas con suspenso " + numSuspensos);
    }
}