package pe.edu.upeu.claseinterface;

public class Loro implements Animal {

    @Override
    public void emitirSonido() {
        System.out.println("Hola manito, aprede pues!");
    }

    @Override
    public void dormir() {
        System.out.println("Zzz...Zzz...");
    }
}
