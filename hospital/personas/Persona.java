package personas;

import java.time.LocalDate;

import utiles.Util;

/**
 * Clase Persona
 * superclase que almacena toda la informacion personal
 */
public abstract class Persona
{
    // instance variables - replace the example below with your own
    protected String nombre;
    protected String apellidos;
    protected LocalDate fechaNacimiento;
    protected String telefono;
    protected String dni;
    
    public Persona() {}

    /**
     * Sobrecarga del constructor
     */
    public Persona(String nombre, String apellidos, String fechaNac, String telefono, String dni)
    {
        this.nombre  = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = Util.dateParser(fechaNac);
        this.telefono = telefono;
        if (dni.equals(""))
            this.dni = "None";
        else {
            this.dni = dni;
        }    
    }
    
    //getter y setter
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
    
      public void setDNI(String telefono)
    {
        this.telefono = telefono;
    }
    
    public String getDNI() 
    {
        return this.dni;
    }
    
    /**
     * Compara si los datos de la instancia cumple con criterios externos
     */
    public boolean match(String dni, String nombre, String apellidos)
    {
        return (dni.equalsIgnoreCase(this.getDNI()) || dni.equals(""))
               && (nombre.equalsIgnoreCase(this.getNombre()) || nombre.equals(""))
               && (apellidos.equalsIgnoreCase(this.getApellidos()) || apellidos.equals(""));
    }
    
}
