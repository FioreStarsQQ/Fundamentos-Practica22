
// PROBLEMA 1:
// Crear un programa para cálcular y mostrar el
// mayor de 8 números reales:
// 1º Crear método mayor2 que devuelva el
// mayor de 2 números reales
// 2º Crear método mayor8 que devuelva el
// mayor de 8 números reales, pero reutilizando
// mayor2
import java.util.*;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a, b, c, d, e, f, g, h;
        System.out.print("Hallando el mayor de 2 números\nIngrese el primer valor: ");
        a = scan.nextDouble();
        System.out.print("Ingrese el segundo valor: ");
        b = scan.nextDouble();
        // Salida del mayor de dos numeros
        System.out.println("El mayor de los 2 números ingresados es: " + mayor2(a, b));
        // Vuelve a pedir ingresar otros numeros para hallar el mayor de 8
        System.out.print("Hallando el mayor de 8 números\nIngrese el primer valor: ");
        a = scan.nextDouble();
        System.out.print("Ingrese el segundo valor: ");
        b = scan.nextDouble();
        System.out.print("Ingrese el tercer valor: ");
        c = scan.nextDouble();
        System.out.print("Ingrese el cuarto valor: ");
        d = scan.nextDouble();
        System.out.print("Ingrese el quinto valor: ");
        e = scan.nextDouble();
        System.out.print("Ingrese el sexto valor: ");
        f = scan.nextDouble();
        System.out.print("Ingrese el séptimo valor: ");
        g = scan.nextDouble();
        System.out.print("Ingrese el octavo valor: ");
        h = scan.nextDouble();
        // Salida del mayor de 8 numeros
        System.out.println("El mayor de los 8 números ingresados es: " + mayor8(a, b, c, d, e, f, g, h));
        scan.close();
    }

    public static double mayor2(double num1, double num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static double mayor8(double num1, double num2, double num3, double num4, double num5, double num6,
            double num7, double num8) {
        return mayor2(mayor2(mayor2(num1, num2), mayor2(num3, num4)), mayor2(mayor2(num5, num6), mayor2(num7, num8)));
    }
}
