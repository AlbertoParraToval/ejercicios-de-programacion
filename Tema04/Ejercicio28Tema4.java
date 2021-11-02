






public class Ejercicio28Tema4 {

  public static void main(String[] args) {
    String jugada1;
    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijera): ");
    String jugada1 = s.nextLine();
    
    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijera): ");
    String jugada2 = s.nextLine();
    
    if (jugada1.equals(jugada2)) {
      System.out.println("Empate");
    } else {
      int ganador = 2;
      switch(jugada1) {
        case "piedra":
          if (jugada2.equals("tijera")) {
            ganador = 1;
          }
          break;
        case "papel":
          if (jugada2.equals("piedra")) {
            ganador = 1;
          }
          break;
        case "tijera":
          if (jugada2.equals("papel")) {
            ganador = 1;
          }
          break;
        default:
      }
      System.out.println("Gana el jugador " + ganador);
    }
  }
  
}
