package punto5;

public class Nacional extends Remeras {


    final private double RECARGO = 0.015;
    final private double RECARGO_DEL_COMERCIANTE = 0.15;
    final private double BONIFICACION = 0.2;

    public Nacional(double precio) {
        super(precio);
    }

    @Override

    protected double obtenerPrecioRecargo(double precio) {
        return RECARGO * precio;
    }

    @Override
    protected double obtenerBonus(double precio) {
        return BONIFICACION * precio;
    }

    @Override
    protected double obtenerPrecioComerciante(double precio) {
        return RECARGO_DEL_COMERCIANTE * precio;
    }
}