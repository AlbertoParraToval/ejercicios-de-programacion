/** Realiza un programa que pinte una tableta de turrón con un bocado realizado de
forma aleatoria. El ancho y el alto de la tableta se pide por teclado. El bocado se
da alrededor del turrón, obviamente no se puede dar un bocado por en medio
de la tableta.
 * @author Alberto Parra Toval
 */
public class Ex26_06 {
    public static void main(String[] args) {
        System.out.println("Tableta de chocolate con bocados");
        System.out.println("Introduce la anchura de la tableta: ");
        int anchuraIntroducida = Integer.parseInt(System.console().readLine());
        System.out.println("Introduce la altura de la tableta: ");
        int alturaIntroducida = Integer.parseInt(System.console().readLine());
        int position = 0;
        for (int i = 0; i < alturaIntroducida; i++) {
            System.out.print("\n*");
            position++;
            
            for (int j = 0; j < anchuraIntroducida; j++) {
                System.out.print("*");
            position++;    
            }    
            
        }
       
        
        
    
    }
}