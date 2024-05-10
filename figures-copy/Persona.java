 
import java.util.Date;
import java.time.LocalDate;
/**
 * Clase base sobre la que construir nuevas clase que cumplan
 * los distintos roles de la aplicacion
 */
public abstract class Persona
{
    // instance variables - replace the example below with your own
    protected String nombre;
    protected String apellidos;
    protected LocalDate fechaNacimiento;
    protected String telefono;
    
    public Persona() {}

    /**
     * Constructor for objects of class Persona
     */
    public Persona(String nombre, String apellidos, String fechaNac, String telefono)
    {
        this.nombre  = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = Util.dateParser(fechaNac);
        this.telefono = telefono;
        
    }
    
    public String  getNombre()
    {
        return this.nombre;
    }
    
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    
    public String getApellidos()
    {
        return this.apellidos;
    }
    
    public void setApellidos(String apellidos)
    {
        this.apellidos = apellidos;
    }
    
     public String getTelefono() 
    {
        return this.telefono;
    }
    
    public void setTelefono(String telefono)
    {
        this.telefono = telefono;
    }
    
    public LocalDate getFechaNacimiento() 
    {
        return this.fechaNacimiento;
    }
    
    
}
