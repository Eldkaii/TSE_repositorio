package Datos;

import javax.ejb.Startup;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;

import Clases.Recursos;
import Clases.TipoDeRecurso;


@Singleton
@Startup
public class BaseDeDatos implements BaseDeDatosRemote, BaseDeDatosLocal {

	private List<TipoDeRecurso> tiposDeRecursos;
	private List<Recursos> recursos;

	public BaseDeDatos() {
		// TODO Auto-generated constructor stub
	}

	@PostConstruct
	private void CargaInicial() {
		tiposDeRecursos = new ArrayList<TipoDeRecurso>();
		recursos = new ArrayList<Recursos>();

		TipoDeRecurso rec1 = new TipoDeRecurso("Comestible", "Todo lo que se come", 100);
		TipoDeRecurso rec2 = new TipoDeRecurso("Bebida", "Todo lo que se toma", 150);
		TipoDeRecurso rec3 = new TipoDeRecurso("Ropa", "Todo lo que se usa", 200);

		tiposDeRecursos.add(rec1);
		tiposDeRecursos.add(rec2);
		tiposDeRecursos.add(rec3);
	}

	public List<TipoDeRecurso> getTiposDeRecursos() {
		return tiposDeRecursos;
	}

	public List<Recursos> getRecursos() {
		return recursos;
	}

	public void addTipoRecurso(String nombre, String descripcion, double precioReferencia) {
		
		TipoDeRecurso rep = this.tiposDeRecursos.stream().filter(item -> item.getNombre().equals(nombre)).findFirst().get();
		
		if(rep != null)
			throw new NullPointerException("Ya existe un tipo de recuros con ese nombre");
		else {
			TipoDeRecurso trec1 = new TipoDeRecurso(nombre, descripcion, precioReferencia);
			this.tiposDeRecursos.add(trec1);
		}
	}

	public void addRecurso(String codigo, double precioUnitario, double cantidad, String nombreTipo) {
		
		boolean existTR = false;
		
		for(int i = 0 ; ( i < this.tiposDeRecursos.size()) && (!existTR) ; i++) {
			if(this.tiposDeRecursos.get(i).getNombre().equals(nombreTipo))
				existTR = true;
		}
		
		if(!existTR) 
			throw new NullPointerException("No existe ese tipo de recurso");

		else {
			TipoDeRecurso tdr = this.tiposDeRecursos
				.stream()
				.filter(item -> item.getNombre().equals(nombreTipo))
				.findFirst()
				.get();
			
			boolean exist = false;
			
			for(int i = 0 ; ( i < this.recursos.size()) && (!exist) ; i++) {
				if(this.recursos.get(i).getCodigo().equals(codigo))
					exist = true;
			}
			
			if (exist) {
				throw new NullPointerException("Ya existe un recurso con ese codigo");
			}
			else {
				
				if(  precioUnitario <= (tdr.getPrecioReferencia()*1.10))
				{
				Recursos rec1 = new Recursos(codigo, precioUnitario, cantidad, tdr);
				this.recursos.add(rec1);
				}
				else
					throw new NullPointerException("La diferencia entre el precio unitario y el de referencia es mas de un 10%");
			}
		}
	}

}
