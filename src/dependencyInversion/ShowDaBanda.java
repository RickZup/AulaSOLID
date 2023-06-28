package dependencyInversion;

import java.util.ArrayList;
import java.util.List;

public class ShowDaBanda {

    public static void main(String[] args) {

        List<Musico_D> musicos = new ArrayList<>();

        musicos.add(new Guitarrista_D());
        musicos.add(new Baterista_D());
        musicos.add(new Vocalista_D());

        Banda catalisa = new Banda(musicos);
        catalisa.tocarMusica();
    }
}
