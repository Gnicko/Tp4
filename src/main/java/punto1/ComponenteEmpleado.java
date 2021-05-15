package punto1;

public abstract class ComponenteEmpleado {
    private String nombre;

    public ComponenteEmpleado(String nombre) {
        this.nombre = nombre;
    }

    public abstract double obtenerSueldo();

    public abstract void agregarEmpleado(ComponenteEmpleado componente);
}
