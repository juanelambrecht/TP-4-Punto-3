package ar.unrn;

import java.util.ArrayList;
import java.util.List;

public class PaqueteSeguro implements Seguros{
	List<Seguros> seguros = new ArrayList<Seguros>();
	double precioPaquete;
	String nombrePaquete;
	
	public PaqueteSeguro(String nombrePaquete) {
		super();
		this.nombrePaquete = nombrePaquete;
	}

	public void agregarSeguro(Seguro seguro) {
		seguros.add(seguro);
		//this.actualizarPrecioTotal(seguro);
	}
	

	public void mostrarPaquetes() {
		
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return "PaqueteSeguro [seguros=" + seguros + ", precioPaquete=" + precioPaquete + "]";
	}

	@Override
	public double calcularCostoSeguro() {
		double costoSeguro = 0;
		
		for(Seguros seguro: seguros) {
			costoSeguro = (costoSeguro + seguro.calcularCostoSeguro()) - (seguro.calcularCostoSeguro() * 5/100);
		}
		
		return costoSeguro;
	}
	
	
	
}
