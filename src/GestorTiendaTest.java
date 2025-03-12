import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GestorTiendaTest {

	@Test
    void testCalcularDescuento_10Unidades() {
        GestorTienda tienda = new GestorTienda();
        double descuento = tienda.calcularDescuento(100.0, 10);
        assertEquals(10.0, descuento, 0.01);
    }

    @Test
    void testCalcularDescuento_5Unidades() {
        GestorTienda tienda = new GestorTienda();
        double descuento = tienda.calcularDescuento(100.0, 5);
        assertEquals(5.0, descuento, 0.01);
    }

    @Test
    void testCalcularDescuento_MenosDe5Unidades() {
        GestorTienda tienda = new GestorTienda();
        double descuento = tienda.calcularDescuento(100.0, 3);
        assertEquals(0.0, descuento, 0.01);
    }
    @Test
    void testCategorizarProducto_Economico() {
        GestorTienda tienda = new GestorTienda();
        assertEquals("Económico", tienda.categorizarProducto(5.0));
    }

    @Test
    void testCategorizarProducto_Estandar() {
        GestorTienda tienda = new GestorTienda();
        assertEquals("Estándar", tienda.categorizarProducto(20.0));
    }

    @Test
    void testCategorizarProducto_Premium() {
        GestorTienda tienda = new GestorTienda();
        assertEquals("Premium", tienda.categorizarProducto(100.0));
    }
    @Test
    void testBuscarProducto_Encontrado() {
        GestorTienda tienda = new GestorTienda();
        String[] inventario = {"Manzana", "Pera", "Banana"};
        assertEquals("Pera", tienda.buscarProducto(inventario, "Pera"));
    }

    @Test
    void testBuscarProducto_NoEncontrado() {
        GestorTienda tienda = new GestorTienda();
        String[] inventario = {"Manzana", "Pera", "Banana"};
        assertNull(tienda.buscarProducto(inventario, "Melón"));
    }

    @Test
    void testBuscarProducto_CaseInsensitive() {
        GestorTienda tienda = new GestorTienda();
        String[] inventario = {"Manzana", "Pera", "Banana"};
        assertEquals("Manzana", tienda.buscarProducto(inventario, "manzana"));
    }
}
