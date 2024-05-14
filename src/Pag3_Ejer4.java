
import java.util.Scanner;

public class Pag3_Ejer4 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in); // Crea un objeto Scanner llamado 'teclado' para leer la entrada del usuario

        // System.out.println("Por favor ingese el tamaño del array:");
         //int n = teclado.nextInt();
         //int array [] = new int[n];
 
         int[] array = new int[10]; // Crea un array de enteros de tamaño 10
 
         // Solicita al usuario que ingrese diez números y los almacena en el array
         for (int i = 0; i < array.length; i++) {
             System.out.print("Ingrese dato" + (i + 1) + ": "); // Solicita al usuario que ingrese un número
             array[i] = teclado.nextInt(); // Lee el número ingresado por el usuario y lo almacena en el array
         }
 
         int mayor, menor; // Declara variables para almacenar el mayor y el menor número
         mayor = menor = array[0]; // Inicializa las variables 'mayor' y 'menor' con el primer elemento del array
 
         // Itera sobre el array para encontrar el mayor y el menor número
         for (int i = 0; i < array.length; i++) {
             if (array[i] > mayor) { // Comprueba si el elemento actual es mayor que el mayor encontrado hasta ahora
                 mayor = array[i]; // Si es así, actualiza el valor de 'mayor'
             }
             if (array[i] < menor) { // Comprueba si el elemento actual es menor que el menor encontrado hasta ahora
                 menor = array[i]; // Si es así, actualiza el valor de 'menor'
             }
         }
         // Imprime el mayor y el menor número encontrados
         System.out.println("El mayor valor es :" + mayor);
         System.out.println("El menor valor es :" + menor);
    }
}