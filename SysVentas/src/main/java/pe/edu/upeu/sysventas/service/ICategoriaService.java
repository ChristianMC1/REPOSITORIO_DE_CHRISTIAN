package pe.edu.upeu.sysventas.service;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.edu.upeu.sysventas.dto.ComboBoxOption;
import pe.edu.upeu.sysventas.model.Categoria;
import pe.edu.upeu.sysventas.model.VentCarrito;

import java.util.List;

public interface ICategoriaService extends ICrudGenericService <Categoria, Long> {
    List<ComboBoxOption> listarCombobox();
}
