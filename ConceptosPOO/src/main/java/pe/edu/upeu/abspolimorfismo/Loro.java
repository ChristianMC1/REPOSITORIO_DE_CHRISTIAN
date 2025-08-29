package pe.edu.upeu.abspolimorfismo;

public class Loro extends Animal {

    private String tipo = "Ave";

    @Override
    public void emitirSonido() {
        System.out.println("Hey brother no te duermas!!");
    }

    @Override
    public void dormir() {
        super.dormir(); //Super es para referenciar a todos los metodos de la clase padre... y This para esta misma clase.
        System.out.println(this.tipo);
        System.out.println(super.tipo);
        System.out.println("No molesten... Ing. Durmiendo... Zzz...Zzz...");
    }
}
