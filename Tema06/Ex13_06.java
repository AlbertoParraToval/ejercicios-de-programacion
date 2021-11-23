/** Escribe un programa que simule la tirada de dos dados. El programa deberá
    continuar tirando los dados una y otra vez hasta que en alguna tirada los dos
    dados tengan el mismo valor
 *
 * @author Alberto Parra Toval
 */
public class Ex13_06 {
    public static void main(String[] args) {
    System.out.println("[Programa que lanza dos dados hasta que sus resultados coincidan]");
        int primerDado = 0;
        int segundoDado = 0;
        int numeroDeTiradas = 0;
        System.out.print("Tirada de dos dados: ");
        do {
            for(int i = 0; i < 1; i++) {
                primerDado = (int)(Math.random() * 6) + 1;
                System.out.print(primerDado + " ");
                }

            for (int j = 0; j < 1; j++) {
                segundoDado = (int)(Math.random() * 6) + 1;
                System.out.print(segundoDado + " ");
            }
            numeroDeTiradas++;
        } while (primerDado != segundoDado);
        System.out.println("El numero de tiradas ha sido de " + numeroDeTiradas + " veces");
    }
}