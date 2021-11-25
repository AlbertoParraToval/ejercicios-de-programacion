/** Realiza un simulador de máquina tragaperras simplificada que cumpla los
siguientes requisitos:
a) El ordenador mostrará una tirada que consiste en mostrar 3 figuras. Hay 5
figuras posibles: corazón, diamante, herradura, campana y limón.
b) Si las tres figuras son diferentes se debe mostrar el mensaje Lo siento, ha
perdido.
c) Si hay dos figuras iguales y una diferente se debe mostrar el mensaje Bien,
ha recuperado su moneda.
d) Si las tres figuras son iguales se debe mostrar Enhorabuena, ha ganado
10 monedas.
 *
 * @author Alberto Parra Toval
 */
public class Ex16_06 {
    public static void main(String[] args) {
        System.out.println("[Programa que simula un tragaperras, Suerte!!]");
        System.out.println("----------------------------------------------");
        int figura;
        int figura1 = 0;
        int figura2 = 0;
        int figura3 = 0;
            //Hacemos el for con la condicion de que max sea 3 y un switch con las posibles opciones.
        for (int i = 0; i < 3; i++) {
          figura = (int)(5 * Math.random());
            switch(figura) {
            case 0:
                System.out.print(" [corazon] ");
                break;
            case 1:
                System.out.print(" [diamante] ");
                break;
            case 2:
                System.out.print(" [herradura] ");
                break;
            case 3:
                System.out.print(" [campana] ");
                break;
            case 4:
                System.out.print(" [limon] ");
                break;
            default:
        }
            //Hacemos el switch para almacenar que figura es cada una y su resultado
        switch(i) {
            case 0:
                figura1 = figura;
                break;
            case 1:
                figura2 = figura;
            break;
            case 2:
                figura3 = figura;
            break;
            default:
            }
        }
            //Ponemos las condiciones:
            //1º Decimos que si ninguna de las figura es igual .
            //2º Decimos que si dos de las figuras son iguales.
            //3ºDecimos que todas las figuras son iguales.
            if ((figura1 != figura2) && (figura2 != figura3) && (figura1 != figura3)) {
            System.out.print("\nLo siento, ha perdido.");
            } else if ((figura1 == figura2) && (figura2 == figura3)) {
            System.out.print("\nEnhorabuena, ha ganado 10 monedas.");
            } else {
            System.out.print("\nBien, ha recuperado su moneda.");
            }
        }
    }