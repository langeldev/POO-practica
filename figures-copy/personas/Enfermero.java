package personas;

import enumerados.TipoEmpleado;

/**
 * Write a description of class PersonalEnfermeria here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enfermero extends PersonalMedico
{
      
    public Enfermero(String nombre, String apellidos, String fechaNac, String telefono, String dni)
    {
        super(nombre, apellidos, fechaNac, telefono, dni, TipoEmpleado.ENFERMERO);
    }
}
