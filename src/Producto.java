public class Producto {

    private int codigo;
    private String nombre;
    private double precio;
    private boolean disponibilidad;

    /*constructor*/
    public Producto(int codigo, String nombre, double precio,
                    boolean disponibilidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.disponibilidad = disponibilidad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public boolean getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    /*actualizar el precio de un prodcuto*/
    public void actualizarPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
            System.out.println("Precio actualizado correctamente.");
        } else {
            System.out.println("El precio no puede ser negativo.");
        }
    }

    /*mostrar info del producto*/
    public void mostrarProducto() {
        System.out.println("Codigo: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Disponible: "
                + (disponibilidad ? "Si" : "No"));
    }
}
