
/**
 * Write a description of class PersonalMedico here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class PersonalMedico extends Personal
{
    private Agenda agenda;

    public PersonalMedico(String nombre, String apellidos, int anyo,int mes, int dia, String telefono, TipoEmpleado cargo)
    {
        super(nombre, apellidos, anyo, mes, dia, telefono, cargo);
        this.agenda = null;
    }

    public Agenda getAgenda()
    {
      return this.agenda;  
    }
    
    public void setAgenda(Agenda agenda)
    {
        this.agenda = agenda;
    }
    
    public void actualizarExpediente(Paciente p, String s)
    {
        p.getExpediente().addExpediente(s);
    }
    
}
