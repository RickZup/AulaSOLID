package openClosed;

public class Guitarrista_O extends Musico_O {

    public void tocarGuitarra(){}

    @Override
    public void seApresentar() {
        tocarGuitarra();
    }
}
