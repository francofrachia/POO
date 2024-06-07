package POO.tp5;

public class Jugador {
    private String nombre;
    private int puntos;
    private Naipe eleccion;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.puntos = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public void incrementarPuntos() {
        this.puntos++;
    }

    public Naipe getEleccion() {
        return eleccion;
    }

    public void setEleccion(Naipe eleccion) {
        this.eleccion = eleccion;
    }
}
