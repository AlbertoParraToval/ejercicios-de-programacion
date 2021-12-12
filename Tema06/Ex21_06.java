import javax.print.attribute.standard.Sides;

/** Realiza un programa que genere una secuencia de cinco monedas de curso
legal lanzadas al aire. Las monedas disponibles son de 1 céntimo, 2 céntimos,
5 céntimos, 10 céntimos, 20 céntimos, 50 céntimos, 1 euro y 2 euros. Las dos
posiciones posibles son cara y cruz.
Ejemplo:
2 céntimos - cara
20 céntimos - cruz
50 céntimos - cruz
1 euro - cruz
2 euros - cara
 * @author Alberto Parra Toval
 */
public class Ex21_06 {
    public static void main(String[] args) {
        System.out.println("[Programa que lanza al aire 5 monedas]");
        //Mis dos variables 
        String moneda = "";
        String posicion = "";
        //DECLARO UN FOR PARA EL NUMERO DE TIRADAS DE MONEDAS
        for (int i = 0; i < 5; i++) {
            //CON UN SWITCH DECLARO EL NUMERO DE POSIBILIDADES
          switch((int)(Math.random() * 8)) {
            case 0:
                moneda = "1 centimo";
                break;
            case 1:
                moneda = "2 centimos";
                break;
            case 2:
                moneda = "5 centimos";
                break;
            case 3:
                moneda = "10 centimos";
                break;
            case 4:
                moneda = "20 centimos";
                break;
            case 5:
                moneda = "50 centimos";
                break;
            case 6:
                moneda = "1 euro";
                break;
            case 7:
                moneda = "2 euros";
                default:
            }

            //HAGO LO MISMO CON LAS DOS OPCIONES DE LADO
          switch((int)(Math.random() * 2)) {
            case 0:
                posicion = "cara";
                break;
            case 1:
                posicion = "cruz";
                break;
            default:
            }
            //MUESTRO EN PANTALLA EL RESULTADO FINAL
            System.out.println(moneda + " <-> " + posicion);
        }
    }
}

