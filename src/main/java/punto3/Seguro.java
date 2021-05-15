package punto3;

public class Seguro implements PaqueteGeneral {
    private String nombre;
    private double precio;


    public Seguro(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;

    }

    @Override
    public double obtenerPrecio() {
        return precio;
    }

    public int obtenerCantidadDePaquetes() {
        return 0;
    }

}
