package servletsNegocios;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;

import javax.ejb.Stateless;

import Clases.Recursos;
import Clases.TipoDeRecurso;
import Datos.BaseDeDatosLocal;
import datatypes.*;


@Stateless
public class NegocioRecursos implements NegocioRecursosRemote, NegocioRecursosLocal {

	@EJB
	private BaseDeDatosLocal conexionNegocioBaseDeDatos ;
	
    public NegocioRecursos() {
    }
    
    public void addRecursoNegocio(String codigo, double precioUnitario, double cantidad, String nombreTipo) {

    	try {
    		conexionNegocioBaseDeDatos.addRecurso(codigo, precioUnitario, cantidad, nombreTipo);
    	}
    	catch(Exception  e){
			System.out.println(e.getMessage());
		}
    }
    
    public List<DTTipoDeRecurso> getTiposDeRecursos(){
    	
    	List<DTTipoDeRecurso> ret  =  mappListasTipos(conexionNegocioBaseDeDatos.getTiposDeRecursos());
    	return ret;
    }
    
	public List<DTRecursos> getRecursos(){
    	
    	List<DTRecursos> ret  =  mappListas(conexionNegocioBaseDeDatos.getRecursos());
    	return ret;
    }
	
	public List<DTRecursos> getRecursosDeTipo(String nombreTipo){
    	
    	List<DTRecursos> ret  =  mappListas(conexionNegocioBaseDeDatos.getRecursos());
    	
    	List<DTRecursos> listaFiltrada = new ArrayList<DTRecursos>();
    	
    	for(int i = 0 ; i < ret.size() ; i++)
    		if(ret.get(i).getNombreTipoRecurso().equals(nombreTipo))
    			listaFiltrada.add(ret.get(i));
    	
    	return listaFiltrada;
    }
 
	
	//////////FUNCIONES AUXILIARES
public List<DTRecursos> mappListas(List<Recursos> lista){
		
		List<DTRecursos> nuevaLista = new ArrayList<DTRecursos>();
		DTRecursos aux = null; 
		
		String codigo;
		double precioUnitario;
		double cantidad;
		String nombreTipoRecurso;
		String descripcionTipoRecurso;
		double precioReferenciaTipoRecurso; 

		for(int i = 0 ;  i < lista.size() ; i++) {
			
			codigo = lista.get(i).getCodigo();
			precioUnitario = lista.get(i).getPrecioUnitario();
			cantidad = lista.get(i).getCantidad();
			nombreTipoRecurso = lista.get(i).getTipo().getNombre();
			descripcionTipoRecurso = lista.get(i).getTipo().getDescripcion();
			precioReferenciaTipoRecurso = lista.get(i).getTipo().getPrecioReferencia();

			aux = new DTRecursos( codigo,precioUnitario,cantidad,nombreTipoRecurso,descripcionTipoRecurso,precioReferenciaTipoRecurso);
			
			nuevaLista.add(aux);
		}
		
		return nuevaLista;
	}
	
public List<DTTipoDeRecurso> mappListasTipos(List<TipoDeRecurso> lista){
		
		List<DTTipoDeRecurso> nuevaLista = new ArrayList<DTTipoDeRecurso>();
		DTTipoDeRecurso aux = null; 
		
		for(int i = 0 ;  i < lista.size() ; i++) {
			aux = new DTTipoDeRecurso(lista.get(i).getNombre(), lista.get(i).getDescripcion(), lista.get(i).getPrecioReferencia());
			nuevaLista.add(aux);
		}
		
		return nuevaLista;
	}

}
