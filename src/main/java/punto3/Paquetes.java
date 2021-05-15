package punto3;

import java.util.ArrayList;
import java.util.List;

public class Paquetes implements PaqueteGeneral {
    private List<PaqueteGeneral> paquetes;
    private String nombre;
    final private double DESCUETNO_5_PORCIENTO = 0.05;

    public Paquetes(String nombre) {
        this.nombre = nombre;
        this.paquetes = new ArrayList<>();
    }

    public void agregarPaquete(PaqueteGeneral paquete) {
        paquetes.add(paquete);
    }

    @Override
    public double obtenerPrecio() {
        double total = 0;

        for (PaqueteGeneral p : paquetes) {
            total += p.obtenerPrecio();
        }

        return total;
    }

    public double calcularDescuento(double total) {
        double descuento = 0;
        for (PaqueteGeneral p : paquetes) {
            descuento += p.obtenerCantidadDePaquetes();
        }
        descuento = descuento * DESCUETNO_5_PORCIENTO;
        return total * (1 - descuento);
    }

    public int obtenerCantidadDePaquetes() {
        return paquetes.size();
    }
}
