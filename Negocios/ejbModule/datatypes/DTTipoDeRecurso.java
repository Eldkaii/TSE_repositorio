package datatypes;

public class DTTipoDeRecurso {

	private String nombre;
	private String descripcion;
	private double precioReferencia;


	public DTTipoDeRecurso(String nombre,String descripcion,double precioReferencia) {
	this.setNombre(nombre);
	this.setDescripcion(descripcion);
	this.setPrecioReferencia(precioReferencia);
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
