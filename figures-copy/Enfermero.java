
/**
 * Write a description of class PersonalEnfermeria here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enfermero extends PersonalMedico
{
    
    public Enfermero(String nombre, String apellidos, String fechaNac, String telefono)
    {
        super(nombre, apellidos, fechaNac, telefono, TipoEmpleado.ENFERMERO);
    }
}
