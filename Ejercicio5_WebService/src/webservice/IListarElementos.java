package webservice;

import java.util.List;
import javax.jws.WebService;
import datatypes.DTRecursos;
import datatypes.DTTipoDeRecurso;


@WebService()
public interface IListarElementos {

	public String addRecursoNegocio(String codigo, double precioUnitario, double cantidad, String nombreTipo);
	public List<DTTipoDeRecurso> getTiposDeRecursos();
	public List<DTRecursos> getRecursos();
	public List<DTRecursos> getRecursosDeTipo(String nombreTipo);
}
