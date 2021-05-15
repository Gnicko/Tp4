package punto4;

import static java.time.LocalDate.now;
import static java.time.Month.of;

public class CalculadorNoJubilado extends Calculador {


    CalculadorNoJubilado(LogTransaction log, int mesEnPromocion) {
        super(log, mesEnPromocion);
    }

    @Override
    protected double obtenerPrecioSinPromocion(double precioProducto) {
        return precioProducto + precioProducto * 0.21;
    }

    @Override
    protected double obtenerPrecioPromocion(double precioProducto) {
        return precioProducto + precioProducto * 0.15;
    }


}