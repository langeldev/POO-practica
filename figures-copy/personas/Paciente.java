package personas;

import java.util.ArrayList;
import java.util.List;
import unidades.Habitacion;
import servicios.Cita;

/**
 * Clase Paciente.
 * 
 * Guarda la informacion de del paciente, guarda sus citas, su expediente medico   
 * y si actualmente está ingresado 
 */
public class Paciente extends Persona
{
    private ArrayList<String> expediente;
    private ArrayList<Cita> citas;
    private static int contador = 1;
    private final int ID;
    private Habitacion habitacion;
    
    /**
     * Constructor for objects of class Paciente
     */  
    public Paciente(String nombre, String apellidos,String fechaNac, String telefono, String dni)
    {
        super(nombre, apellidos, fechaNac, telefono, dni);
        this.ID = contador++;  
        this.expediente = new ArrayList();
        this.citas = new ArrayList();
        this.habitacion = null; 
    }
    
    public int getID()
    {
        return this.ID;
    }
    
    public void hospitalizar(Habitacion habitacion){
        this.habitacion = habitacion; 
    }
    
    public Habitacion getHabitacion()
    {
        return this.habitacion;
    }
  
    /**
     * devuelve true si el paciente está en una habitacion
     */
    public boolean isHospitalizado()
    {
        return this.habitacion != null;
    }
    
    /**
     * Saca al paciente de la habitacion
     */
    public void darAlta()
    {
        this.habitacion = null;
    }
    
    /**
     * Expediente medico del paciente
     */
    public List<String> getExpediente()
    {
        return this.expediente;
    }
    
    public void addExpediente(String historial)
    {
        this.expediente.add(historial);
    }
    /**
     * Imprime el expediente del paciente
     */
    public void printExpediente() 
    {
        for (String text: this.expediente) {
            System.out.println("------------------------------------");
            System.out.println(text);
        }
    }
    
    public List<Cita> getCitas()
    {
        return this.citas;
    }
    
    /**
     * Agrega cita
     */
    public void addCita(Cita cita){
        this.citas.add(this.citas.size(), cita);
    }
    
    public void removeCita(Cita cita) {
        if (this.citas.contains(cita)) {
            this.citas.remove(cita);
        } else {
            System.out.println("No existe la cita");
        }
    }
    
    /**
     * Busca la cita de un paciente por fecha y hora
     */
    public Cita getCita(String fecha, String hora)
    {
        for (Cita cita: this.citas) {
            if(cita.isOcupada(fecha, hora)){return cita;}
        }
        return null;
    }
    
    @Override
    public String toString() {
       return "------------------------------------------------"
        + "\nID: "+this.ID +  "\nDNI: " + super.getDNI()
        +"\nNombre: " +super.getNombre() + "\nApellidos: " + super.getApellidos()
        + "\nFecha Nacimiento: " + this.getFechaNacimiento();
    }
}
