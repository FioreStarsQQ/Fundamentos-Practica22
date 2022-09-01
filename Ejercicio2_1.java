// PROBLEMA 2, VERSION CON METODO:
// Se desea leer dos enteros y mostrar el
// producto de sus factoriales si existen, y el
// mensaje “error” en caso contrario.
// Hacer versión sin métodos y con método
// factorial(num)

import java.util.*;

public class Ejercicio2_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1, num2;

        System.out.print("Hallando factoriales\nIngrese el primer valor: ");
        num1 = scan.nextInt();
        System.out.print("Ingrese el otro valor: ");
        num2 = scan.nextInt();
        factorial(num1);
        factorial(num2);
        scan.close();
    }

    public static void factorial(int a) {
        int factorial = 1;
        if (a < 0) {
            System.out.println("ERROR. El producto factorial de un número negativo es indefinido.");
        } else {
            for (int i = 1; i <= a; i++) {
                factorial *= i;
            }
            System.out.println("* " + a + "! = " + factorial);
        }
    }
}
