package punto2;

public class Spike extends Tarea{
    public Spike(String nombre, int tiempo) {
        super(nombre, tiempo);
    }

    @Override
    public int obtenerTiempo() {
        return super.tiempo;
    }
}
