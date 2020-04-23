package datatypes;

import java.util.ArrayList;
import java.util.List;

import Clases.Recursos;
import Clases.TipoDeRecurso;

public class DTRecursos {


	private String codigo;
	private double precioUnitario;
	private double cantidad;
	private String nombreTipoRecurso;
	private String descripcionTipoRecurso;
	private double precioReferenciaTipoRecurso;
	
	public DTRecursos(String codigo, double precioUnitario, double cantidad, String nombreTipoRecurso,
			String descripcionTipoRecurso, double precioReferenciaTipoRecurso) {
	
		this.codigo = codigo;
		this.precioUnitario = precioUnitario;
		this.cantidad = cantidad;
		this.nombreTipoRecurso = nombreTipoRecurso;
		this.descripcionTipoRecurso = descripcionTipoRecurso;
		this.precioReferenciaTipoRecurso = precioReferenciaTipoRecurso;
	}
	
	
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public double getPrecioUnitario() {
		return precioUnitario;
	}
	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	public double getCantidad() {
		return cantidad;
	}
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	public String getNombreTipoRecurso() {
		return nombreTipoRecurso;
	}
	public void setNombreTipoRecurso(String nombreTipoRecurso) {
		this.nombreTipoRecurso = nombreTipoRecurso;
	}
	public String getDescripcionTipoRecurso() {
		return descripcionTipoRecurso;
	}
	public void setDescripcionTipoRecurso(String descripcionTipoRecurso) {
		this.descripcionTipoRecurso = descripcionTipoRecurso;
	}
	public double getPrecioReferenciaTipoRecurso() {
		return precioReferenciaTipoRecurso;
	}
	public void setPrecioReferenciaTipoRecurso(double precioReferenciaTipoRecurso) {
		this.precioReferenciaTipoRecurso = precioReferenciaTipoRecurso;
	}
	
	
}
