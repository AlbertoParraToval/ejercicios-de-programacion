
/** Escribe un programa que simule la tirada de dos dados. El programa deberá
    continuar tirando los dados una y otra vez hasta que en alguna tirada los dos
    dados tengan el mismo valor
 *
 * @author Alberto Parra Toval
 */
public class Ex29_06 {
    public static void main(String[] args) {
      int temperatura1=0; 
      int temperatura2=0;
      int probSoleadoNublado=(int)(Math.random()*10);
      String estadoCielo="";
      //MOSTRAMOS LAS POSIBLES ESTACIONES Y PEDIMOS ELEGIR UNA
      System.out.println("1. Primavera");
      System.out.println("2. Verano");
      System.out.println("3. Otoño");
      System.out.println("4. Invierno");
      System.out.print("Seleccione la estación del año (1-4): ");
      int estacion = Integer.parseInt(System.console().readLine()) ;
      System.out.println("Previsión del tiempo para mañana");
      System.out.println("--------------------------------");
      
      switch (estacion){
        //VERANO
        case 1:
          temperatura1 =(int)(Math.random()* 16 + 15);
          temperatura2 =(int)(Math.random()* 16 + 15);
          switch(probSoleadoNublado){
            case 1:
              estadoCielo="Nublado";
            break;
            case 2:
              estadoCielo="Nublado";
            break;
            case 3:
              estadoCielo="Nublado";
            break;
            case 4:
              estadoCielo="Nublado";
            break;
            default:
              estadoCielo="Soleado";
            break;
          }
        break;
        //PRIMAVERA
        case 2:
          temperatura1 =(int)(Math.random()* 21 + 25);
          temperatura2 =(int)(Math.random()* 21 + 25);
          switch(probSoleadoNublado){
            case 1:
              estadoCielo="Nublado";
            break;
            case 2:
              estadoCielo="Nublado";
            break;
            default:
              estadoCielo="Soleado";
            break;
          }
        break;
        //OTOÑO
        case 3:
          temperatura1 =(int)(Math.random()* 11 + 30);
          temperatura2 =(int)(Math.random()* 11 + 30);
          switch(probSoleadoNublado){
            case 1:
              estadoCielo="Nublado";
            break;
            case 2:
              estadoCielo="Nublado";
            break;
            case 3:
              estadoCielo="Nublado";
            break;
            case 4:
              estadoCielo="Nublado";
            break;
            default:
              estadoCielo="Soleado";
            break;
          }
        break;
        //INVIERNO
        case 4:
          temperatura1 =(int)(Math.random()* 25);
          temperatura2 =(int)(Math.random()* 25);
          switch(probSoleadoNublado){
            case 1:
              estadoCielo="Soleado";
            break;
            case 2:
              estadoCielo="Soleado";
            break;
            default:
              estadoCielo="Nublado";
            break;
          }
        break;
        default:
        
      }
      if (temperatura1 <= temperatura2){
        System.out.println("Temperatura mín: "+ temperatura1);
        System.out.println("Temperatura max: "+ temperatura2);
        System.out.println(estadoCielo);
      }else if (temperatura2 <= temperatura1){
        System.out.println("Temperatura min: "+ temperatura2);
        System.out.println("Temperatura max: "+ temperatura1);
        System.out.println(estadoCielo);
      }
      temperatura2 =(int)(Math.random()* 45)+25;
    }
}
    