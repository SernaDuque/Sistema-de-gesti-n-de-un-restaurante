import java.util.ArrayList;

/*Representa una mesa del restaurante */
public class Pedido {

    private int numero;
    private String fecha;
    private String estado;
    private double total;

    private Cliente cliente;
    private Mesero mesero;
    private Mesa mesa;
    private ArrayList<DetallePedido> detalles;

    /*Constructor*/
    public Pedido(int numero, String fecha, Cliente cliente,
                  Mesero mesero, Mesa mesa) {
        this.numero = numero;
        this.fecha = fecha;
        this.cliente = cliente;
        this.mesero = mesero;
        this.mesa = mesa;
        this.estado = "Pendiente";
        this.total = 0;
        this.detalles = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public double getTotal() {
        return total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Mesero getMesero() {
        return mesero;
    }

    public Mesa getMesa() {
        return mesa;
    }

    /*metodo para agregar un producto al pedido*/
    public void agregarProducto(Producto producto, int cantidad) {
        if (producto == null) {
            System.out.println("El producto no existe.");
        } else if (!producto.getDisponibilidad()) {
            System.out.println("El producto no esta disponible.");
        } else if (cantidad <= 0) {
            System.out.println("La cantidad debe ser mayor que cero.");
        } else {
            DetallePedido detalle = new DetallePedido(producto, cantidad);

            detalles.add(detalle);
            calcularTotal();

            System.out.println("Producto agregado: "+ producto.getNombre());
        }
    }

    /*  el total de todos los productos del pedido*/
    public double calcularTotal() {
        total = 0;

        for (DetallePedido detalle : detalles) {
            detalle.calcularSubtotal();
            total += detalle.getSubtotal();
        }

        return total;
    }

    /*metodo cambio de estado*/
    public void cambiarEstado(String estado) {
        this.estado = estado;

        if (estado.equalsIgnoreCase("Entregado") && mesa != null) {
            mesa.liberar();
        }
    }

    /*info del pedido*/
    public void mostrarPedido() {
        System.out.println("Numero de pedido: " + numero);
        System.out.println("Fecha: " + fecha);
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Mesero: " + mesero.getNombre());
        System.out.println("Mesa: " + mesa.getNumero());
        System.out.println("Estado: " + estado);
        System.out.println("Total: $" + calcularTotal());
    }
}
