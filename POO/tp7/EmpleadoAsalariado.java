package POO.tp7;

public class EmpleadoAsalariado extends Empleado {
    private double salarioSemanal;

    public EmpleadoAsalariado(String nombre, String apellido, String nss, double salarioSemanal) {
        super(nombre, apellido, nss);
        this.salarioSemanal = salarioSemanal;
    }

    @Override
    public double ingresos() {
        return salarioSemanal;
    }

    @Override
    public String toString() {
        return String.format("Empleado asalariado: %s\n%s\nSalario semanal: %.2f", 
                super.toString(), "Salario semanal", salarioSemanal);
    }
}
