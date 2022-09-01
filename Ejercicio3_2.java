// PROBLEMA 3:
// Calcular la distancia entre STARBUCKS y la
// ubicación de un turista. Se ingresan las
// coordenadas de cada uno x,y
// 2 versiones: sin métodos, con métodos

import java.text.DecimalFormat;
import java.util.*;

public class Ejercicio3_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat redondeo = new DecimalFormat("0.00");
        int x1, y1, x2, y2;
        double distancia;

        System.out.print("Hallando distancia con coordenadas\nIngrese las coordenadas de la ubicación de STARBUCKS\nx1: ");
        x1 = scan.nextInt();
        System.out.print("y1: ");
        y1 = scan.nextInt();
        System.out.print("Ingrese las coordenadas de la ubicación del turista\nx2: ");
        x2 = scan.nextInt();
        System.out.print("y2: ");
        y2 = scan.nextInt();
        scan.close();
        distancia = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        // Salida con redondeo
        System.out.println("La distancia entre ambos puntos es " + redondeo.format(distancia));
    }
}