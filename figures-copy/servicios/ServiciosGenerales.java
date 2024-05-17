package servicios;

import unidades.*;
import personas.*;
import enumerados.TipoEmpleado;
import enumerados.ModoCita;
import java.util.Calendar;
import java.util.List;
import java.util.ArrayList;


/**
 * Clase ServiciosGenerales
 * 
 * Se encarga de hacer las tareas del administrador, da de alta a personal, pacientes, estudiantes
 * e imprime listas de ellos  
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ServiciosGenerales
{
 
    /**
     * Crea a nuevos pacientes
     */
    public static void crearPaciente(String nombre, String apellidos,String fechaNac, String telefono, String dni) {
        Datos.addPaciente(new Paciente(nombre, apellidos, fechaNac, telefono, dni));
    }
    
    /**
     * Crea un nuevo estudiante
     */
    public static void crearEsudiante(String nombre, String apellidos,String fechaNac, String telefono, String dni,PersonalMedico pm) {
        Datos.addEstudiante(new Estudiante(nombre, apellidos, fechaNac, telefono, dni,pm));
    }
    
    /**
     * Crea a alguien de personal
     */
    public static void crearEmpleado(TipoEmpleado tipo, String nombre, String apellidos,String fechaNac, String telefono, String dni) {
        Personal empleado = null;
        switch(tipo) {
            case ADMINISTRADOR:
                empleado = new Administrador(nombre, apellidos, fechaNac, telefono, dni);
                break;
            case ENFERMERO:
                empleado = new Enfermero(nombre, apellidos, fechaNac, telefono, dni);
                break;
            case MEDICO:
                empleado = new Medico(nombre, apellidos, fechaNac, telefono, dni);
                break;
        }
        
        if(empleado != null) {
            Datos.addEmpleado(empleado);
        }
        
    }
    
    /**
     * Hospitaliza a un paciente
     */
    public static void darAlta(Paciente paciente) {
    
        if (paciente.isHospitalizado()) {
            Habitacion hab = paciente.getHabitacion();
            hab.desocupar();
            paciente.darAlta();
        }
        
    }
    
    /**
     * Hospitaliza a un paciente
     */
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
    
    /**
     * Crea cita y las agrega a la agenda del personal medico y al paciente
     */
    public static void crearCita(Paciente paciente, PersonalMedico pm,  Unidad ce, String fecha, String hora, ModoCita modoCita) {
        if (pm.citaOcupada(fecha, hora)){
               System.out.println("La cita no está disponible.");
        } else {
            Cita cita = new Cita(paciente, pm,ce, fecha, hora, modoCita);
            pm.addCita(cita);
            paciente.addCita(cita);
            System.out.println("Cita guarda con exito!");
            System.out.println(cita.toString());
        }
    }
    
    /**
     * Listar personal
     */
    public static void printAllEmpleados() {
        System.out.println("-----------------------");
        System.out.println("    Lista Personal");
        System.out.println("-----------------------");
        for (Personal empleado: Datos.getEmpleados()) {
            System.out.println(empleado.toString());
        }
    }
    
    public static void printAllEmpleados(TipoEmpleado tipo) {
        System.out.println("-----------------------");
        System.out.println("    Lista " + tipo);
        System.out.println("-----------------------");
        for (Personal empleado: Datos.getEmpleados()) {
            if (empleado.getCargo().equals(tipo))
            System.out.println(empleado.toString());
        }
    }
    
    /**
     * Lista los estudiantes
     */
    public static void printAllEstudiantes(){
       System.out.println("-----------------------");
       System.out.println("    Lista Estudiantes");
       System.out.println("-----------------------");
       
       for (Estudiante estudiante: Datos.getEstudiantes()) {
            System.out.println(estudiante.toString());
        }
    }
    
    /**
     * Lista los pacientes
     */
    public static void printAllPacientes(){
       System.out.println("-----------------------");
       System.out.println("    Lista Pacientes");
       System.out.println("-----------------------");
       
       for (Paciente paciente: Datos.getPacientes()) {
            System.out.println(paciente.toString());
        }
    }
    
    /**
     * Imprime a los pacientes hospitalizado
     */  
    public static void printHospitalizados()
    {
       System.out.println("-------------------------------------");
       System.out.println("    Lista Pacientes Hospitalizados");
       System.out.println("-------------------------------------");
       
       // obtengo unidad de Hospitalizacion
       Hospitalizacion hosp = (Hospitalizacion) Datos.getUnidad("Hospitalizacion");
       List<Habitacion> ocupadas = hosp.getHabiacionesOcupadas();
       
       if (ocupadas.isEmpty()) {
           System.out.println("Todas las habitaciones estan disponibles"); 
       } else {
           for (Habitacion habitacion: hosp.getHabiacionesOcupadas()) {
                System.out.println(habitacion.getPaciente().toString());
           }
       }
    }
    
    /**
     * Imprime las Unidades
     */
    public static void printAllUnidades()
    {     
       for (String unidad: Datos.getUnidades()) {
            System.out.print(unidad + " | ");
        }
    }

    
    /**
     * busca los pacientes con criterios de busqueda
     */
    public static void buscarPacientes(String dni, String nombre,  String apellidos) {
        buscarPersonas(new ArrayList<Persona>(Datos.getPacientes()), dni,nombre, apellidos);
    }
    
    /**
     * busca los empleados con criterios de busqueda
     */
    public static void buscarEmpleados(String dni, String nombre,  String apellidos) {
        buscarPersonas(new ArrayList<Persona>(Datos.getEmpleados()), dni,nombre, apellidos);
    }
    
    /**
     * Imprime las personas que cumplan los criterios de busqueda
     */
    private static void buscarPersonas(List<Persona> it,String dni, String nombre,  String apellidos){
        if (dni.equals("") && nombre.equals("") && apellidos.equals("")){
            System.out.println("Debe agregar parametros a la busqueda como dni, nombre, apellidos");
        } else {
            boolean noEncontrado = true;
            for (Persona persona: it){
               if (persona.match(dni, nombre, apellidos)){ 
                    noEncontrado = false; 
                    System.out.println(persona.toString());
                }
            }
            if (noEncontrado) {System.out.println("No existe nadie con esos datos");}
        }
    } 
}
