package personas;

import enumerados.TipoEmpleado;

/**
 * Clase Enfermero
 * 
 * contiene la instancia del personal de enfermeria
 * hereda de PersonalMedico y mantiene todas las propiedades y funcionalidades
 */
public class Enfermero extends PersonalMedico
{
      
    public Enfermero(String nombre, String apellidos, String fechaNac, String telefono, String dni)
    {
        super(nombre, apellidos, fechaNac, telefono, dni, TipoEmpleado.ENFERMERO);
    }
}
