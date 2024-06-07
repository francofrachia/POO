package POO.tp7;

public class EmpleadoPorHora extends Empleado {
    private double sueldo;
    private double horas;

    public EmpleadoPorHora(String nombre, String apellido, String nss, double sueldo, double horas) {
        super(nombre, apellido, nss);
        this.sueldo = sueldo;
        this.horas = horas;
    }

    @Override
    public double ingresos() {
        if (horas <= 40) {
            return sueldo * horas;
        } else {
            return 40 * sueldo + (horas - 40) * sueldo * 1.5;
        }
    }

    @Override
    public String toString() {
        return String.format("Empleado por hora: %s\n%s\nSueldo por hora: %.2f\nHoras trabajadas: %.2f",
                super.toString(), "Sueldo por hora", sueldo, horas);
    }
}
