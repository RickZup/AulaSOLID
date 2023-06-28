package dependencyInversion;

public class Baterista_D extends MembroDaBanda_D implements Musico_D {

    public void tocarBateria(){
        System.out.println("\uD83E\uDD41 TOCANDO BATERIA!!!");
    }

    @Override
    public void ensaiar() {

    }

    @Override
    public void seApresentar() {
        tocarBateria();
    }
}
