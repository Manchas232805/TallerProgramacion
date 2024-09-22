package Programas;
import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

public class Ejercicio2 {
    public static void main(String[] args) {
        //Declarar variables
        int num1, num2, numA;
        Scanner lectura = new Scanner(System.in);
        //Entrada de datos
        System.out.print("Ingrese número 1: ");
        num1 = lectura.nextInt();
        //Proceso de datos
        num2 = num1 * 3;
        numA = Math.abs(num1 - num2);
        //Salida de datos
        System.out.println("El valor absoluto es: " + numA);
    }
}
