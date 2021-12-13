/**
 *  Realiza una programa que calcule las horas transcurridas entre dos horas de
dos días de la semana. No se tendrán en cuenta los minutos ni los segundos.
El día de la semana se puede pedir como un número (del 1 al 7) o como una
cadena (de lunes a domingo). Se debe comprobar que el usuario introduce
los datos correctamente y que el segundo día es posterior al primero
.

 * @author Alberto Parra Toval
 */
public class Ex30_05 {
    public static void main(String[] args) {
        System.out.println("[Programa que calcula el tramo entre dos horas]");
        System.out.println("----------------------------------------------");
        //Defino las varibles
        int horacompleta = 0;
        int horacompleta2 = 0;
        int dia1=0;
        int dia2=0;
        String nombredia1 = "a";
        String nombredia2 = "a";
        int segundahora = 0;
        int primerahora = 0;
        int contadorRepetir = 1;
        //Meto todo dentro de un do-while con la condicion de que contador Repetir sea mayuor que 0
        do{
            //Introducimos la primera hora donde vamos sumadno de 24 en 24 por cada dia de la semana
            System.out.println("Por favor, introduzca la primera hora");
            System.out.print("Día: ");
            String dia = System.console().readLine();
            switch (dia.toLowerCase()){
            case "lunes":
                dia1=1;
                nombredia1 = "lunes";
                horacompleta = 0;
            break;
            case "martes":
                horacompleta=24;
                nombredia1 = "martes";
                dia1=2;
            break;
            case "miercoles":
                dia1=3;
                nombredia1 = "miercoles";
                horacompleta=48;
            break;
            case "jueves":
                dia1=4;
                nombredia1 = "jueves";
                horacompleta=72;
            break;
            case "viernes":
                dia1=5;
                nombredia1 = "viernes";
                horacompleta=96;
            break;
            case "sabado":
                dia1=6;
                nombredia1 = "sabado";
                horacompleta=120;
            break;
            case "domingo":
                dia1=7;
                nombredia1 = "domingo";
                horacompleta=144;
            break;
            default:
                dia1=0;
            }
            // Introducimos ahroa la hora del primer dia
            System.out.print("Introduce la primera hora: ");
            primerahora = Integer.parseInt(System.console().readLine()) ;

            //Introducimos la segunda hora del segundo dia
            System.out.println("Por favor, introduzca la segunda hora");
            System.out.print("Día: ");
            dia = System.console().readLine();
        
            switch (dia.toLowerCase()){
            case "lunes":
                dia2=1;
                nombredia2 = "lunes";
                horacompleta2 = 0;
            break;
            case "martes":
                horacompleta2=24;
                nombredia2 = "martes";
                dia2=2;
            break;
            case "miercoles":
                dia2=3;
                nombredia2 = "miercoles";
                horacompleta2=48;
            break;
            case "jueves":
                dia2=4;
                nombredia2 = "jueves";
                horacompleta2=72;
            break;
            case "viernes":
                dia2=5;
                nombredia2 = "viernes";
                horacompleta2=96;
            break;
            case "sabado":
                dia2=6;
                nombredia2 = "sabado";
                horacompleta2=120;
            break;
            case "domingo":
                dia2=7;
                nombredia2 = "domingo";
                horacompleta2=144;
            break;
            default:
            dia2=0;
            }
            System.out.print("Introduce la segunda hora: ");
            segundahora = Integer.parseInt(System.console().readLine()) ;
            contadorRepetir--;

            // Si el primer dia es mayor o igual al dia dos o es igual a 0 
            if ((dia1 >= dia2) || (dia1 == 0)){
            System.out.println("El segundo dia debe ser posterior o existe un error sintactico");
            System.out.println(" ");
            contadorRepetir++;
            }
            // sucede alguna de estas condiciones
            if (((primerahora < 0) || (primerahora > 25)) || ((segundahora < 0) || (segundahora > 25))){
            System.out.println("Las horas deben estar comprendidas entre 1 - 24");
            System.out.println(" ");
            contadorRepetir++;
            }
        }while (contadorRepetir > 0);
    }
}
