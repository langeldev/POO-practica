import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Write a description of class Cita here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cita
{
    // instance variables - replace the example below with your own
    private Paciente paciente;
    private Date fecha; 
    private PersonalMedico empleado;
    private String hora;
    private modoCita modoCita;
    
    public static enum modoCita {PRESENCIAL, TELEFONO}

    /**
     * Constructor for objects of class Cita
     */
    public Cita(Paciente paciente, PersonalMedico empleado, String fecha, String hora, modoCita modoCita)
    {
        // initialise instance variables
        this.paciente = paciente;
        this.empleado = empleado;
        Date fechaActual = Date.now();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        try
        {
            this.fecha =  formato.parse(fecha);
        }
        catch (java.text.ParseException pe)
        {
            pe.printStackTrace();
        }
        this.modoCita = modoCita;
        
    }

    public Paciente getPaciente()
    {
        return this.paciente;
    }
    
    public void setPaciente(Paciente paciente)
    {
        this.paciente = paciente;    
    }
    
    public Date getFecha()
    {
        return this.fecha;
    }
    
    public void setFecha(Date fecha)
    {
        this.fecha = fecha;
    }
    
    @Override
    public String toString() {
        return this.paciente.getNombre() + " " + this.paciente.getApellidos()  
        + "tiene cita " +this.modoCita  + " con " + this.empleado.getNombre() + " " + this.empleado.getApellidos()
        + " el dia " + this.fecha + " a las " + this.hora;
    }
}
