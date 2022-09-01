
// PROBLEMA 2, VERSION SIN METODO:
// Se desea leer dos enteros y mostrar el
// producto de sus factoriales si existen, y el
// mensaje “error” en caso contrario.
// Hacer versión sin métodos y con método
// factorial(num)

import java.util.*;

public class Ejercicio2_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1, num2, factorial1=1, factorial2=1;

        System.out.print("Hallando factoriales\nIngrese el primer valor: ");
        num1 = scan.nextInt();
        System.out.print("Ingrese el otro valor: ");
        num2 = scan.nextInt();
        if (num1 < 0) {
            System.out.println("ERROR. El producto factorial de un número negativo es indefinido.");
        } else {
            for (int i = 1; i <= num1; i++) {
                factorial1 *= i;
            }
            System.out.println("* " + num1 + "! = " + factorial1);
        }
        if (num2 < 0) {
            System.out.println("ERROR. El producto factorial de un número negativo es indefinido.");
        } else {
            for (int i = 1; i <= num2; i++) {
                factorial2 *= i;
            }
            System.out.println("* " + num2 + "! = " + factorial2);
        }
        scan.close();
    }
}
