import java.util.Scanner;

public class Pag3_Ejer6 {
     public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

    
        int[][] matriz = new int[3][3];
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese los valores para la matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Ingrese el valor en la posición [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("La matriz original es:");
        mostrarMatriz(matriz);

        int[][] transpuesta = calcularTranspuesta(matriz);
        System.out.println("La transpuesta de la matriz es:");
        mostrarMatriz(transpuesta);
    }

    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] calcularTranspuesta(int[][] matriz) {
        int[][] transpuesta = new int[matriz[0].length][matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        }
        return transpuesta;
    }
}