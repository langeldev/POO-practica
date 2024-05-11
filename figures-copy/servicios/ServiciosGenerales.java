package servicios;

import unidades.*;
import personas.*;
import utiles.Cita;
import enumerados.TipoEmpleado;


/**
 * Write a description of class ServiciosGenerales here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class ServiciosGenerales
{
    public static void crearPaciente(String nombre, String apellidos,String fechaNac, String telefono) {
        Datos.addPaciente(new Paciente(nombre, apellidos, fechaNac, telefono));
    }
    
    public static void crearPaciente(String nombre, String apellidos,String fechaNac, String telefono, PersonalMedico pm) {
        Datos.addEstudiante(new Estudiante(nombre, apellidos, fechaNac, telefono, pm));
    }
    
    public static void crearEmpleado(TipoEmpleado tipo, String nombre, String apellidos,String fechaNac, String telefono) {
        Personal empleado = null;
        switch(tipo) {
            case ADMINISTRADOR:
                empleado = new Administrador(nombre, apellidos, fechaNac, telefono);
                break;
            case ENFERMERO:
                empleado = new Enfermero(nombre, apellidos, fechaNac, telefono);
                break;
            case MEDICO:
                empleado = new Medico(nombre, apellidos, fechaNac, telefono);
                break;
        }
        
        if(empleado != null) {
            Datos.addEmpleado(empleado);
        }
        
    }
    
    public static void hospitalizar(Paciente paciente,  Habitacion hab) {
        if (paciente.isHospitalizado()) {
            hab.desocupar();
        }
        if (!hab.isOcupada()){
            paciente.hospitalizar(hab);
            hab.ingresarPaciente(paciente);
        } else {
            System.out.println("La habitacion está ocupada");
        }
    }
    
    public static void crearCita(Paciente paciente, PersonalMedico pm,  Unidad ce, String fecha, String hora, Cita.modoCita modoCita) {
        if (pm.citaOcupada(fecha, hora)){
               System.out.println("La cita no está disponible.");
        } else {
            Cita cita = new Cita(paciente, pm,ce, fecha, hora, modoCita);
            pm.addCita(cita);
            paciente.addCita(cita);
            System.out.println("Cita guardadcon excito!");
            System.out.println(cita.toString());
        }
    }
    
     /**
     * Listar personal
     */
    public static void printEmpleados() {
        System.out.println("-----------------------");
        System.out.println("    Lista Personal");
        System.out.println("-----------------------");
        for (Personal empleado: Datos.getEmpleados()) {
            System.out.println(empleado.toString());
        }
    }
    
    public static void printEmpleados(TipoEmpleado tipo) {
        System.out.println("-----------------------");
        System.out.println("    Lista " + tipo);
        System.out.println("-----------------------");
        for (Personal empleado: Datos.getEmpleados().values()) {
            if (empleado.getCargo().equals(tipo))
            System.out.println(empleado.toString());
        }
    }
    

 
}
