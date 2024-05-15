import java.util.Scanner;


public class Pag1_E4 {
    public static void main(String[] args) throws Exception {
       Scanner entrada = new Scanner(System.in);

       // declaración de variables de tipo float
       float c1;
       float c2;
       double hipotenusa;

       System.out.println("Ingrese la longitud del primer cateto : ");
        c1 = entrada.nextFloat();

        System.out.println("Ingrese la longitud del segundo cateto : ");
        c2 = entrada.nextFloat();

        /*Se calcula el cuadrado de cada cateto y se suman luego se usa Math.sqrt para calcular la 
        raíz de la suma
        */
        hipotenusa = Math.sqrt(Math.pow(c1, 2) + Math.pow(c2, 2));

        System.out.println("La longitud de la hipotenusa es :" + hipotenusa);

        entrada.close();
    
    }
}