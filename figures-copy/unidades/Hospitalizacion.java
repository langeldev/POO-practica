package unidades;
import java.util.List;
import java.util.ArrayList;


/**
 * Write a description of class Hospitalizacion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hospitalizacion extends Unidad
{

    private List<Habitacion> habitaciones = new ArrayList<>();
    /**
     * Constructor for objects of class Hospitalizacion
     */
    public Hospitalizacion()
    {
       super( "Hospitalizacion");
    }
    
    public void addHabitacion(Habitacion habitacion) {
        this.habitaciones.add(habitacion);
    }
    
    public List<Habitacion> getHabitaciones() {
        return this.habitaciones;
    }
    
    public Habitacion getHabitacionPorNumero(int numHabitacion) {
        for (Habitacion habitacion: this.habitaciones) {
            if (numHabitacion == habitacion.getNumber()) {
                return habitacion;
            }
        }
        return null;
    }

}
