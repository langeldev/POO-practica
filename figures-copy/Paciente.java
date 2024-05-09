
/**
 * Write a description of class Paciente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Paciente extends Persona
{
    private Expediente expediente;
    private static int contador = 1;
    private final int ID;
    private Habitacion habitacion;
    
    /**
     * Constructor for objects of class Paciente
     */
    public Paciente(String nombre, String apellidos, int anyo,int mes, int dia, String telefono)
    {
        super(nombre, apellidos, anyo, mes, dia, telefono);
        this.ID = contador++;  
        this.expediente = new Expediente();
        this.habitacion = null; 
    }
    
    public int getID()
    {
        return this.ID;
    }
    
    public Expediente getExpediente()
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
    
    @Override
    public String toString() {
        return this.getID() + " " + super.getNombre() + " " + super.getApellidos();
    }
    
    
    

}
