package unidades;

import java.util.List;
import java.util.ArrayList;

/**
 * Clase Hospitalizacion es una subclase de Unidad
 * necesitaba ampliar metodos para tener habitaciones para los pacientes
 * y poder gestionarlas
 */
public class Hospitalizacion extends Unidad
{

    private List<Habitacion> habitaciones = new ArrayList<>();
    /**
     * Constructor Hospitalizacion
     */
    public Hospitalizacion()
    {
       super( "Hospitalizacion");
    }
    
    public void addHabitacion(Habitacion habitacion) {
        this.habitaciones.add(habitacion);
    }
    
    /**
     * Devuelve todas las habitaciones
     */
    public List<Habitacion> getHabitaciones() {
        return this.habitaciones;
    }
    
    /**
     * Devuelve la habitacion por su identificador
     */
    public Habitacion getHabitacionPorNumero(int numHabitacion) {
        for (Habitacion habitacion: this.habitaciones) {
            if (numHabitacion == habitacion.getNumber()) {
                return habitacion;
            }
        }
        return null;
    }
    
    /**
     * Devuelve una las habitaciones ocupadas por pacientes
     */
    public List<Habitacion> getHabiacionesOcupadas()
    {
        List<Habitacion> ocupadas = new ArrayList<>();
        for (Habitacion habitacion: this.habitaciones) {
            if (habitacion.isOcupada()) {
                ocupadas.add(habitacion);
            }
        }
        return ocupadas;
    }

}
