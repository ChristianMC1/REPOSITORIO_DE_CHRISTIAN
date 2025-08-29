package pe.edu.upeu.enums;

enum GENERO{
    Masculino,
    Femenino,
}

public class Estudiante {
    String nombre;
    String apellido;
    String codigo;
    CARRERA carrera;
    GENERO genero;

    public Estudiante(String nombre, String apellido, String codigo, CARRERA carrera, GENERO genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigo = codigo;
        this.carrera = carrera;
        this.genero = genero;
    }

    public static void main(String[] args) {
        Estudiante estudiante=new Estudiante("Pedro", "Loayza", "202513287", CARRERA.Sistemas, GENERO.Masculino);
        System.out.println(estudiante.codigo + " " + estudiante.genero + " " + estudiante.carrera);
        for (CARRERA c: CARRERA.values()) {
            System.out.println(c);
        }
    }
}