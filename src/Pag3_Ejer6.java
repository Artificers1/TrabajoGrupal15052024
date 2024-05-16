import java.util.Scanner;

public class Pag3_Ejer6 {

    public class MultiplosDeCinco {
        public static void main(String[] args) {
            // Iterar sobre los primeros 50 múltiplos de 5
            for (int i = 1; i <= 50; i++) {
                // Calcular el múltiplo de 5
                int multiplo = i * 5;
                // Mostrar el resultado
                System.out.println("Múltiplo " + i + " de 5: " + multiplo);
            }
        }
    }
}