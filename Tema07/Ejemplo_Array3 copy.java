/** Escribe un programa que simule la tirada de dos dados. El programa deberá
    continuar tirando los dados una y otra vez hasta que en alguna tirada los dos
    dados tengan el mismo valor
 *
 * @author Alberto Parra Toval
 */
public class Ejemplo_Array3 {
    public static void main(String[] args) {
        String[] alumnos = {
            "Aguilera Martín, Diego",
            "Andrés Domínguez, Javier",
            "Antúnez Pérez, David",
            "Benítez Ruiz, José Antonio",
            "Castillo Muñoz, María Natalia",
            "Cueto Jiménez, Alejandro",
            "Domínguez Gómez, Sergio",
            "Egea Hermoso, Adrián",
            "García Campoy, Daniel",
            "González Pons, Verónica",
            "Jiménez García-Verdugo, José",
            "Linero Fernández, Álvaro",
            "Morales García, Sergio",
            "Moreno González, Alberto",
            "Moreno Rodríguez, Javier",
            "Parra Toval, Alberto",
            "Rodríguez Barcos, Diego",
            "Rubio Ramírez, Jorge José",
            "San Juan Thompson, Joseph Luca",
            "Servia Morales, David",
            "Sicilia Pérez, Francisco Javier",
        };
    
        System.out.print("El afortunado/a es ");
    
        for (int i = 1; i < 7; i++) {
            System.out.print(".");
            Thread.sleep(200 * i);
        }
    
        String[] colores = {"\033[31m", "\033[32m", "\033[33m", "\033[34m", "\033[35m", "\033[36m", "\033[37m"};
        
        String color = colores[(int)(Math.random() * colores.length)];
        
        System.out.println(" " + color + alumnos[(int) (Math.random() * alumnos.length)] + "");
    }
}
