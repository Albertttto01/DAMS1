import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GestorTiendaTest {

	@Test
	void testcalcularDescuento() {
		GestorTienda tienda = new GestorTienda();
        int resultado = tienda.calcularDescuento(5);
        assertEquals(10, resultado);
	}
	void testcategorizarProducto() {
		GestorTienda tienda = new GestorTienda();
        boolean resultado = tienda.categorizarProducto("producto");
        assertTrue(resultado);
	}

}
