import  java.util.ArrayList;

/*representa al mesero que atiende las mesas */
public class Mesero extends Persona {

    private int codigo_empleado;
    private ArrayList<Pedido> pedidos;

    /*constructor*/
    public Mesero(String nombre, String documento, String telefono,
                  int codigo_empleado) {
        super(nombre, documento, telefono);
        this.codigo_empleado = codigo_empleado;
        this.pedidos = new ArrayList<>();
    }

    public int getCodigo_empleado() {
        return codigo_empleado;
    }

    public void setCodigo_empleado(int codigo_empleado) {
        this.codigo_empleado = codigo_empleado;
    }

    /*metodo registrar pedido */
    public void registrarPedido(Pedido pedido) {
        if (pedido != null) {
            pedidos.add(pedido);
            System.out.println("Pedido registrado por el mesero "+ getNombre());
        }
    }

    /*metodo y muestra la mesa que esta atendiendo un mesero*/
    public void atenderMesa(Mesa mesa) {
        if (mesa != null) {
            System.out.println("El mesero " + getNombre() + " esta atendiendo la mesa " + mesa.getNumero());
        }
    }
}
    