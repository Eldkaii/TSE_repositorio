package Clases;

public class TipoDeRecurso {

	private String nombre;
	private String descripcion;
	private double precioReferencia;
	
	public TipoDeRecurso() {
		this.nombre ="";
		this.descripcion ="";
		this.precioReferencia = 0;
	}
	
	public TipoDeRecurso(String nombre,String descripcion,double precioReferencia) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precioReferencia = precioReferencia;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getPrecioReferencia() {
		return precioReferencia;
	}
	public void setPrecioReferencia(double precioReferencia) {
		this.precioReferencia = precioReferencia;
	}
}
