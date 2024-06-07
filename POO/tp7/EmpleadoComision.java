package POO.tp7;

public class EmpleadoComision extends Empleado {
    private double ventasBrutas;
    private double tarifaComision;

    public EmpleadoComision(String nombre, String apellido, String nss, double ventasBrutas, double tarifaComision) {
        super(nombre, apellido, nss);
        this.ventasBrutas = ventasBrutas;
        this.tarifaComision = tarifaComision;
    }

    @Override
    public double ingresos() {
        return ventasBrutas * tarifaComision;
    }

    @Override
    public String toString() {
        return String.format("Empleado por comisión: %s\n%s\nVentas brutas: %.2f\nTarifa de comisión: %.2f",
                super.toString(), "Ventas brutas", ventasBrutas, tarifaComision);
    }
}
