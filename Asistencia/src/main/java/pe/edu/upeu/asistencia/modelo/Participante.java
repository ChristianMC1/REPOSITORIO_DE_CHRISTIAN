package pe.edu.upeu.asistencia.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pe.edu.upeu.asistencia.enums.Carrera;
import pe.edu.upeu.asistencia.enums.TipoParticipante;

@Data //Se encarga de generar los metodos get y set
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "participante")

public class Participante {
    @Id
    private String dni;
    private String nombre;
    private String apellido;
    @Enumerated (EnumType.STRING)
    private Carrera carrera;
    @Enumerated (EnumType.STRING)
    private TipoParticipante tipoParticipante;
    private Boolean estado;

}

