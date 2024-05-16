package servicios;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import java.util.Arrays;

import personas.*;
import unidades.*;
import enumerados.*;
import utiles.Util;


/**
 * Clase Datos
 * 
 * Se encarga de manejar los datos de la aplicacion
 * 
 * @author Miguel Angel Rodriguez Roldan  
 * @version 1.0
 */
public abstract class Datos
{
    private static Map<Integer, Personal> empleados = new HashMap<Integer, Personal>();
    private static Map<Integer, Estudiante> estudiantes = new HashMap<Integer, Estudiante>();
    private static Map<Integer, Paciente> pacientes = new HashMap<Integer, Paciente>();
    private static Map<String, Unidad> unidades = new HashMap<String, Unidad>();
    
        
    /**
     * metodo que carga los datos inciales en la aplicacion para hacer las pruebas
     */
    public static void inicializar() {
 
        //Unidades 
        Unidad administracion = new Unidad("Administracion");
        addUnidad(administracion);
        Unidad consultasExternas = new Unidad("Consultas Externas");
        addUnidad(consultasExternas);
        Unidad uci = new Unidad("Unidad de Cuidados Intensivos");
        addUnidad(uci);
        Hospitalizacion hospitalizacion = new Hospitalizacion();
        addUnidad(hospitalizacion);
        Unidad analiticas = new Unidad("Analiticas");
        addUnidad(analiticas);        
        Unidad rayosX = new Unidad("Rayos X");
        addUnidad(rayosX);
        Unidad resonancia = new Unidad("Resonancia Magnetica");
        addUnidad(resonancia);
        Unidad ecografia = new Unidad("Ecografia");
        addUnidad(ecografia);
        Unidad umEspCardiologia = new Unidad(Especialidad.CARDIOLOGIA.name());
        addUnidad(umEspCardiologia);
        Unidad umEspDiavetes = new Unidad(Especialidad.DIAVETES.name());
        addUnidad(umEspDiavetes);
        Unidad urgencias = new Unidad("Urgencias");
        addUnidad(urgencias);
        Unidad uFormacion = new Unidad("Unidad formación");
        addUnidad(uFormacion);
        Unidad cafeteria = new Unidad("Cafetería");
        addUnidad(cafeteria);
        Unidad aparcamiento = new Unidad("Aparcamiento");
        addUnidad(aparcamiento);
        
        // Creamos 90 habitaciones, donde algunas son de la especialidad del hopsital
        for (int i = 1; i <= 90; i++){
            Habitacion habitacion; 
            if (i < 21) {
                habitacion = new Habitacion(i, Especialidad.DIAVETES);
            } else if(i > 20 && i < 41) {
                habitacion = new Habitacion(i, Especialidad.CARDIOLOGIA);
            } else {
                habitacion = new Habitacion(i);
            }
            hospitalizacion.addHabitacion(habitacion);
        }
        
        // Empleados
        // Administrador
        Administrador admin1 = new Administrador("Nestor", "Tilla", "1985-04-21", "555892122", "41431211K");
        admin1.setUnidad(administracion);
        addEmpleado(admin1);  
       
        //Medicos
        Medico medico1 = new Medico("Nick", "Riviera", "1972-06-12", "555892761", "42121991M");
        medico1.setUnidad(urgencias);
        addEmpleado(medico1);
        Medico medico2 = new Medico("Francisco", "Jurado", "1978-08-22", "D555123321", "11221411L");
        medico2.setEspecialidad(Especialidad.DIAVETES);
        medico2.setUnidad(hospitalizacion);
        addEmpleado(medico2);
        Medico medico3 = new Medico("Marta", "Rivera de la Cruz", "1972-01-25", "C555123321", "63553121S");
        medico3.setEspecialidad(Especialidad.CARDIOLOGIA);
        medico3.createAgenda();
        medico3.setUnidad(consultasExternas);
        addEmpleado(medico3);
        
        //Enfermeros
        Enfermero enfermero1 = new Enfermero("Joy", "Valentine", "1992-12-01", "555 121 122", "777111333P");
        enfermero1.createAgenda();
        enfermero1.setUnidad(resonancia);
        addEmpleado(enfermero1);
        
        //Estudiantes
        Estudiante estudiante1 = new Estudiante("Margarita", "Flores del Campo", "1998-01-05", "555 135 621",  "223223213H", medico3);
        addEstudiante(estudiante1);
        Estudiante estudiante2 = new Estudiante("Margarita", "Flores del Campo", "1998-01-05", "555 135 621",  "313113213K", enfermero1);
        addEstudiante(estudiante2);
      
        // Pacientes
        Paciente paciente1 = new Paciente("Hector", "Roldan", "2008-11-02","+34121213111", "131113166L");
        addPaciente(paciente1);
        Paciente paciente2 = new Paciente("Maria", "Macias", "1992-10-05", "+23663121112", "222114221N");
        addPaciente(paciente2);
        Paciente paciente3 = new Paciente("Maria", "Macias", "1952-07-12", "532676321", "888999888J");
        addPaciente(paciente3);
        Paciente paciente4 = new Paciente("Pedro", "Pascal", "1982-11-24", "187231891", "123543111F");
        addPaciente(paciente4);
        Paciente paciente5 = new Paciente("Dolores", "Fuerte de Barriga", "1973-10-04", "+32121561787", "635542121R");
        addPaciente(paciente5);
        Paciente paciente6 = new Paciente("Brian", "Tempes ", "2021-07-11", "+23663121112", ""); 
        addPaciente(paciente6);
   
        //Agregar datos al expediente
        paciente1.addExpediente("Diagnóstico: Gastritis\nTratamiento: Omeprazol 20mg, una vez al día\nÚltima revisión: 20 de mayo de 2023\nObservaciones: El paciente debe evitar alimentos picantes, ácidos o grasos y debe evitar el estrés. Se recomienda una revisión si los síntomas persisten o empeoran.\n");
        paciente1.addExpediente("Diagnóstico: Diabetes tipo 1\nTratamiento: Insulina según sea necesario\nÚltima revisión: 20 de abril de 2024\nObservaciones: El paciente debe monitorizar su nivel de azúcar en sangre diariamente.\n");
        paciente1.addExpediente("Diagnóstico:Catarros frecuentes y cefaleas tensionales\nTratamiento: Paracetamol 500mg, según sea necesario\nÚltima revisión: 15 de mayo de 2024\nObservaciones: El paciente debe mantenerse hidratado, evitar el estrés y descansar adecuadamente. Se recomienda una revisión si los síntomas persisten o empeoran.\n");
        
        paciente2.addExpediente("Diagnóstico:Catarros frecuentes y cefaleas tensionales\nTratamiento: Paracetamol 500mg, según sea necesario\nÚltima revisión: 15 de mayo de 2024\nObservaciones: El paciente debe mantenerse hidratado, evitar el estrés y descansar adecuadamente. Se recomienda una revisión si los síntomas persisten o empeoran.\n");

        paciente3.addExpediente("Diagnóstico: Hipertensión\nTratamiento: Losartán 50mg, una vez al día\nÚltima revisión: 30 de abril de 2022\nObservaciones: El paciente debe reducir la ingesta de sal y evitar el estrés.\n");
        
        paciente4.addExpediente("Diagnóstico: Insuficiencia cardíaca\nTratamiento: Furosemida 40mg, una vez al día\nÚltima revisión: 5 de mayo de 2024\nObservaciones: El paciente debe seguir una dieta baja en sodio y hacer ejercicio regularmente.\n");
        paciente4.addExpediente("Diagnóstico: Hipertensión\nTratamiento: Losartán 50mg, una vez al día\nÚltima revisión: 30 de abril de 2024\nObservaciones: El paciente debe reducir la ingesta de sal y evitar el estrés.\n");
        
        paciente5.addExpediente("Diagnóstico:Catarros frecuentes y cefaleas tensionales\nTratamiento: Paracetamol 500mg, según sea necesario\nÚltima revisión: 15 de mayo de 2024\nObservaciones: El paciente debe mantenerse hidratado, evitar el estrés y descansar adecuadamente. Se recomienda una revisión si los síntomas persisten o empeoran.\n");
        paciente5.addExpediente("Diagnóstico: Gastritis\nTratamiento: Omeprazol 20mg, una vez al día\nÚltima revisión: 20 de mayo de 2023\nObservaciones: El paciente debe evitar alimentos picantes, ácidos o grasos y debe evitar el estrés. Se recomienda una revisión si los síntomas persisten o empeoran.\n");
        
        // Citas 
        ServiciosGenerales.crearCita(paciente1, medico3, consultasExternas, "2024-12-02", "11:50", ModoCita.PRESENCIAL);
        ServiciosGenerales.crearCita(paciente2, medico3, consultasExternas, "2024-12-02", "12:05", ModoCita.PRESENCIAL);
        ServiciosGenerales.crearCita(paciente1, medico3, consultasExternas, "2024-12-02", "12:05",  ModoCita.PRESENCIAL);
        ServiciosGenerales.crearCita(paciente1, medico3, consultasExternas, "2024-12-02", "12:05",  ModoCita.PRESENCIAL);
        ServiciosGenerales.crearCita(paciente1, medico3, consultasExternas, "2024-12-02", "12:05", ModoCita.PRESENCIAL);
        ServiciosGenerales.crearCita(paciente1, medico3, consultasExternas, "2024-12-03", "11:05", ModoCita.PRESENCIAL);
        ServiciosGenerales.crearCita(paciente2, medico3, consultasExternas, "2024-12-03", "11:05", ModoCita.PRESENCIAL);
        

        ServiciosGenerales.crearCita(paciente1, enfermero1, enfermero1.getUnidad(), "2024-12-02", "12:05", ModoCita.PRESENCIAL);
        ServiciosGenerales.crearCita(paciente2, enfermero1, enfermero1.getUnidad(), "2024-12-02", "12:20", ModoCita.PRESENCIAL);
        ServiciosGenerales.crearCita(paciente3, enfermero1, enfermero1.getUnidad(), "2024-12-02", "12:35", ModoCita.PRESENCIAL);
        ServiciosGenerales.crearCita(paciente4, enfermero1, enfermero1.getUnidad(), "2024-12-02", "12:45", ModoCita.PRESENCIAL);
        ServiciosGenerales.crearCita(paciente5, enfermero1, enfermero1.getUnidad(), "2024-12-03", "15:35", ModoCita.PRESENCIAL);
        ServiciosGenerales.crearCita(paciente6, enfermero1, enfermero1.getUnidad(), "2024-12-03", "15:50", ModoCita.PRESENCIAL);

        
        //Hopsitalizacion
        ServiciosGenerales.hospitalizar(paciente4, hospitalizacion.getHabitacionPorNumero(21));
        ServiciosGenerales.hospitalizar(paciente1, hospitalizacion.getHabitacionPorNumero(2));
    }
    
