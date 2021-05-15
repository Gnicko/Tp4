package punto1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class ComponenteEmpleadoTest {
    Empresa empresa;
    ComponenteEmpleado director;
    ComponenteEmpleado gerente;
    ComponenteEmpleado mandosMedios;
    ComponenteEmpleado lideresDeProtecto;
    ComponenteEmpleado lideresDeProtecto2;
    ComponenteEmpleado empleadoRegular;
    ComponenteEmpleado EmpleadoRegular2;

    @BeforeEach
    void cargarDatos() {
        director = new Empleados("Director", 100);
        gerente = new Empleados("Gerente", 90);
        mandosMedios = new Empleados("Mandos medios", 80);
        lideresDeProtecto = new Empleados("Lideres de proyecto", 50);
        lideresDeProtecto2 = new Empleados("Lideres de proyecto2", 50);
        empleadoRegular = new EmpleadoRegular("Empleado Regular", 20);
        EmpleadoRegular2 = new EmpleadoRegular("empelado regular 2", 20);
        empresa = new Empresa("Laser X", director);
    }


    @Test
    void obtenerSueldo() {
        lideresDeProtecto.agregarEmpleado(empleadoRegular);
        mandosMedios.agregarEmpleado(lideresDeProtecto);
        gerente.agregarEmpleado(mandosMedios);
        director.agregarEmpleado(gerente);

        assertEquals(340, empresa.ObtenerSalarioDeEmpresa());
    }

    @Test
    void obtenerSueldo2() {
        lideresDeProtecto.agregarEmpleado(empleadoRegular);
        lideresDeProtecto2.agregarEmpleado(EmpleadoRegular2);
        mandosMedios.agregarEmpleado(lideresDeProtecto);
        mandosMedios.agregarEmpleado(lideresDeProtecto2);
        gerente.agregarEmpleado(mandosMedios);
        director.agregarEmpleado(gerente);

        assertEquals(410, empresa.ObtenerSalarioDeEmpresa());
    }
}
