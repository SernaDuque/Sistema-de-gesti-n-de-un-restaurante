import java.util.ArrayList;
/*
 * Representa un cliente del restaurante
 * registra pedidos y consultar sus pedidos
 */
public class Cliente extends Persona {

    private int num_cliente;
    private ArrayList<Pedido> pedidos;

    /*Constructor */
    public Cliente(String nombre, String documento, String telefono,
                   int num_cliente) {
        super(nombre, documento, telefono);
        this.num_cliente = num_cliente;
        this.pedidos = new ArrayList<>();
    }

    public int getNum_cliente() {
        return num_cliente;
    }

    public void setNum_cliente(int num_cliente) {
        this.num_cliente = num_cliente;
    }

    /*metodo para realizar un pedido, registra el pedido hecho por el cliente*/
    public void realizarPedido(Pedido pedido) {
        if (pedido != null) {
            pedidos.add(pedido);
            System.out.println("Pedido registrado para " + getNombre());
        }
    }

    /* Metodo que muestra los pedidos del cliente */
    public void consultarPedido() {
        if (pedidos.isEmpty()) {
            System.out.println("El cliente no tiene pedidos.");
        } else {
            for (Pedido pedido : pedidos) {
                System.out.println("Pedido numero: " + pedido.getNumero());
                System.out.println("Estado: " + pedido.getEstado());
                System.out.println("Total: $" + pedido.calcularTotal());
            }
        }
    }
}
