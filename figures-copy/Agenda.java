import java.util.ArrayList;

/**
 * Write a description of class Agenda here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Agenda
{
    // instance variables - replace the example below with your own
    private ArrayList<Cita> citas;

    /**
     * Constructor for objects of class Agenda
     */
    public Agenda()
    {
        // initialise instance variables
        this.citas = new ArrayList();
    }
    
    public void addCita(Cita cita){
        this.citas.add(this.citas.size(), cita);
    }
    
    public ArrayList<Cita> getCitas() {
        return this.citas;
    }

 
}
