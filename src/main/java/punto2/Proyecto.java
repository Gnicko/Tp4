package punto2;

import java.util.ArrayList;
import java.util.List;

public class Proyecto {
    private List<Item> items;
    private String nombre;
    public  Proyecto(String nombre){
        this.items = new ArrayList<>();
        this.nombre= nombre;
    }
    public void agregarItem(Item item){
        items.add(item);
    }
    public int obtenerTiempoDePoryecto(){
        int tiempo=0;
        for (Item item :items){
           tiempo+= item.obtenerTiempo();
        }
        return tiempo;
    }
}
