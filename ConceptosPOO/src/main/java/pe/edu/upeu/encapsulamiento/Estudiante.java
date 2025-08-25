package pe.edu.upeu.encapsulamiento;

public class Estudiante {
    private String codigo;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    private String carrera;

    public void trabajo () {
        System.out.println("Estudiar, investigar " + "en la carrera de: "+carrera);
    }
}
