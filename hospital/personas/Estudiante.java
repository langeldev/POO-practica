package personas;


/**
 * Clase Estudiante
 * 
 * La clase estudiante es subclase de Persona y tiene que tener asignado un tutor y un identificador unico de estudiantes
 * El estudiante acompañara al tutor a donde se le asigne para llevar a cabo su plan de estudios
 */
public class Estudiante extends Persona
{
    private PersonalMedico empleadoAsignado;
    private static int contador = 1;
    private final int ID;

    public Estudiante(String nombre, String apellidos,String fechaNac, String telefono,String dni, PersonalMedico empleado)
    {
        super(nombre, apellidos, fechaNac, telefono, dni);
        this.ID = contador++;
        this.empleadoAsignado = empleado;
    }
    //getters y setters
    /**
     * Obtiene el identificador de acceso al estudiante
     * @return int ID
     */
    public int getID()
    {
        return this.ID;
    }
    
    /**
     * Devuelve el tutor asignado al estudiante
     * @return PersonalMedico
     */
    public PersonalMedico getEmpleadoAsignado()
    {
        return this.empleadoAsignado;
    }
    
    /**
     * Cambia el tutor asignado
     */
    public void setEmpleadoAsignado(PersonalMedico empleado)
    {
        this.empleadoAsignado = empleado;
    }
    
    @Override
    public String toString() {
        return "------------------------------------------------"   
        + "\nID: " + this.ID +  "\nDNI: " + super.getDNI()
        + "\nNombre: " + super.getNombre() + "\nApellidos: " + super.getApellidos()
        + "\nTutor: " + this.empleadoAsignado.getNombre() + " " + this.empleadoAsignado.getApellidos();
    }


  
}
