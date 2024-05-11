package utiles;

import java.time.LocalDate;
import java.time.LocalTime;

import personas.*;
import unidades.*;
/**
 * Write a description of class Cita here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cita
{
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
    public Cita(Paciente paciente, PersonalMedico empleado, Unidad unidad, String fecha, String hora, modoCita modoCita)
    {
        this.empleado = empleado;      
        this.paciente = paciente;
        this.unidad = unidad;
        this.fecha = Util.dateParser(fecha);
        this.hora = Util.hourParser(hora);
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
    
    /**
     * metodo que comprueba si existe la hora esta ocupada
     * @params fecha
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
        return this.paciente.getNombre() + " " + this.paciente.getApellidos()  
        + "\ntiene cita " +this.modoCita  + " con " + this.empleado.getCargo() + " " + this.empleado.getNombre() + " " + this.empleado.getApellidos()
        + "\nen la unidad de " + this.unidad.getNombre()
        + "\n el dia " + this.fecha + " a las " + this.hora;
    }
}
