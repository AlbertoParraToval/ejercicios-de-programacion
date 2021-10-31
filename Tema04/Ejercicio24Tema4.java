/*
* 	Escribe un programa que genere la nómina (bien desglosada) de un empleado
*	según las siguientes condiciones:
• 
* 	Se pregunta el cargo del empleado (1 - Prog. junior, 2 - Prog. senior, 3 - Jefe
*	de proyecto), los días que ha estado de viaje visitando clientes durante el
*	mes y su estado civil (1 - Soltero, 2 - Casado).
*		
*		• El sueldo base según el cargo es de 950, 1200 y 1600 euros según
*		si se trata de un prog. junior, un prog. senior o un jefe de proyecto
*		respectivamente.
*		• Por cada día de viaje visitando clientes se pagan 30 euros extra en
*		concepto de dietas. Al sueldo neto hay que restarle el IRPF, que será de
*		un 25% en caso de estar soltero y un 20% en caso de estar casado
*/

public class Ejercicio24Tema4 {
	public static void main(String[] args) {
		System.out.println("1 - Programador junior");
		System.out.println("2 - Prog. senior");
		System.out.println("3 - Jefe de proyecto");
		System.out.print("Introduzca el cargo del empleado (1 - 3): ");
		int cargo = Integer.parseInt(System.console().readLine());
		
		System.out.print("¿Cuántos días ha estado de viaje visitando clientes? ");
    int diasVisita = Integer.parseInt(System.console().readLine());

    System.out.print("Introduzca su estado civil (1 - Soltero, 2 - Casado): ");
    int estadoCivil = Integer.parseInt(System.console().readLine());

    double sueldoBase = 0;

    switch(cargo) {
      case 1: // Programador junior
        sueldoBase = 950;
        break;
      case 2: // Programador senior
        sueldoBase = 1200;
        break;
      case 3: // jefe de proyecto
        sueldoBase = 1600;
        break;
      default:
        System.out.println("No ha elegido correctamente el sueldo base.");
    }

    double sueldoDietas = diasVisita * 30;

    double sueldoBruto = sueldoBase + sueldoDietas;

    double irpf = 0;

    if (estadoCivil == 1) { // Está soltero 
      irpf = 25;
    } else if (estadoCivil == 2) { // Estás casado
      irpf = 20;
    } else {
      System.out.println(".");
    }
    
    double cuantiaIrpf = (sueldoBruto * irpf) / 100;

    // Mostramos la tabla y el resultado final de nuestra nómina
    System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
    System.out.printf("┃ Sueldo base            %7.2f ┃\n", sueldoBase);
    System.out.printf("┃ Dietas (%2d viajes)     %7.2f ┃\n", diasVisita, sueldoDietas);
    System.out.println("┣━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┫");
    System.out.printf("┃ Sueldo en bruto        %7.2f ┃\n", sueldoBruto);
    System.out.printf("┃ Retención IRPF (%.0f%%)   %7.2f ┃\n", irpf, cuantiaIrpf);
    System.out.println("┣━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┫");
    System.out.printf("┃ Sueldo en neto         %7.2f ┃\n", sueldoBruto - cuantiaIrpf);
    System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");	
  }
}
