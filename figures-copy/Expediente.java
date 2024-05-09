import java.util.ArrayList;

/**
 * Write a description of class Expediente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Expediente
{
    // instance variables - replace the example below with your own
    private ArrayList<String> notas;

    /**
     * Constructor for objects of class Expediente
     */
    public Expediente() {
        this.notas = new ArrayList();
    }

    public void addExpediente(String historial)
    {
        this.notas.add(historial);
    }
    
    public void listarHistorial() 
    {
        for (String text: this.notas) {
            System.out.println(text);
        }
    }
}
