import funciones.ejemploExamen;
public class Ejercicio_Descartado {
  public static void main(String[] args) {
    System.out.print("Introduce el largo del array: ");
    int lado = Integer.parseInt(System.console().readLine());
    System.out.println();
    int[][] a = new int[lado][lado];

    int contador = 1;
    int fila = 0;
    String direccion = "derecha";
    int columna = 0;
    int incFila = 0;
    int incColumna = 1;
    int contadorSegmento = 0;
    int longitudSegmento = lado;

    for (int i = 0; i < lado * lado; i++) { //Multiplico lado por lado para obtener un cuadrado (8x8)
      a[fila][columna] = contador++; 

      contadorSegmento++;

      if (contadorSegmento == longitudSegmento) { // Para los bordes que vaya cambiando direccion
        contadorSegmento = 0;
        //Para las filas
        switch (direccion) {
          case "derecha":
            direccion = "abajo";
            longitudSegmento--;
            break;
          case "abajo":
            direccion = "izquierda";
            break;
          case "izquierda":
            direccion = "arriba";
            longitudSegmento--;
            break;
          case "arriba":
            direccion = "derecha";
            break;
          default:
        }
      }
      //Para las columnas
      switch (direccion) {
        case "derecha":
          incFila = 0;
          incColumna = 1;
          break;
        case "abajo":
          incFila = 1;
          incColumna = 0;
          break;
        case "izquierda":
          incFila = 0;
          incColumna = -1;
          break;
        case "arriba":
          incFila = -1;
          incColumna = 0;
          break;
        default:
      }

      columna += incColumna;
      fila += incFila;
    }

    System.out.println();
    //MOstramos el array llamando a la funcion
    funciones.ejemploExamen.muestraArrayIntBi(a);
  }

}
