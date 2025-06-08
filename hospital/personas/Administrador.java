package personas;

import enumerados.TipoEmpleado;

/**
 * Clase Administrador
 * 
 * Instancia la informacion de un administrador del hospital, este puede tener funcione como crear facturas
 * dar citas y demas. Hereda de PersonalNoMedico
 */
public class Administrador extends PersonalNoMedico
{
    /**
     * Constructor Administrador
     */
    public Administrador(String nombre, String apellidos,String fechaNac, String telefono, String dni)
    {
        super(nombre, apellidos, fechaNac, telefono,  dni,TipoEmpleado.ADMINISTRADOR);
    }

}
