package personas;

import enumerados.Especialidad;
import enumerados.TipoEmpleado;
/**
 * Write a description of class Medico here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Medico extends PersonalMedico
{
   
    private Especialidad esp; 
    /**
     * Constructor for objects of class Medico
     */
    public Medico(String nombre, String apellidos, String fechaNac,String telefono)
    {
        super(nombre, apellidos, fechaNac, telefono, TipoEmpleado.MEDICO);
    }
    
    public Especialidad getEspecialidad()
    {
        return this.esp;
    }
    
    public void setEspecialidad(Especialidad esp)
    {
        this.esp = esp;
    }
    
    @Override
    public String toString() {
        return super.toString() + " esp. " + this.esp;
    }

    
}
