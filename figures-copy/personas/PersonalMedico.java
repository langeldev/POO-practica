package personas;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalTime;
import java.time.LocalDate;
import java.util.Map;
import java.util.HashMap;

import enumerados.TipoEmpleado;
import servicios.Cita;
import utiles.Util;

/**
 * clase PersonalMedico 
 * 
 * amplia metodos para el personal sanitario
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

    public List<Cita> getAgenda()
    {
      return this.agenda;  
    }
    
    public void setAgenda(ArrayList<Cita> agenda)
    {
        this.agenda = agenda;
    }
    
    public void createAgenda()
    {
        this.agenda = new ArrayList<>();
    }
       
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
     * metodo que comprueba si existe la hora esta ocupada en la agenda
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
