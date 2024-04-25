package POO.tp2;
import java.util.Arrays;

public class ej4 {

    public static void main(String[] args) {
        int[] numeros = {4, 2, 3, 8, 1};
        procesarArray(numeros);
    }

    public static void procesarArray(int[] numeros) {
        int cantidad = numeros.length;
        System.out.println("Cantidad de números en el array: " + cantidad);

        int mayor = Arrays.stream(numeros).max().getAsInt();
        System.out.println("El número mayor en el array: " + mayor);

        double suma = 0;
        for (int num : numeros) {
            suma += num;
        }
        double promedio = suma / cantidad;
        System.out.println("El promedio de los números: " + promedio);

        Arrays.sort(numeros);
        System.out.println("Números ordenados de menor a mayor: " + Arrays.toString(numeros));

        int[] numerosInversos = new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
            numerosInversos[i] = numeros[cantidad - 1 - i];
        }
        System.out.println("Números ordenados de mayor a menor: " + Arrays.toString(numerosInversos));
    }
}

