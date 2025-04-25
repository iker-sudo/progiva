package org.iesvdm.progiva;

import static org.junit.Assert.assertEquals;

import java.util.Scanner;

import org.junit.Test;

public class CalcularPrecioFinalTest {

	@Test
	public void testIntroducirBase() {
		Scanner sc = new Scanner("100.0");
		double base = CalcularPrecioFinal.introducirBase(sc);
		assertEquals(100.0, base, 0.001);
	}
	
	@Test
    public void testIntroducirIvaGeneral() {
        // Simulamos la entrada del usuario
        Scanner sc = new Scanner("general");
        double iva = CalcularPrecioFinal.introducirIva(sc);
        assertEquals(21.0, iva, 0.001);
    }
    
    @Test
    public void testIntroducirIvaReducido() {
        // Simulamos la entrada del usuario
        Scanner sc = new Scanner("reducido");
        double iva = CalcularPrecioFinal.introducirIva(sc);
        assertEquals(10.0, iva, 0.001);
    }
    
    @Test
    public void testIntroducirIvaSuperReducido() {
        // Simulamos la entrada del usuario
        Scanner sc = new Scanner("superreducido");
        double iva = CalcularPrecioFinal.introducirIva(sc);
        assertEquals(4.0, iva, 0.001);
    }

    @Test
    public void testIntroducirIvaInvalido() {
        // Simulamos la entrada del usuario
        Scanner sc = new Scanner("invalido");
        double iva = CalcularPrecioFinal.introducirIva(sc);
        assertEquals(21.0, iva, 0.001);
    }

    @Test
    public void testCalcularPrecioFinal() {
        double base = 100.0;
        double iva = 21.0; // IVA general
        double total = CalcularPrecioFinal.calcularPrecioFinal(base, iva);
        assertEquals(121.0, total, 0.001);
    }
}

