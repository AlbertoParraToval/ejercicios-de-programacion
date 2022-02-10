import Ex04_09.Fraccion;
public class Main_04_09 {
  public static void main(String[] args) {
    /**
     * Ejercicio 4 Crea la clase Fracción. Los atributos serán numerador y
     * denominador. Y algunos de los
     * métodos pueden ser invierte, simplifica, multiplica, divide, etc.e
     */
    System.out.println("EJERCICIO 4");
    System.out.print("===============");
    System.out.println();
    System.out.print("Introduce el numerador: ");
    int numerador = Integer.parseInt(System.console().readLine());
    System.out.println();
    System.out.print("Introduce el denominador: ");
    int denominador = Integer.parseInt(System.console().readLine());
    System.out.println();
    Fraccion fraccion1 = new Fraccion();
    fraccion1.multiplicar(numerador, denominador);
    fraccion1.dividir(numerador, denominador);
    fraccion1.invertido(numerador, denominador);
    fraccion1.simplificacion(numerador, denominador);
  }
}