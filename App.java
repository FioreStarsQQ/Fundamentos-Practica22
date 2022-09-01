// PROBLEMA 3:
// Calcular la distancia entre STARBUCKS y la
// ubicación de un turista. Se ingresan las
// coordenadas de cada uno x,y
// 2 versiones: sin métodos, con métodos

// import java.util.*;

// public class App {
//     public static void main(String[] args) {
//         int x=0, y=0, x1, y1, x2, y2;

//         System.out.print("Hallando distancia con coordenadas\nIngrese las coordenadas de la ubicación de STARBUCKS");
//         pedirCoordenadas();
//         x1=x;
//         y1 =y;
//         System.out.println("La distancia entre ambos puntos es " + distanciaPuntos(x1, x2, y1, y2));
//     }

//     public static void pedirCoordenadas() {
//         Scanner scan = new Scanner(System.in);
//         int xa, ya;
//         System.out.print("x1: ");
//         xa = scan.nextInt();
//         System.out.print("y1: ");
//         ya = scan.nextInt();
//         scan.close();
//         x = xa;
//         y = ya;
//     }

//     public static double distanciaPuntos(int xa, int xb, int ya, int yb) {
//         double distancia;
//         distancia = Math.sqrt(Math.pow(xa - xb, 2) + Math.pow(ya - yb, 2));
//         return distancia;
//     }
// }