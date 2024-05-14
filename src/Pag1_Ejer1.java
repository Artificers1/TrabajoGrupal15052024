import java.util.Scanner;
public class Pag1_Ejer1 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);
        short b;
        short a;
        System.out.println("Ingrese la altura: ");
        a = teclado.nextShort();

        System.out.println("Ingrese la base: ");
        b = teclado.nextShort();

        System.out.println("El area es: " + (b*a));

    }
}
