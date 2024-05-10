
/**
 * Write a description of class Empleado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
    public Personal(String nombre, String apellidos,String fechaNac, String telefono, TipoEmpleado cargo)
    {
        super(nombre, apellidos, fechaNac, telefono);
        this.ID = contador++;
        this.cargo = cargo;
    }
    
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
        return this.ID + " " + super.getNombre() + " " + super.getApellidos() + " " + this.cargo;
    }


}
