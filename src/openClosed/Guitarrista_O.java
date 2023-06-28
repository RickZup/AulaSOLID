package openClosed;

public class GuitarristaOC extends MusicoOC {

    public void tocarGuitarra(){}

    @Override
    public void seApresentar() {
        tocarGuitarra();
    }
}
