package servletsNegocios;

import java.util.List;

import javax.ejb.Local;

import datatypes.DTRecursos;
import datatypes.DTTipoDeRecurso;

@Local
public interface NegocioRecursosLocal {

	public void addRecursoNegocio(String codigo, double precioUnitario, double cantidad, String nombreTipo);
	public List<DTTipoDeRecurso> getTiposDeRecursos();
	public List<DTRecursos> getRecursos();
	public List<DTRecursos> getRecursosDeTipo(String nombreTipo);
}
