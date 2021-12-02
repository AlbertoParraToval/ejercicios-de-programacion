/** Las caras de un dado de poker tienen las siguientes figuras: As, K, Q, J, 7 y 8.
Escribe un programa que genere de forma aleatoria la tirada de cinco dados.
 *
 * @author Alberto Parra Toval
 */
public class Ex22_06 {
    public static void main(String[] args) {
        System.out.println("Realiza una tirada de dados con figuras del poker");
        String dados = "";
        
        for (int i = 0; i < 5; i++) {
            switch((int)(Math.random() * 6)) {
                case 0:
                    dados = "As";
                    break;
                case 1:
                    dados = "K";
                    break;
                case 2:
                    dados = "Q";
                    break;
                case 3:
                    dados = "J";
                    break;
                case 4:
                    dados = "7";
                    break;
                case 5:
                    dados = "8";
                    break;
                    default:
                }
                System.out.print(dados + " ");
        }
        
    }
}
