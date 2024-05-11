package personas;


/**
 * Write a description of class Estudiante here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Estudiante extends Persona
{
    private PersonalMedico empleadoAsignado;
    private static int contador = 1;
    private final int ID;
    public Estudiante(String nombre, String apellidos,String fechaNac, String telefono, PersonalMedico empleado)
    {
        super(nombre, apellidos, fechaNac, telefono);
        this.ID = contador++;
        this.empleadoAsignado = empleado;
    }
    
    public int getID()
    {
        return this.ID;
    }
    
    public PersonalMedico getEmpleadoAsignado()
    {
        return this.empleadoAsignado;
    }
    
    public void setEmpleadoAsignado(PersonalMedico empleado)
    {
        this.empleadoAsignado = empleado;
    }
    
    @Override
    public String toString() {
        return this.getID() + " " + super.getNombre() + " " + super.getApellidos();
    }


  
}
