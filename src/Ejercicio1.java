import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
import java.lang.Double;

public class Ejercicio1 {
    public static void main(String[] args) {
        //crear un objeto Scanner para leer la entrada por consola
        Scanner scanner = new Scanner (System.in);

        //pedir el numero de filas (M) y Columnas (N)
        System.out.println("Ingrese el número de filas (M): ");
        int M = scanner.nextInt();
        System.out.println("Ingrese el número de columnas (N): ");
        int N = scanner.nextInt();

        //creamos la matriz
        Double[][] matriz = new Double[M][N];

        //Rellenar la matriz con numeros decimales
        System.out.println("Ingrese los números decimales para la matriz:");
        for (int i = 0; i<M; i++){
            for (int j = 0; j< N; j++){
                System.out.println("Valor para la posición [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextDouble();
            }
        }
        //mostrar matriz (punto 2)
        System.out.println("Matriz ingresada:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {

                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println(); //salto de línera después de cada fila
        }
        //Creamos la matriz para almacenar la sumatoria de cada fila
        Double[] matrizSumaroria = new Double[M];
        Double[] matrizSumatoria = new Double[M];  //acá solo almacenamos las sumas
                                                        //calculamos la sumatoria de cada fila y la almacenamos
        for (int i = 0; i < M; i++) {
            double suma = 0;
            for (int j = 0; j < N; j++) {
                suma += matriz[i][j]; //sumar los valores de la fila i
            }
            matrizSumatoria[i]= suma; //almacenamos la suma en la matriz
        }
        //Mostrar la matriz sumatoria de M filas x 1 columna
        System.out.println("\nLa matriz resultante de la suma de cada una de las filas mencionadas anteriormente es: ");
        for (int i = 0; i < M; i++) {
            System.out.println("Fila " + i+ ": " + matrizSumatoria[i]);
        }
        //creamos la matriz N x 2 para almacenar las sumas y los índices originales
        Double[][] matrizOrdenada = new Double[M][2];

        for (int i = 0; i < M; i++) {
            matrizOrdenada[i][0] = matrizSumatoria[i]; //asignamos la suma
            matrizOrdenada[i][1] = (double) i; //asignamos el índice original
        }

        //ordenamos la matriz ordenada de mayor a menor por la primera columa (sumas)
        Arrays.sort(matrizOrdenada, new Comparator<Double[]>() {
            @Override
            public int compare(Double[] o1, Double[] o2) {
                return o2 [0].compareTo(o1[0]); //ordenar de mayor a menor
            }
        });

        //mostrar matriz ordenada SIRVE IGUAL QUE LA DE ABAJO
        System.out.println("\nMatriz ordenada (sumatoria, índice original");
        for (int i = 0; i < M; i++) {
            System.out.println("[" + matrizOrdenada[i][0] + ", " + matrizOrdenada[i][1].intValue() + "]");
        }

        //matriz Nx2 que contiene la suma y el índice original ordenados SIRVE IGUAL QUE LA DE ARRIBA PERO QUEDA MAS COMPLETO
        System.out.println("\nMatriz Nx2 (Sumas ordenadas y sus índices originales):");
        for (int i = 0; i < M; i++) {
            System.out.println("Fila " + i+ ": Suma = " + matrizOrdenada[i][0] + ", Índice original = " + matrizOrdenada[i][1].intValue());
        }

        double sumatoriaColumna1 = 0.0;
        for (int i = 0; i < N; i++) {
            sumatoriaColumna1 += matrizOrdenada[i][0];
        }

        //mostrar la sumatoria
        System.out.println("La sumatoria de la columna 1 es: " + sumatoriaColumna1);

        scanner.close(); // cerrar el scanner pata evitar fuga de recursos
    }
}
