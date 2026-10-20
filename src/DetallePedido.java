/*Representa un producto y su cantidad dentro de un pedido */
public class DetallePedido {

    private int cantidad;
    private double subtotal;
    private Producto producto;

    /*Constructor */
    public DetallePedido(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.subtotal = 0;
        calcularSubtotal();
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        if (cantidad > 0) {
            this.cantidad = cantidad;
            calcularSubtotal();
        }
    }

    public double getSubtotal() {
        return subtotal;
    }

    public Producto getProducto() {
        return producto;
    }
    /*metodo que calcula subtotal */
    public double calcularSubtotal() {
    subtotal = producto.getPrecio() * cantidad;
    return subtotal;

    }
}
