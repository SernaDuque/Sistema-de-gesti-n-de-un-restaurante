/*Representa los datos básicos de una persona */
public class Persona {

    private String nombre;
    private String documento;
    private String telefono;

    /*constructor*/
    public Persona(String nombre, String documento, String telefono) {
        this.nombre = nombre;
        this.documento = documento;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /*mostrar datos */
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Documento: " + documento);
        System.out.println("Telefono: " + telefono);
    }
}
