/**
* 	Escribe un programa que calcule el precio final de un producto según su
  base imponible (precio antes de impuestos), el tipo de IVA aplicado (general,
  reducido o superreducido) y el código promocional. Los tipos de IVA general,
  reducido y superreducido son del 21%, 10% y 4% respectivamente. Los códigos
  promocionales pueden ser nopro, mitad, meno5 o 5porc que significan
  respectivamente que no se aplica promoción, el precio se reduce a la mitad,
  se descuentan 5 euros o se descuenta el 5%. El ejercicio se da por bueno si se
  muestran los valores correctos, aunque los números no estén tabulados.
* @author Alberto Parra 
*/
public class Ejercicio23Tema4 {
      public static void main(String[] args) {
        boolean precioValido = true;

        System.out.println("Vamos a calcular el precio final de un producto: ");
        System.out.print("Primero dime cuál es la base imponible en euros: ");
        double baseImp = Double.parseDouble(System.console().readLine());
    
        System.out.print("\nAhora dime cuál es el IVA, puede ser... ");
        System.out.println("general: 21% (escribe 1),  reducido: 10% (escribe 2), o superreducido: 4% (escribe 3)");
        int iva = Integer.parseInt(System.console().readLine());
    
        System.out.println("¿Tienes algún código promocional? (s/n): ");
        String aux = System.console().readLine();
        String codigo = "";
    
    
        if(baseImp < 0){
          precioValido = false;
        }
        double precio = baseImp;
        //Tipo de IVA
        switch (iva) {
        case 1:
          precio = precio * 1.21;
          break;
    
        case 2:
          precio = precio * 1.1;
          break;
    
        case 3:
          precio = precio * 1.04;
          break;
    
        default:
          precioValido = false;
        }
    
        if (aux.equals("s")) {
          System.out.println("Introduce tu código por favor: ");
          codigo = System.console().readLine();
    
          //Tipo de Código
          switch(codigo){
    
            case "mitad":
              precio = precio / 2;
              break;
        
            case "menos5":
              precio = precio - 5;
              break;
        
            case "5porc":
              precio -= precio * 0.05;
              break;
        
            default:
              precioValido = false;
            break;
            }
    
        }

        if(precioValido == true){
          System.out.printf("El precio final es igual a: %.2f€ \n", precio);
        } else{
          System.out.println("Hay algún dato mal introducido, por favor, inténtalo de nuevo");
        }
    
      }
    }
