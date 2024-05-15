import java.util.Scanner;


public class Pag3_Ejer2 {
    public static void main(String[] args) throws Exception {


        int[] numeros = new int[12];
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese numeros (12)");

       
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = teclado.nextInt();
            suma += numeros[i];
        }

        
        double promedio = (double) suma / numeros.length;

        
        System.out.println("Este es el promedio: " + promedio);
    }

}
