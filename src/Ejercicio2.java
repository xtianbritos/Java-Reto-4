import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        int[] arreglo = new int[20];
        int x = 0;
        List<Integer> pares = new ArrayList<Integer>();
        List<Integer> inpares = new ArrayList<Integer>();

        Scanner entrada = new Scanner(System.in);

        for (int i=0; i<arreglo.length; i++) {
            System.out.println("Ingrese un número aleatorio entre 1 y 100 para la posicón "+i);
            arreglo[i]= entrada.nextInt();
        }

        while(x < arreglo.length) {
            if(arreglo[x] % 2 == 0) {
                pares.add(arreglo[x]);
            }
            else{
                inpares.add(arreglo[x]);
            }
            x++;
        }

        System.out.print("Números pares: ");
        for (int i=0; i<pares.size(); i++) {
            System.out.print(pares.get(i)+" ");
        }

        System.out.println("");

        System.out.print("Números inpares: ");
        for (int i=0; i<inpares.size(); i++) {
            System.out.print(inpares.get(i)+" ");
        }
    }
}
