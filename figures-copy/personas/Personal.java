package personas;

import unidades.Unidad;
import enumerados.TipoEmpleado;

/**
 * Clase Personal
 * 
 * Es la encargada de almacenar la informacion de los empleados del hospital
 * como la unidad en la que trabaja o su cargo
 */
public abstract class Personal extends Persona
{
    // instance variables - replace the example below with your own
    protected static int contador = 1;
    protected final int ID;
    protected Unidad unidad;
    protected TipoEmpleado cargo;
    /**
     * Constructor for objects of class Empleado
     */  
    public Personal(String nombre, String apellidos,String fechaNac, String telefono, String dni, TipoEmpleado cargo)
    {
        super(nombre, apellidos, fechaNac, telefono, dni);
        this.ID = contador++;
        this.cargo = cargo;
    }
    //getters y setters
    public int getID()
    {
        return this.ID;
    }
    
    public Unidad getUnidad()
    {
        return this.unidad;
    }
    
    
    public void setUnidad(Unidad unidad)
    {
        this.unidad = unidad;
    }
    
    public TipoEmpleado getCargo()
    {
        return this.cargo;
    }
    
    @Override
    public String toString() {
        return "------------------------------------------------"
        + "\nID: "+this.ID +  "\nDNI: " + super.getDNI()
        +"\nNombre: " +super.getNombre() + "\nApellidos: " + super.getApellidos() + "\nCargo: " + this.cargo;
    }


}
