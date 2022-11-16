import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        int[] vector = new int[5];

        Scanner entrada = new Scanner(System.in);

        for (int i=0; i<5; i++) {
            System.out.println("Ingrese un número entero para la posición "+i);
            vector[i]= entrada.nextInt();
        }


        for (int i=0; i<5; i++) {
            System.out.println("["+i+"] = "+vector[i]);
        }
    }
}
