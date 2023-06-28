package dependencyInversion;

public class Guitarrista_D extends MembroDaBanda_D implements Musico_D {

    public void tocarGuitarra(){
        System.out.println("\uD83C\uDFB8 ...tocando guitarra!");
    }

    @Override
    public void ensaiar() {

    }

    @Override
    public void seApresentar() {
        tocarGuitarra();
    }
}
