package servicios;

import personas.Paciente;


/**
 * Write a description of class ServiciosMedicos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ServiciosMedicinas
{

    public static void actualizarExpediente(Paciente paciente, String nota)
    {
       paciente.addExpediente(nota);
    }
    
}
