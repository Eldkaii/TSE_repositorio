package Clases;

public class Recursos {

	private String codigo;
	private double precioUnitario;
	private double cantidad;
	private TipoDeRecurso tipo ;
	
	
	public Recursos() {
		this.codigo ="";
		this.precioUnitario = 0;
		this.cantidad = 0;
		this.tipo = null;
	}
	
	public Recursos(String codigo, double precioUnitario, double cantidad , TipoDeRecurso tipo) {
		this.codigo = codigo;
		this.precioUnitario = precioUnitario;
		this.cantidad = cantidad;
		this.tipo = tipo;
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

	public TipoDeRecurso getTipo() {
		return tipo;
	}

	public void setTipo(TipoDeRecurso tipo) {
		this.tipo = tipo;
	}
}
