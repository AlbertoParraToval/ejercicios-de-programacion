package Ex04_09;

public class Fraccion {
  int numerador;
  int denominador;
  
  
  public int multiplicar (int numerador, int denominador) {
    this.numerador = numerador;
    this.denominador = denominador;
    int resultado = numerador *= denominador;
    System.out.println("El resultado de la multiplicacion es " + resultado);
    return resultado;
  }


  public int dividir (int numerador, int denominador) {
    this.numerador = numerador;
    this.denominador = denominador;
    int resultado = numerador /= denominador;
    System.out.println("El resultado de la division es " + resultado);
    return resultado;
  }


  public String invertido (int denominador, int numerador) {
    this.numerador = denominador;
    this.denominador = numerador;
    String resultado =  numerador + " / " + denominador;
    System.out.println("El fraccion invertida es: " + resultado);
    return resultado;
  }


  private int simplificar(){
    int aux1=Math.abs(numerador);
    int aux2=Math.abs(denominador);
    if(aux1==0){
        return aux1;
    }
    int r;
    while(aux2!=0){
        r = aux1 % aux2;
        aux1 = aux2;
        aux2 = r;
    }
    return aux1;
  }

  public String simplificacion(int numerador, int denominador) {
      int dividir= simplificar();
      numerador/=dividir;
      denominador/=dividir;
      String resultado = numerador + " / " + denominador;
      System.out.println("La fraccion simplicada: " + resultado);
      return resultado; 
  }





  



}


