package punto1;

public class EmpleadoRegular extends ComponenteEmpleado {
    private double sueldo;

    public EmpleadoRegular(String nombre, double sueldo) {
        super(nombre);
        this.sueldo = sueldo;
    }

    @Override
    public double obtenerSueldo() {
        return sueldo;
    }

    @Override
    public void agregarEmpleado(ComponenteEmpleado componente) {

    }
}
