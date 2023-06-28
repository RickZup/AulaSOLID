package openClosed;

public class Baterista_O extends Musico_O {

    public void tocarBateria(){}

    @Override
    public void seApresentar() {
        tocarBateria();
    }
}
