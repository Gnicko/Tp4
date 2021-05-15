package punto4;

import static java.time.LocalDate.now;
import static java.time.Month.of;

public abstract class Calculador {
    private LogTransaction log;
    private int mesEnPromocion;

    protected Calculador(LogTransaction log, int mesEnPromocion) {
        this.log = log;
        this.mesEnPromocion = mesEnPromocion;
    }

    public double calcularPrecio(double precioProducto) {
        double precioTotal;
        if (of(mesEnPromocion).equals(now().getMonth())) {
            precioProducto = obtenerPrecioPromocion(precioProducto);
        } else {
            precioProducto = obtenerPrecioSinPromocion(precioProducto);
        }
        log.log(CalculadorNoJubilado.class.getName());
        return precioProducto;
    }

    protected abstract double obtenerPrecioSinPromocion(double precioProducto);

    protected abstract double obtenerPrecioPromocion(double precioProducto);

}
