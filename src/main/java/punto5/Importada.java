package punto5;

public class Importada extends Remeras {
    final private double RECARGO = 0.3;
    final private double IMPUESTO_ADUANERO = 0.5;
    final private double IMPUESTO_DEL_COMERCIANTE = 0.25;
    final private double BONIFICACION = 0;

    public Importada(double precio) {
        super(precio);
    }

    protected double obtenerPrecioRecargo(double precio) {
        return (RECARGO + IMPUESTO_ADUANERO) * precio;
    }

    @Override
    protected double obtenerBonus(double precio) {
        return BONIFICACION;
    }

    @Override
    protected double obtenerPrecioComerciante(double precio) {
        return IMPUESTO_DEL_COMERCIANTE * precio;
    }
}
