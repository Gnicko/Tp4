package punto2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PoyectoTest {
    TareaHU tarea1;
    TareaHU tarea2;
    TareaHU tarea3;
    Spike tarea4;

    HU historia1;
    HU historia2;

    Proyecto proyectoScrum;

    @BeforeEach
    void cargarDatos() {
        tarea1 = new TareaHU("cargar nombre", 15);
        tarea2 = new TareaHU("agreagar usuario", 30);
        tarea3 = new TareaHU("compribar informacion", 40);
        tarea4 = new Spike("analisar datos", 50);
        historia1 = new HU("historia 1");
        historia2 = new HU("historia 2");
        proyectoScrum = new Proyecto("administracion de usuarios");
        historia1.agregarHU(tarea1);
        historia2.agregarHU(tarea2);
        historia2.agregarHU(tarea3);
        proyectoScrum.agregarItem(historia1);
        proyectoScrum.agregarItem(historia2);
        proyectoScrum.agregarItem(tarea4);
    }

    @Test
    void obtenerTiempo1Test() {


        assertEquals(135, proyectoScrum.obtenerTiempoDePoryecto());
    }

    @Test
    void obtenerTimpoDeUnaParteTest() {
       assertEquals(70,historia2.obtenerTiempo());
    }
}
