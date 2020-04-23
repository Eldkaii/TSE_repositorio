package Datos;

import java.util.List;

import javax.ejb.Remote;

import Clases.Recursos;
import Clases.TipoDeRecurso;

@Remote
public interface BaseDeDatosRemote {

	public List<TipoDeRecurso> getTiposDeRecursos();
	public List<Recursos> getRecursos();
	public void addTipoRecurso(String nombre, String descripcion, double precioReferencia);
	public void addRecurso(String codigo, double precioUnitario, double cantidad, String nombreTipo);
}
