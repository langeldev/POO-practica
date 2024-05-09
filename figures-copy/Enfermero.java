
/**
 * Write a description of class PersonalEnfermeria here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enfermero extends PersonalMedico
{
    
    public Enfermero(String nombre, String apellidos, int anyo,int mes, int dia, String telefono)
    {
        super(nombre, apellidos, anyo, mes, dia, telefono, TipoEmpleado.ENFERMERO);
    }
}
