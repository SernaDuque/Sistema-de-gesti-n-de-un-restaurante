/*Representa una mesa del restaurante */
public class Mesa {

    private int numero;
    private int capacidad;
    private String estado;

    /*constructor*/
    public Mesa(int numero, int capacidad) {
        this.numero = numero;
        this.capacidad = capacidad;
        this.estado = "Disponible";
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    /*metodo para ocupar la mesa si esta disponible*/
    public void ocupar() {
        if (estado.equals("Disponible")) {
            estado = "Ocupada";
            System.out.println("La mesa " + numero + " esta ocupada.");
        } else {
            System.out.println("La mesa ya esta ocupada.");
        }
    }

    /*metodo para liberar la mesa*/
    public void liberar() {
        estado = "Disponible";
        System.out.println("La mesa " + numero + " esta disponible.");
    }
}
