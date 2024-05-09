
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
    public Medico(String nombre, String apellidos, int anyo,int mes, int dia,String telefono)
    {
        super(nombre, apellidos,anyo, mes, dia, telefono, TipoEmpleado.MEDICO);
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
