package pio.daw.jadg.ProyMaven;

import junit.framework.TestCase;

public class CalculadoraTest extends TestCase {
	

	public void testSuma() {
		int a=5;
		int b=7;
		int expect=12;
		Calculadora calculadora=new Calculadora();
		int resultadoSuma = calculadora.suma(a, b);
		
		assertEquals(expect, resultadoSuma);
	}

}
