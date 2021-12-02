/** Escribe un programa que simule la tirada de dos dados. El programa deberá
    continuar tirando los dados una y otra vez hasta que en alguna tirada los dos
    dados tengan el mismo valor
 *
 * @author Alberto Parra Toval
 */
public class Ex23_06 {
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