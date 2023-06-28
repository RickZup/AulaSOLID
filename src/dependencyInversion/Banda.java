package dependencyInversion;

import java.util.List;

public class Banda {

    private List<Musico_D> musicos;

    public Banda(List<Musico_D> musicos) {
        this.musicos = musicos;
    }

    public void tocarMusica(){
        System.out.println();
        System.out.println("------ \uD83C\uDFB6 Banda tocando \uD83C\uDFB6 ------");
        System.out.println();
        for (Musico_D musico_d : musicos) {
            musico_d.seApresentar();
        }
    }

}
