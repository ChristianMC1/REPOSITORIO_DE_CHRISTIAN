package pe.edu.upeu.herencia;

public class Carro extends Vehiculo {

    String modelo = "GTR";
    String placa = "PE-13T5";
    String color = "Negro";


    void caracteristicas(){
        System.out.println("Las caracteristicas de este carro son: ");
        System.out.println("Marca: " +marca);
        System.out.println("Modelo: " +modelo);
        System.out.println("Color: " +color);
        System.out.println("Placa: " +placa);
    }

    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.caracteristicas();
        carro.sonido();
    }

}
