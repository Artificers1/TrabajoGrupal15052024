import java.util.Scanner;

public class Pag3_Ejer1 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        String[] frutas = new String[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Ingresa la fruta");
            frutas[i] = teclado.nextLine();
        }
        for (int i = 9; i >= 0; i--) {
            System.out.println(frutas[i]);
        }
    }
}
