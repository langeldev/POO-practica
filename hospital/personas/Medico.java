package personas;

import enumerados.Especialidad;
import enumerados.TipoEmpleado;
/**
 * Clase Medico
 * 
 * crea la instancia del personal de medicina,
 * esta clase se hereda de PersonalMedico, los medicos tienen especialidades y diferentes responsabilidades
 * respecto a otros miembros del personal 
 */
public class Medico extends PersonalMedico
{
   
    private Especialidad esp;
    
    /**
     * Constructor Medico
     */
    public Medico(String nombre, String apellidos, String fechaNac,String telefono, String dni)
    {
        super(nombre, apellidos, fechaNac, telefono, dni,TipoEmpleado.MEDICO);
    }
    
    //getter y setter 
    public Especialidad getEspecialidad()
    {
        return this.esp;
    }
    
    public void setEspecialidad(Especialidad esp)
    {
        this.esp = esp;
    }
    
    /**
     * Metodo de sobreescritura
     */    
    @Override
    public String toString() {
        return super.toString() + ((this.esp != null) ?  "\nEspecialidad: " + this.esp : "");
    }
    
}