    //Empleados
    public static List<Personal> getEmpleados(){
        Collection<Personal> personal = empleados.values();
        return new ArrayList<>(personal);
    }
    
    public static Personal getEmpleado(Integer id)
    {
        return empleados.get(id);
    }
    
    public static void addEmpleado(Personal emp)
    {
        empleados.put(emp.getID(), emp); 
    }
        
    // Estudiantes
    public static List<Estudiante> getEstudiantes() {
        Collection<Estudiante> listaEstudiantes = estudiantes.values();
        return new ArrayList<>(listaEstudiantes);
    }
    
    public static Estudiante getEstudiante(Integer id)
    {
        return estudiantes.get(id);
    }
    
    public static void addEstudiante(Estudiante estudiante)
    {
        estudiantes.put(estudiante.getID(),estudiante); 
    }
    
    // Pacientes    
    public static List<Paciente> getPacientes() {
        Collection<Paciente> listaPacientes = pacientes.values();
        return new ArrayList<>(listaPacientes);
    }

    /**
     * Obtiebe el paciente segun su identificador
     * @param id 
     * @return Paciente
     */
    public static Paciente getPaciente(Integer id)
    {
        return pacientes.get(id);
    }
    

    public static void addPaciente(Paciente p)
    {
        pacientes.put(p.getID(),p); 
    }
    
    public static List<String> getUnidades() {
        Collection<String> listaUnidades = unidades.keySet();
        return new ArrayList<>(listaUnidades);
    }
    
    public static Unidad getUnidad(String unidad)
    {
        return unidades.get(unidad);
    }
    
    public static void addUnidad(Unidad unidad) {
        unidades.put(unidad.getNombre(), unidad);
    }

}
