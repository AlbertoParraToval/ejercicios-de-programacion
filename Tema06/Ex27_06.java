/** Implementa el juego piedra, papel y tijera. Primero, el usuario introduce su
jugada y luego el ordenador genera al azar una de las opciones. Si el usuario
introduce una opción incorrecta, el programa deberá mostrar un mensaje de
error.
 *
 * @author Alberto Parra Toval
 */
public class Ex27_06 {
    public static void main(String[] args) {
        System.out.print("Turno del jugador (introduzca piedra, papel o tijera): ");
        String turnoUsuario = (System.console().readLine()) ;
        System.out.println("");
        String turnoMaquina = "";
        // Si el usuario ha indroducio alguna de estas opciones 
        if ( (turnoUsuario.equals("piedra")) || (turnoUsuario.equals("papel")) || (turnoUsuario.equals("tijera"))){
        int manoMaquina = (int)(Math.random()* 3)+1; // Numero aleatorio del turno de la maquina
        switch (manoMaquina){
        case 1:
            turnoMaquina="piedra";
        break;
        case 2:
            turnoMaquina="papel";
            break;
        case 3:
            turnoMaquina="tijera";
        break;
        default:
        }
        System.out.println("Turno del ordenador: "+ turnoMaquina);
        System.out.println("");
        if (turnoUsuario.equals(turnoMaquina)){ // Si son iguales
            System.out.print("Empate"); 
        }else if ((turnoUsuario.equals("piedra")) && (turnoMaquina.equals("papel"))){ // usuario piedra, maquina papel
            System.out.print("Gana el Ordenador");
        }else if ((turnoUsuario.equals("papel")) && (turnoMaquina.equals("piedra"))){ //usuario papel, maquina piedra
            System.out.print("Gana el Usuario");
        }else if ((turnoUsuario.equals("piedra")) && (turnoMaquina.equals("tijera"))){ // usuario piedra, maquina tijera
            System.out.print("Gana el Usuario");
        }else if ((turnoUsuario.equals("tijera")) && (turnoMaquina.equals("piedra"))){ // usuario tijera, maquina piedra
            System.out.print("Gana el Ordenador");
        }else if ((turnoUsuario.equals("tijera")) && (turnoMaquina.equals("papel"))){ // usuario tijera, maquina papel
            System.out.print("Gana el Usuario");
        }else if ((turnoUsuario.equals("papel")) && (turnoMaquina.equals("tijera"))){ // usuario papel, maquina tijera
            System.out.print("Gana el Ordenador");
        }
        }else{ // Si el usuario no ha indroducido una de las opciones anteriores 
        System.out.print("La opcion introducida no es valida.");
        }
    
    } 
}