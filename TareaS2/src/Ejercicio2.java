//Diferencia absoluta entre dos números donde el número 2 es el triple del primer número
import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

public class Ejercicio2 {
    public static void main(String[] args) {
        //Declarar variables
        int num1, num2, numA;
        Scanner lectura = new Scanner(System.in);
        System.out.print("Ingrese número 1: ");
        num1 = lectura.nextInt();
        num2 = num1 * 3;
        numA = Math.abs(num1 - num2);
        System.out.println("El valor absoluto es: " + numA);
    }
}