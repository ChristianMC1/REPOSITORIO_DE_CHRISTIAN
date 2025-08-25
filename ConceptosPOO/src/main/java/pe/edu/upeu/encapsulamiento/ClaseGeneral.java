package pe.edu.upeu.encapsulamiento;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

public class ClaseGeneral {


    public static void probar () {
        Estudiante estudiante = new Estudiante();
        estudiante.setCarrera("Ingenieria de Sistemas");
        estudiante.setCodigo("21243546454");
        estudiante.trabajo();
    }

    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("David");
        persona.edad = 18;
        persona.genero = 'M';
        persona.saludo();
        probar();
        probarJugador();
    }

    public static void probarJugador () {
        Jugador jugador = new Jugador();
        jugador.setNombre("Cristiano Ronaldo");
        jugador.setApellido("Dos Santos");
        jugador.setEdad(41);
        jugador.setPosicion("Delantero");
        jugador.setNumeroCam(7);
        System.out.println(jugador);
    }
}
