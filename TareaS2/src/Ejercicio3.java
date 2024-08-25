import java.util.Scanner;
import java.lang.Math;
public class Ejercicio3 {
    public static void main (String[] args) {
        //Declarar variables
        double X1, X2, Y1, Y2, d;
        Scanner lectura = new Scanner(System.in);
        //Entrada de datos
        System.out.print("Ingrese x1: ");
        X1 = lectura.nextDouble();
        System.out.print("Ingrese y1: ");
        Y1 = lectura.nextDouble();
        System.out.print("Ingrese x2: ");
        X2 = lectura.nextDouble();
        System.out.print("Ingrese y2: ");
        Y2 = lectura.nextDouble();
        //Proceso de datos
        d = Math.sqrt(Math.pow((X2 - X1), 2) + Math.pow((Y2 - Y1), 2));
        //Salida de datos
        System.out.println("La distancia es: " + d);
    }
}
