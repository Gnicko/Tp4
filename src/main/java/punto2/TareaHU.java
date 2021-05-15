package punto2;

public class TareaHU extends Tarea{
    public TareaHU(String nombre, int tiempo) {
        super(nombre, tiempo);
    }

    @Override
    public int obtenerTiempo() {
        return super.tiempo;
    }
}
