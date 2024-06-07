package POO_tp5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mazo {
    private List<Naipe> naipes;

    public Mazo() {
        naipes = new ArrayList<>();
        inicializarMazo();
        barajar();
    }

    private void inicializarMazo() {
        for (Familia familia : Familia.values()) {
            for (int i = 1; i <= 12; i++) {
                if (i <= 9 || (i >= 10 && i <= 12)) {
                    naipes.add(new Naipe(i, familia));
                }
            }
        }
    }

    public void barajar() {
        Collections.shuffle(naipes);
    }

    public Naipe getNaipe() {
        if (!naipes.isEmpty()) {
            return naipes.remove(0);
        }
        return null;
    }

    public void reiniciarMazo() {
        naipes.clear();
        inicializarMazo();
        barajar();
    }

    public int size() {
        return naipes.size();
    }
}
