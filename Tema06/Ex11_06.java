/** Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) separados por espacios
 *
 * @author Alberto Parra Toval
 */
public class Ex11_06 {
    public static void main(String[] args) {
        System.out.println("[Programa que muestra 20 notas generadas al azar]");
        //Defino las varibles 
        int notas;
        int numBien = 0;
        int numNotable = 0;
        int numSobre = 0;
        int numSuficientes = 0;
        int numSuspensos = 0;
        
        //El bucle se repetira 20 veces  
        for (int i = 1; i <= 20; i++) {
            notas = (int)(Math.random()*9 + 1);  // La variable notas se genera un numero aleatorio del 0 al 10
            switch (notas) {
                case 1: //Si la nota es sobresaliente
                System.out.println("Sobresaliente");
                numSobre++;
                    break;

                case 2: //Si la nota es notable
                System.out.println("Notable");
                numNotable++;
                    break;

                case 3: //Si la nota es Bien
                System.out.println("Bien");
                numBien++;
                    break;
            
                case 4: // Si la nota es suficiente
                System.out.println("Suficiente");
                numSuficientes++;
                    break;
            
                default: //Si la nota es suspenso
                System.out.println("Suspenso");
                numSuspensos++;
                    break;
            }
        }

        //Mostramos los resultados de los numeros que han salido
        System.out.println(" ");
        System.out.println("Las notas con sobresaliente son: " + numSobre);
        System.out.println("Las notas con notable son: " + numNotable);
        System.out.println("Las notas con bien son: " + numBien);
        System.out.println("Las notas con suficiente " + numSuficientes);
        System.out.println("Las notas con suspenso " + numSuspensos);
    }
}