package servletsNegocios;

import java.util.List;

import javax.ejb.Remote;

import datatypes.DTRecursos;
import datatypes.DTTipoDeRecurso;

@Remote
public interface NegocioRecursosRemote {

	public void addRecursoNegocio(String codigo, double precioUnitario, double cantidad, String nombreTipo);
	public List<DTTipoDeRecurso> getTiposDeRecursos();
	public List<DTRecursos> getRecursos();
	public List<DTRecursos> getRecursosDeTipo(String nombreTipo);
}
