package POO.tp2;

import java.util.Scanner;

public class ej5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int NUM_EMPLEADOS = 5;
        String nombreMayorSueldo = "";
        double sueldoMayor = 0;
        double sumaSueldos = 0;

        for (int i = 0; i < NUM_EMPLEADOS; i++) {
            System.out.println("Ingrese el nombre del empleado " + (i + 1) + ":");
            String nombre = scanner.nextLine();

            System.out.println("Ingrese el sueldo del empleado " + (i + 1) + ":");
            double sueldo = scanner.nextDouble();
            scanner.nextLine();

            if (sueldo > sueldoMayor) {
                sueldoMayor = sueldo;
                nombreMayorSueldo = nombre;
            }

            sumaSueldos += sueldo;
        }

        double sueldoPromedio = sumaSueldos / NUM_EMPLEADOS;

        System.out.println("El empleado con el mayor sueldo es: " + nombreMayorSueldo);
        System.out.println("Con un sueldo de: " + sueldoMayor);
        System.out.println("El sueldo promedio es: " + sueldoPromedio);
        
        scanner.close();
    }
}

