public class Ejercicio3 {

    public static void main(String[] args) {
        int cont=0;


        for (int x = 1; x <= 1000; x++) {
            if (esPrimo(x)) {
                cont++;
                System.out.print(x + " ");
            }
        }
    }

    public static boolean esPrimo(int numero) {
        // El 1 y el 4 no son primos
        if (numero == 1 || numero == 4) {
            return false;
        }
        for (int x = 2; x < numero / 2; x++) {
            // Si es divisible por cualquiera de estos números, no
            // es primo
            if (numero % x == 0)
                return false;
        }
        // Si no se pudo dividir por ninguno de los de arriba, sí es primo
        return true;
    }
}
