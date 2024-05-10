import java.time.LocalDate;
import java.time.LocalTime;

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
    private PersonalMedico empleado;
    private Unidad unidad;
    private LocalDate fecha; 
    private LocalTime hora;
    private modoCita modoCita;
    
    public static enum modoCita {PRESENCIAL, TELEFONO}

    /**
     * Constructor for objects of class Cita
     */
    public Cita(PersonalMedico empleado, Paciente paciente,Unidad unidad, LocalDate fecha, LocalTime hora, modoCita modoCita)
    {
        this.empleado = empleado;      
        this.paciente = paciente;
        this.unidad = unidad;
        this.fecha = fecha;
        this.hora = hora;
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
    
    public LocalDate getFecha()
    {
        return this.fecha;
    }
    
    public void setFecha(LocalDate fecha)
    {
        this.fecha = fecha;
    }
    
      public LocalTime getHora()
    {
        return this.hora;
    }
    
    public void setFecha(LocalTime hora)
    {
        this.hora = hora;
    }
    
    
    @Override
    public String toString() {
        return this.paciente.getNombre() + " " + this.paciente.getApellidos()  
        + "\ntiene cita " +this.modoCita  + " con " + this.empleado.getCargo() + " " + this.empleado.getNombre() + " " + this.empleado.getApellidos()
        + "\nen la unidad de " + this.unidad.getNombre()
        + "\n el dia " + this.fecha + " a las " + this.hora;
    }
}
