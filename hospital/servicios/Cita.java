package servicios;

import java.time.LocalDate;
import java.time.LocalTime;

import personas.*;
import unidades.*;
import utiles.Util;
import enumerados.ModoCita;
/**
 * Clase Cita.
 * 
 * Las citas son para un pacientes vea a alguien del personal sanitario en una unidad
 * a una fecha y hora determinada, pueden ser presencial o por telefono
 */
public class Cita
{
    private Paciente paciente;
    private PersonalMedico empleado;
    private Unidad unidad;
    private LocalDate fecha; 
    private LocalTime hora;
    private ModoCita modoCita;
    
    /**
     * Constructor class Cita
     */
    public Cita(Paciente paciente, PersonalMedico empleado, Unidad unidad, String fecha, String hora, ModoCita modoCita)
    {
        this.empleado = empleado;      
        this.paciente = paciente;
        this.unidad = unidad;
        this.fecha = Util.dateParser(fecha);
        this.hora = Util.hourParser(hora);
        this.modoCita = modoCita;
    }
    
    //getters y setters
    public Paciente getPaciente()
    {
        return this.paciente;
    }
    
    public void setPaciente(Paciente paciente)
    {
        this.paciente = paciente;    
    }
      
    public PersonalMedico getPersonal()
    {
        return this.empleado;
    }
    
    public void setPersonal(PersonalMedico empleado)
    {
        this.empleado = empleado;    
    }
    
    public Unidad getUnidad()
    {
        return this.unidad;
    }
    
    public void setUnidad(Unidad unidad)
    {
        this.unidad = unidad;    
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
    
    /**
     * Comprueba si existe la hora y la fecha
     * @params String fecha 
     * @param String hora 
     * @return true si está encuentra coincidencia de fecha y hora
     */
    public boolean isOcupada(String fecha, String hora) 
    {
        LocalDate fechaNueva = Util.dateParser(fecha);
        LocalTime horaNueva = Util.hourParser(hora);
        return fechaNueva.equals(this.fecha) && horaNueva.equals(this.hora);
    }
    
    @Override
    public String toString() {
        return "----------------------------------------------\n"
        + this.paciente.getNombre() + " " + this.paciente.getApellidos()  
        + "\ntiene cita " +this.modoCita  + " con " + this.empleado.getCargo() + " " + this.empleado.getNombre() + " " + this.empleado.getApellidos()
        + "\nen la unidad de " + this.unidad.getNombre()
        + "\nel dia " + this.fecha + " a las " + this.hora;
    }
}
