package Modelo;

public class Platos {
    private int id; // Identificador único del plato
    private String nombre; // Nombre del plato
    private double precio; // Precio del plato
    private String fecha; // Fecha de actualización del plato

    // Constructor vacío
    public Platos() {
    }

    // Constructor con parámetros para inicializar todos los atributos
    public Platos(int id, String nombre, double precio, String fecha) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.fecha = fecha;
    }

    // Getter y Setter para el identificador del plato
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter y Setter para el nombre del plato
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter y Setter para el precio del plato
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Getter y Setter para la fecha de actualización del plato
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
