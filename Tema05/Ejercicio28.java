public class Ejercicio24 {
  public static void main(String[] args) {
     for (int i = 0; i < 40; i++) {
      switch((int)(Math.random()*7)) {
        case 0:
          System.out.println("😀");
          break;
        case 1:
          System.out.println("🐱");
          break;
        case 2:
          System.out.println("🌴");
        default:
        System.out.println("_");
        break;
      }
    }  
  }
}
