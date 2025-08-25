package pe.edu.upeu.encapsulamiento;

import lombok.Getter;
import lombok .Setter;

@Getter
@Setter

public class Jugador {
    private String nombre;
    private String apellido;
    private int edad;
    private String posicion;

    public Jugador() {
    }

    private int numeroCam;

    public Jugador(String nombre, String apellido, int edad, String posicion, int numeroCam) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.posicion = posicion;
        this.numeroCam = numeroCam;
    }

    @Override
    public String toString(){
        return "El jugador tiene estas caracteristicas: \n" + "Nombre: "+nombre+ "\n" + "Apellido: " +apellido+ "\n" + "Edad: " +edad+ "\n" + "Posicion: " +posicion+ "\n" +"Camiseta N°: " +numeroCam+ "\n";
    }
}
