package punto1;

public class Empresa {
    private String nombre;
    private ComponenteEmpleado director;

    public Empresa(String nombre, ComponenteEmpleado director) {
        this.nombre = nombre;
        this.director = director;
    }

    public double ObtenerSalarioDeEmpresa() {
        return director.obtenerSueldo();
    }
}
