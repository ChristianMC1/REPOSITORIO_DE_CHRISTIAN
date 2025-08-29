package pe.edu.upeu.abspolimorfismo;

public abstract class Animal {

    protected String tipo = "HHH";
    public abstract void emitirSonido();

    public void dormir(){
        System.out.println("El animal duerme... Zzzzzz");
    }
}
