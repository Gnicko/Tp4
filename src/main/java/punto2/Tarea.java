package punto2;

public abstract class Tarea implements Item{
     int tiempo;
     String nombre;
     public Tarea(String nombre, int tiempo){
         this.nombre = nombre;
         this. tiempo = tiempo;
     }

}
