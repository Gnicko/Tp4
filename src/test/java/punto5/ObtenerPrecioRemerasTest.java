package punto5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class ObtenerPrecioRemerasTest {
    @Test
    void obtenerPecioRemeraNacionalTest() {
        Remeras remeraNacional = new Nacional(100);
        assertEquals(96.5, remeraNacional.calcularPrecio());
    }

    @Test
    void obtenerPrecioRemeraImportadasTest() {
        Remeras remeraImportada = new Importada(100);
        assertEquals(205, remeraImportada.calcularPrecio());
    }
}
