package unidades;

/**
 * Clase Unidad
 * 
 * Es una superclase para denominar el espacio de trabajo para el personal
 * la clase es sencilla solo almacena el nombre del lugar asignado 
 */
public class Unidad
{
    private String nombre;

    /**
     * Constructor Unidad
     */
    public Unidad(String nombre)
    {
        this.nombre = nombre;
    }

    //getter y setter
    public String getNombre()
    {
        return this.nombre;
    }
    
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    

}
