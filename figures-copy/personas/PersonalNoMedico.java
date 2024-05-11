package personas;

import enumerados.TipoEmpleado;
/**
 * Clase 
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class PersonalNoMedico extends Personal
{
    // instance variables - replace the example below with your own
    /**
     * Constructor for objects of class PersonalNoMedico
     */
    public PersonalNoMedico(String nombre, String apellidos, String fechaNac, String telefono, TipoEmpleado cargo)
    {
        super(nombre, apellidos,fechaNac, telefono, cargo); 
    }
    


}
