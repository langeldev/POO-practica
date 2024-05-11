package personas;

import enumerados.TipoEmpleado;

/**
 * Write a description of class Gerente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Administrador extends PersonalNoMedico
{
    /**
     * Constructor for objects of class Gerente
     */
    public Administrador(String nombre, String apellidos,String fechaNac, String telefono)
    {
        super(nombre, apellidos, fechaNac, telefono,  TipoEmpleado.ADMINISTRADOR);
    }

}
