package punto1;

import java.util.ArrayList;
import java.util.List;

public class Empleados extends ComponenteEmpleado {
    private List<ComponenteEmpleado> empleados;
    private double sueldo;

    public Empleados(String nombre, double sueldo) {
        super(nombre);
        empleados = new ArrayList<>();
        this.sueldo = sueldo;
    }

    @Override
    public double obtenerSueldo() {
        double total = sueldo;
        for (ComponenteEmpleado c : empleados) {
            total += c.obtenerSueldo();
        }
        return total;
    }

    @Override
    public void agregarEmpleado(ComponenteEmpleado componente) {
        empleados.add(componente);
    }
}
