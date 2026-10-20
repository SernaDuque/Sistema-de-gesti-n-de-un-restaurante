import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PruebasRestaurante {

    @Test
    public void probarOcuparMesa() {
        Mesa mesa = new Mesa(1, 4);
        mesa.ocupar();

        assertEquals("Ocupada", mesa.getEstado());
    }

    @Test
    public void probarLiberarMesa() {
        Mesa mesa = new Mesa(1, 4);
        mesa.ocupar();
        mesa.liberar();

        assertEquals("Disponible", mesa.getEstado());
    }

    @Test
    public void probarCalcularSubtotal() {
        Producto producto = new Producto(
                101, "Hamburguesa", 18000, true
        );

        DetallePedido detalle = new DetallePedido(producto, 2);

        assertEquals(36000.0, detalle.calcularSubtotal(), 0.01);
    }

    @Test
    public void probarTotalPedido() {
        Cliente cliente = new Cliente(
                "Jose Serna", "102022565", "312726889", 1
        );

        Mesero mesero = new Mesero(
                "Ana Sofia", "39247098", "3104106789", 1
        );

        Mesa mesa = new Mesa(1, 4);

        Pedido pedido = new Pedido(
                1, "20/10/2026", cliente, mesero, mesa
        );

        Producto producto1 = new Producto(
                101, "Hamburguesa", 18000, true
        );

        Producto producto2 = new Producto(
                102, "Jugo", 6000, true
        );

        pedido.agregarProducto(producto1, 2);
        pedido.agregarProducto(producto2, 2);

        assertEquals(48000.0, pedido.calcularTotal(), 0.01);
    }

    @Test
    public void probarProductoNoDisponible() {
        Cliente cliente = new Cliente(
                "Jose Serna", "102022565", "312726889", 1
        );

        Mesero mesero = new Mesero(
                "Ana Sofia", "39247098", "3104106789", 1
        );

        Mesa mesa = new Mesa(1, 4);

        Pedido pedido = new Pedido(
                1, "20/10/2026", cliente, mesero, mesa
        );

        Producto producto = new Producto(
                103, "Gaseosa", 4000, false
        );

        pedido.agregarProducto(producto, 2);

        assertEquals(0.0, pedido.calcularTotal(), 0.01);
    }
}
