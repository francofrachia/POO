package POO.tp7;

public abstract class Empleado {
    private String nombre;
    private String apellido;
    private String nss; // Número de Seguro Social

    public Empleado(String nombre, String apellido, String nss) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nss = nss;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNss() {
        return nss;
    }

    public abstract double ingresos(); // Método abstracto que debe ser implementado por las clases derivadas

    @Override
    public String toString() {
        return String.format("%s %s\nNúmero de Seguro Social: %s", nombre, apellido, nss);
    }
}
