package servicios;

import personas.Paciente;

/**
 * Clase ServiciosMedicinas 
 * 
 * esta clase contiene las herramientas que usan los medicos para actualziar el expediente del paciente
 */
public class ServiciosMedicinas
{
    /**
     * agrega una nota al historico del expediente
     * @param Paciente paciente que se quiere actualizar
     * @param String nota anotacion que se quiere agregar al expediente
     */
    public static void actualizarExpediente(Paciente paciente, String nota)
    {
       paciente.addExpediente(nota);
    }
    
}
