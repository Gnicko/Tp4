package punto2;

import java.util.ArrayList;
import java.util.List;

public class HU implements Item {
    private List<TareaHU> tareas;
    private String nombre;
    public HU(String nombre) {
        tareas = new ArrayList<>();
        this.nombre = nombre;
}

    public void agregarHU(TareaHU tarea) {
        tareas.add(tarea);
    }

    @Override
    public int obtenerTiempo() {
        int total = 0;
        for (TareaHU tarea : tareas) {
            total += tarea.obtenerTiempo();
        }
        return total;
    }
}
