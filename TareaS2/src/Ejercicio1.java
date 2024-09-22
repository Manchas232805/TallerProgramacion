//Calculando la hipotenusa de un triangulo rectangulo
package Programas;
import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;
public class Ejercicio1 {
    public static void main (String[] args) {
        //Declarando variables
        double hipotenusa, cateto1, cateto2;
        Scanner lectura = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("##.00");
        //Entrdada de datos
        System.out.println("Ingrese el cateto 1: ");
        cateto1 = lectura.nextDouble();
        System.out.println("Ingrese el cateto 2: ");
        cateto2 = lectura.nextDouble();
        //Proceso de datos
        hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
        //Salida de datos
        System.out.println("La hipotenusa es " + decimal.format(hipotenusa));
    }
}
