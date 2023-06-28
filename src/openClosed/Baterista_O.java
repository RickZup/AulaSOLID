package openClosed;

public class BateristaOC extends MusicoOC {

    public void tocarBateria(){}

    @Override
    public void seApresentar() {
        tocarBateria();
    }
}
