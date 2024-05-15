import java.util.Scanner;

public class Page2_Ejer7 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" ------- TABLA DE MULTIPLICAR ------ ");
        System.out.println("Digite el número al que quiere generarle la tabla:");

        int numero = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            // numero*i= (numero*i)
            System.out.println(numero + "*" + i + "=" + (numero * i));
        }
    }
}