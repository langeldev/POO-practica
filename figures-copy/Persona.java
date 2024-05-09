 
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Clase base sobre la que construir nuevas clase que cumplan
 * los distintos roles de la aplicacion
 */
public abstract class Persona
{
    // instance variables - replace the example below with your own
    private String nombre;
    private String apellidos;
    private GregorianCalendar fechaNacimiento;
    private String dni;
    private String telefono;
    
    public Persona() {}

    /**
     * Constructor for objects of class Persona
     */
    public Persona(String nombre, String apellidos, int year, int month, int day, String telefono)
    {
        this.nombre  = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = new GregorianCalendar(year,month, day);
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
    
    public String getDNI() 
    {
        return this.dni;
    }
    
    public void setDNI(String dni)
    {
        this.dni = dni;
    }
    
     public String getTelefono() 
    {
        return this.telefono;
    }
    
    public void setTelefono(String telefono)
    {
        this.telefono = telefono;
    }
    
    public Date getFechaNacimiento() 
    {
        return this.fechaNacimiento.getTime();
    }
    
    
}
