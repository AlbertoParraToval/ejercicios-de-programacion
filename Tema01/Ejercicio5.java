public class Ejercicio5 { // Clase principal
  public static void main(String[] args) {
   String rojo="\033[31m";
   String naranja="\033[33m";
   String azul="\033[34m";
   String blanco="\033[37m";
   String morado="\033[35m";
   String celeste="\033[36m";
   String verde="\033[32m";


 System.out.println(celeste + "Lunes\tMartes\tMier\tJueves\tViernes");
    System.out.println("======\t======\t======\t======\t=======");
    System.out.println(morado + "Prog\tPro" + verde "\tSist" + morado + "\tProg" + verde "\tSist");
    System.out.println("Prog\tProg\tSist\tProg\tSist");
    System.out.println("Leng\tProg\tSist\tProg\tSist");
    System.out.println("Entor\tBases\tLeng\tBases\tFol");
    System.out.println("Entor\tBases\tLeng\tBases\tFol");
    System.out.println("Entor\tBases\tLeng\tBases\tFol");
  }
}
