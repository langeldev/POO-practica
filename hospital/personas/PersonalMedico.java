package personas;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;


import enumerados.TipoEmpleado;
import servicios.Cita;

/**
 * clase PersonalMedico 
 * 
 * amplia metodos para el personal sanitario
 * dandole agenda para aquellos que lo necesitan
 * 
 */
public abstract class PersonalMedico extends Personal
{
    private ArrayList<Cita> agenda;
  
    public PersonalMedico(String nombre, String apellidos, String fechaNac, String telefono,String dni, TipoEmpleado cargo)
    {
        super(nombre, apellidos, fechaNac, telefono, dni,cargo);
        this.agenda = null;
    }
    
    /**
     * Devuelve la agenda con las citas 
     * @return List<Cita>
     */
    public List<Cita> getAgenda()
    {
      return this.agenda;  
    }
    
    /**
     * En caso de que un equipo del personal deba ausentarse
     * un sustituto se le puede añadir una agenda 
     */
    public void setAgenda(ArrayList<Cita> agenda)
    {
        this.agenda = agenda;
    }
    
    /**
     * crea la agenda para el personal que lo necesite
     */
    public void createAgenda()
    {
        this.agenda = new ArrayList<>();
    }
    
    /**
     * Elimina la agenda
     */
    public void deleteAgenda() 
    {
        this.agenda = null; 
    }
    
    /**
     * Agrega cita a la agenda
     */
    public void addCita(Cita cita){
        this.agenda.add(this.agenda.size(), cita);
    }
    
    /**
     * Da informacion del calendario del PersonalMecico mostrando las citas para una fecha
     * @param LocalDate fecha 
     */
    public void printCitasFecha(LocalDate fecha)
    {
        System.out.println("Citas de " + this.getNombre() + " para el dia " + fecha);
        boolean noCoincidencia = true;
        for (Cita cita: this.agenda) {           
            if(fecha.equals(cita.getFecha()))
            {
                noCoincidencia = false;
                System.out.println(cita.toString());
            }
        }
        if (noCoincidencia) {System.out.println("No hay citas para ese dia");}
    }
    
    /**
     * metodo que comprueba si existe la hora esta ocupada en la agenda del empleado
     * @param fecha
     * @param hora
     * @return true si coincide con otra cita
     */
    public boolean citaOcupada(String fecha, String hora) 
    {
        for (Cita cita: this.agenda) {
             if(cita.isOcupada(fecha, hora)) {return true;}
        }
        return false;
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
    
}
