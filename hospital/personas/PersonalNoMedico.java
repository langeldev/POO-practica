package personas;

import enumerados.TipoEmpleado;
/**
 * Clase PersonaNoMedico
 * 
 * Separa las responsabilidades del las que tiene PersonalMedico
 * este podría elaborar informes
 */
public abstract class PersonalNoMedico extends Personal
{
    /**
     * Constructor PersonalNoMedico
     */
    public PersonalNoMedico(String nombre, String apellidos, String fechaNac, String telefono, String dni, TipoEmpleado cargo)
    {
        super(nombre, apellidos,fechaNac, telefono, dni, cargo); 
    }
}
