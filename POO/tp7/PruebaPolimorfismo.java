package POO.tp7;

public class PruebaPolimorfismo {
    public static void main(String[] args) {
        Empleado[] empleados = new Empleado[3];

        empleados[0] = new EmpleadoAsalariado("Juan", "Pérez", "111-11-1111", 800.00);
        empleados[1] = new EmpleadoPorHora("Karen", "Gómez", "222-22-2222", 16.75, 40);
        empleados[2] = new EmpleadoComision("Luis", "Martínez", "333-33-3333", 10000, 0.06);

        for (Empleado empleadoActual : empleados) {
            System.out.printf("%s\nIngresos: %.2f\n\n", empleadoActual, empleadoActual.ingresos());
        }
    }
}
