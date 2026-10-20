public class Main {

    public static void main(String[] args) {

        /*crear un cliente  */
        Cliente cliente1 = new Cliente(
                "Jose Serna",
                "102022565",
                "312726889",
                1
        );

        /*crear un mesero */
        Mesero mesero1 = new Mesero(
                "Ana Sofia",
                "39247098",
                "3104106789",
                1
        );

        /*crear una mesa */
        Mesa mesa1 = new Mesa(1, 4);

        /*producto crear  */
        Producto producto1 = new Producto(
                101, "Hamburguesa", 18000, true
        );

        Producto producto2 = new Producto(
                102, "Jugo", 6000, true
        );

        /*ocupar una mesa */
        mesa1.ocupar();

        /*crear un pedido */
        Pedido pedido1 = new Pedido(
                1, "20/10/2026", cliente1, mesero1, mesa1
        );

        /*relacionar el cliente y el mesero */
        cliente1.realizarPedido(pedido1);
        mesero1.registrarPedido(pedido1);

        /*el mesero atiende la mesa */
        mesero1.atenderMesa(mesa1);

        /*agre produc al pedido */
        pedido1.agregarProducto(producto1, 2);
        pedido1.agregarProducto(producto2, 2);

        /*info del pedido */
        System.out.println("informacion del pedido");
        pedido1.mostrarPedido();

        /*datos del cliente */
        System.out.println("Datos del cliente");
        cliente1.mostrarDatos();

        /*cambiar el estado del pedido */
        System.out.println("entrega del pedido");
        pedido1.cambiarEstado("Entregado");

        /*mostrar el estado de la mesa */
        System.out.println("Estado final de la mesa: "
                + mesa1.getEstado());

        /*consultar los pedidos del cliente */
        System.out.println("pedidos del cliente");
        cliente1.consultarPedido();
    }
}
