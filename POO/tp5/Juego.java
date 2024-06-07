package POO_tp5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Juego {
    private List<Jugador> jugadores;
    private Mazo mazo;
    private int puntajeMaximo;
    private int manos;

    public Juego(int puntajeMaximo, int manos) {
        this.jugadores = new ArrayList<>();
        this.mazo = new Mazo();
        this.puntajeMaximo = puntajeMaximo;
        this.manos = manos;
    }

    public void agregarJugador(String nombre) {
        jugadores.add(new Jugador(nombre));
    }

    public void iniciarJuego() {
        Scanner scanner = new Scanner(System.in);

        for (int mano = 1; mano <= manos; mano++) {
            System.out.println("Mano " + mano);
            mazo.reiniciarMazo();
            while (mazo.size() > 20) {
                for (Jugador jugador : jugadores) {
                    System.out.println(jugador.getNombre() + ", elige un número y familia (OROS, COPAS, ESPADAS, BASTOS): ");
                    int numero = scanner.nextInt();
                    Familia familia = Familia.valueOf(scanner.next().toUpperCase());
                    jugador.setEleccion(new Naipe(numero, familia));
                }

                Naipe naipe = mazo.getNaipe();
                System.out.println("Naipe sacado: " + naipe);

                for (Jugador jugador : jugadores) {
                    if (jugador.getEleccion().getNumero() == naipe.getNumero() &&
                            jugador.getEleccion().getFamilia() == naipe.getFamilia()) {
                        jugador.incrementarPuntos();
                        System.out.println(jugador.getNombre() + " ha acertado y gana un punto!");
                    }
                }
            }

            System.out.println("Fin de la mano " + mano);
        }

        definirGanador();
    }

    private void definirGanador() {
        Jugador ganador = null;
        for (Jugador jugador : jugadores) {
            if (ganador == null || jugador.getPuntos() > ganador.getPuntos()) {
                ganador = jugador;
            }
        }

        System.out.println("El ganador es " + ganador.getNombre() + " con " + ganador.getPuntos() + " puntos.");
    }

    public static void main(String[] args) {
        Juego juego = new Juego(5, 3); // Ejemplo: ganar con 5 puntos o jugar 3 manos
        juego.agregarJugador("Jugador 1");
        juego.agregarJugador("Jugador 2");
        // Agregar más jugadores si es necesario
        juego.iniciarJuego();
    }
}
