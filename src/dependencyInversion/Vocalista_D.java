package dependencyInversion;

public class Vocalista_D extends MembroDaBanda_D implements Musico_D, Compositor_D {

    public void cantar(){
        System.out.println("\uD83C\uDFA4 cantando:");
        System.out.println();
        System.out.println("'Oh, Java!");
        System.out.println("Oh, Deuses do java...");
        System.out.println("Compilem, compilem!");
        System.out.println("Compilem a minha dor...'");
    }

    @Override
    public void compor() {

    }

    @Override
    public void ensaiar() {

    }

    @Override
    public void seApresentar() {
        cantar();
    }
}
