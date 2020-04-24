package webservice;

import java.util.List;

import javax.ejb.EJB;
import javax.jws.WebService;

import datatypes.DTRecursos;
import datatypes.DTTipoDeRecurso;
import servletsNegocios.NegocioRecursosLocal;


@WebService(endpointInterface="webservice.IListarElementos" ,name="Servicio Web")
//el endpoint es donde esta la interface que implementa esta clase

public class ListarElementos implements IListarElementos {

	@EJB
	NegocioRecursosLocal conexionNegociosRecursos;
	
	@Override
	public String addRecursoNegocio(String codigo, double precioUnitario, double cantidad, String nombreTipo) {
		
		try{
			conexionNegociosRecursos.addRecursoNegocio(codigo, precioUnitario, cantidad, nombreTipo);
			return "Agregado exitosamente";
		}
		catch(Exception  e){
			return "No se pudo ingresar, " + e.getMessage();
		}
	}

	@Override
	public List<DTTipoDeRecurso> getTiposDeRecursos() {
		List<DTTipoDeRecurso> tipoRecursosEnBase = conexionNegociosRecursos.getTiposDeRecursos() ;
		return tipoRecursosEnBase;
	}

	@Override
	public List<DTRecursos> getRecursos() {
		List<DTRecursos> recursosEnBase = conexionNegociosRecursos.getRecursos();
		return recursosEnBase;
	}

	@Override
	public List<DTRecursos> getRecursosDeTipo(String nombreTipo) {
		List<DTRecursos> recursosFiltrados =  conexionNegociosRecursos.getRecursosDeTipo(nombreTipo);
		return recursosFiltrados;
	}

}
