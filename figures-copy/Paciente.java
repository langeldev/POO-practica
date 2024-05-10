import java.util.ArrayList;
import java.util.List;

/**
 * Write a description of class Paciente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Paciente extends Persona
{
    private ArrayList<String> expediente;
    private static int contador = 1;
    private final int ID;
    private Habitacion habitacion;
    
    /**
     * Constructor for objects of class Paciente
     */
    public Paciente(String nombre, String apellidos,String fechaNac, String telefono)
    {
        super(nombre, apellidos, fechaNac, telefono);
        this.ID = contador++;  
        this.expediente = new ArrayList();
        this.habitacion = null; 
    }
    
    public int getID()
    {
        return this.ID;
    }
    
    public List<String> getExpediente()
    {
        return this.expediente;
    }

    public void setHabitacion(Habitacion habitacion){
        this.habitacion = habitacion; 
    }
    
    public boolean isHospitalizado()
    {
        return this.habitacion != null;
    }
    
    public void addExpediente(String historial)
    {
        this.expediente.add(historial);
    }
    
    public void printExpediente() 
    {
        for (String text: this.expediente) {
            System.out.println(text);
        }
    }
    
    @Override
    public String toString() {
        return this.getID() + " " + super.getNombre() + " " + super.getApellidos();
    }
}
