package unidades;

import enumerados.Especialidad;
import personas.Paciente;

/**
 * Clase Habitacion
 * 
 * contiene un identificador, almacena un paciente cuando necesita ser ingresado 
 * y hay habitaciones que estan adaptada a la unidad de especialidad del hospital
 */
public class Habitacion
{
    private int num;
    private Paciente paciente;
    private Especialidad esp;

    /**
     * Constructor Habitacion
     */
    public Habitacion(int num)
    {
         this.num = num;
         this.paciente = null;
         this.esp = null;
    }

    /**
     * Sobrecarga de constructor en caso de tener especialidad
     */
    public Habitacion(int num, Especialidad esp)
    {
         this.num = num;
         this.paciente = null;
         this.esp = esp;
    }
    
    //getters y setters
    public int getNumber()
    {
        return this.num;
    }
    
    public void setNumber(int num)
    {
        this.num = num;
    }
    
    public Paciente getPaciente() 
    {
        return this.paciente;
    }
    
    //setter paciente me parecia mas humano llamaro ingresar
    public void ingresarPaciente(Paciente paciente)
    {
        this.paciente = paciente;
    }
    
    public Especialidad getEspecialidad()
    {
        return this.esp;
    }
    
    public void setEspecialidad(Especialidad esp)
    {
        this.esp = esp;
    }
    
    //comprueba que la habitacion est ocupada 
    public boolean isOcupada()
    {
        return this.paciente != null;
    }
    
    // elimina al paciente de la habitacion
    public void desocupar()
    {
        this.paciente = null;
    }
    
}
