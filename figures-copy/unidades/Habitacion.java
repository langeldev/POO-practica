package unidades;

import enumerados.Especialidad;
import personas.Paciente;

/**
 * Write a description of class Habitacion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Habitacion
{
    private int num;
    private Paciente paciente;
    private Especialidad esp;

    /**
     * Constructor for objects of class Habitacion
     */
    public Habitacion(int num)
    {
         this.num = num;
         this.paciente = null;
         this.esp = null;
    }
    
    public Habitacion(int num, Especialidad esp)
    {
         this.num = num;
         this.paciente = null;
         this.esp = esp;
    }
    
    public int getNumber()
    {
        return this.num;
    }
    
    public void setNumber(int num)
    {
        this.num = num;
    }
    
    public boolean isOcupada()
    {
        return this.paciente != null;
    }
    
    public void ingresarPaciente(Paciente paciente)
    {
        this.paciente = paciente;
    }
    
    public void desocupar()
    {
        this.paciente = null;
    }
    
    public Paciente getPaciente() 
    {
        return this.paciente;
    }
    
    public Especialidad getEspecialidad()
    {
        return this.esp;
    }
    
    public void setEspecialidad(Especialidad esp)
    {
        this.esp = esp;
    }
    
}
