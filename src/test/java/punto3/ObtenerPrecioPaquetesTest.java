package punto3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class ObtenerPrecioPaquetesTest {
    Seguro hogar = new Seguro("Seguro de hogar", 100);
    Seguro automovil = new Seguro("Seguro de automovil", 200);
    Seguro vida = new Seguro("Seguro de vida", 500);
    Seguro medico = new Seguro("Seguro medico", 300);

    Paquetes paquetePrincipal = new Paquetes("principañ");
    Paquetes paquete1 = new Paquetes("paquete1");
    Paquetes paquete2 = new Paquetes("paquete2");
    Paquetes paquete3 = new Paquetes("paquete3");

    @Test
    void calcularPreciodePaquetesTest() {
        paquete1.agregarPaquete(hogar);
        paquete1.agregarPaquete(automovil);
        paquete2.agregarPaquete(vida);
        paquete3.agregarPaquete(medico);
        paquetePrincipal.agregarPaquete(paquete1);
        paquetePrincipal.agregarPaquete(paquete2);
        paquetePrincipal.agregarPaquete(paquete3);

        assertEquals(880, paquetePrincipal.calcularDescuento(
                paquetePrincipal.obtenerPrecio()));
    }

    @Test
    void calcularPreciodePaquetesTest2() {
        paquete1.agregarPaquete(hogar);
        paquete1.agregarPaquete(automovil);

        paquetePrincipal.agregarPaquete(paquete1);

        assertEquals(270, paquetePrincipal.calcularDescuento(
                paquetePrincipal.obtenerPrecio()));
    }
}
