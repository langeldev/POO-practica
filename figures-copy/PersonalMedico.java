import java.util.ArrayList;
import java.util.List;
import java.time.LocalTime;
import java.time.LocalDate;

/**
 * Write a description of class PersonalMedico here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class PersonalMedico extends Personal
{
      private ArrayList<Cita> agenda;

    public PersonalMedico(String nombre, String apellidos, String fechaNac, String telefono, TipoEmpleado cargo)
    {
        super(nombre, apellidos, fechaNac, telefono, cargo);
        this.agenda = null;
    }

    public List<Cita> getAgenda()
    {
      return this.agenda;  
    }
    
    public void setAgenda(ArrayList<Cita> agenda)
    {
        this.agenda = agenda;
    }
    
    public void deleteAgenda() 
    {
        this.agenda = null; 
    }
    
    public void createCita(Paciente paciente, LocalDate fecha, LocalTime hora,Cita.modoCita modoCita)
    {
        if (!isOcupada(fecha, hora)) {
            Cita cita = new Cita(this, paciente, this.unidad, fecha, hora, modoCita);
            addCita(cita);
         } else {
            System.out.println("La fecha y la hora estan ocupadas.");
        }
    }
    
    public void addCita(Cita cita){
        this.agenda.add(this.agenda.size(), cita);
    }
    
    public void printCitasFecha(LocalDate fecha)
    {
        for (Cita cita: this.agenda) {           
            if(fecha.equals(cita.getFecha()))
            {
                 System.out.println(cita.toString());
            }
        }
    }
    
    /**
     * metodo que comprueba si existe la hora esta ocupada
     * @params fecha
     * @return true si está encuentra coincidencia de fecha y hora
     */
    public boolean isOcupada(LocalDate fecha, LocalTime hora) 
    {
        for (Cita cita: this.agenda) {
             if(fecha.equals(cita.getFecha()) && hora.equals(cita.getHora()))
                 return true;
        }
        return false;
    }
    
    public void actualizarExpediente(Paciente p, String s)
    {
        p.addExpediente(s);
    }
    
}
