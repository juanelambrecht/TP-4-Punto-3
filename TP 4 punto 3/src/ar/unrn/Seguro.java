package ar.unrn;

public class Seguro implements Seguros{

	String nombre;
	double precioSeguro;
	String tipoSeguro;
	
	
	public Seguro(String nombre, String tipoSeguro,double precioSeguro) {
		super();
		this.nombre = nombre;
		this.precioSeguro = precioSeguro;
		this.tipoSeguro = tipoSeguro;
	}


	@Override
	public String toString() {
		return "\n Seguro [nombre=" + nombre + ", precioSeguro=" + precioSeguro + ", tipoSeguro=" + tipoSeguro + "]";
	}


	@Override
	public double calcularCostoSeguro() {
		return this.precioSeguro;
	}

}
