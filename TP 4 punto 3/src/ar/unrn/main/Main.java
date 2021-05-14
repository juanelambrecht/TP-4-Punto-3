package ar.unrn.main;

import ar.unrn.PaqueteSeguro;
import ar.unrn.Seguro;

public class Main {

	public static void main(String[] args) {
		Seguro seguroHogar = new Seguro("Casa Seguro", "Hogar", 3000);
		Seguro seguroAutomovil = new Seguro("Auto Seguro", "Auto", 2500);
		Seguro seguroVida = new Seguro("Vida Seguro", "Vida", 2000);
		Seguro seguroMedico = new Seguro("Medico Seguro", "Medico", 1500);
		
		PaqueteSeguro paquete = new PaqueteSeguro("Paquete Completo");
		
		paquete.agregarSeguro(seguroHogar);
		paquete.agregarSeguro(seguroAutomovil);
		paquete.agregarSeguro(seguroVida);
		paquete.agregarSeguro(seguroMedico);
		
		paquete.mostrarPaquetes();
		
		System.out.println("\n Costo Total Paquete: " + paquete.calcularCostoSeguro());
	
	}

}
