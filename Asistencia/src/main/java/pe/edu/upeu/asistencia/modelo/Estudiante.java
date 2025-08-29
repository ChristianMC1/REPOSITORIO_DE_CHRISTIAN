package pe.edu.upeu.asistencia.modelo;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.StringProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //Se encarga de generar los metodos get y set
@NoArgsConstructor
@AllArgsConstructor

public class Estudiante {
    private StringProperty nombre;
    private BooleanProperty estado;

}

