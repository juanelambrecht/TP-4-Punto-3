package ar.unrn.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ar.unrn.PaqueteSeguro;
import ar.unrn.Seguro;

class PaqueteSeguroTest {

	@Test
	void testCalcularCostoSeguroPaquete() {
		Seguro seguroHogar = new Seguro("Casa Seguro", "Hogar", 3000);
		Seguro seguroAutomovil = new Seguro("Auto Seguro", "Auto", 2500);
		Seguro seguroVida = new Seguro("Vida Seguro", "Vida", 2000);
		Seguro seguroMedico = new Seguro("Medico Seguro", "Medico", 1500);
		
		PaqueteSeguro paquete = new PaqueteSeguro("Paquete Completo");
		
		paquete.agregarSeguro(seguroHogar);
		paquete.agregarSeguro(seguroAutomovil);
		paquete.agregarSeguro(seguroVida);
		paquete.agregarSeguro(seguroMedico);
		
		assertEquals(paquete.calcularCostoSeguro(), 8550.0);
	}
	
	@Test
	void testCalcularCostoSeguroParticular() {
		Seguro seguroHogar = new Seguro("Casa Seguro", "Hogar", 3000);
		
		assertEquals(seguroHogar.calcularCostoSeguro(), 3000.0);
	}

}
