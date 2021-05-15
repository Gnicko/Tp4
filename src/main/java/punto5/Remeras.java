package punto5;

public abstract class Remeras {
    double precio;

    protected Remeras(double precio) {
        this.precio = precio;
    }

    protected abstract double obtenerPrecioRecargo(double precio);

    protected abstract double obtenerBonus(double precio);

    protected abstract double obtenerPrecioComerciante(double precio);

    public double calcularPrecio() {
        double valor = precio;
        valor = valor + obtenerPrecioRecargo(precio);
        valor = valor + obtenerPrecioComerciante(precio);
        valor = valor - obtenerBonus(precio);
        return valor;
    }

}
