import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;


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
    
    public static void imprimirCalendario() {
        System.out.println("medico");
        PersonalMedico p = (PersonalMedico)getEmpleado(Util.getUserNumber());
        System.out.println("fecha: yyyy/MM/dd");
        p.printCitasFecha(Util.dateParser(Util.getUserText()));
        
    }
    
    /**
     * metodo que carga los datos inciales en la aplicacion para hacer las pruebas
     */
    public static void inicializar() {
        //Unidades 
        Unidad administracion = new Unidad("Administracion");
        Unidad consultasExternas = new Unidad("Consultas Externas");
        Unidad uci = new Unidad("Unidad de Cuidados Intensivos");
        Unidad hospitalizacion = new Unidad("Hospitalizacion");
        Unidad pruebasMedicas = new Unidad("Pruebas medicas");
        Unidad uMedicasEspecializadas = new Unidad("Unidades médicas especializadas");
        Unidad urgencias = new Unidad("Urgencias");
        Unidad uFormacion = new Unidad("Unidad formación");
        Unidad cafeteria = new Unidad("Cafetería");
        Unidad aparcamiento = new Unidad("Aparcamiento");
        
        // Empleados
        // Administrador
        Administrador admin1 = new Administrador("Nestor", "Tilla", "1985-04-21", "555892122");
        admin1.setUnidad(administracion);
        addEmpleado(admin1);  
       
        //Medicos
        Medico medico1 = new Medico("Nick", "Riviera", "1972-06-12", "555892761");
        medico1.setUnidad(urgencias);
        addEmpleado(medico1);
        Medico medico2 = new Medico("Francisco", "Jurado", "1978-08-22", "M555123321");
        medico2.setUnidad(uFormacion);
        addEmpleado(medico2);
        
        //Enfermeros
        Enfermero enfermero1 = new Enfermero("Joy", "Valentine", "1992-12-01", "555 121 122");
        enfermero1.setAgenda(new ArrayList<>());
        enfermero1.setUnidad(consultasExternas);
        addEmpleado(enfermero1);
        
        //Estudiantes
        Estudiante estudiante1 = new Estudiante("Margarita", "Flores del Campo", "1998-01-05", "555 135 621",  medico2);
        addEstudiante(estudiante1);
      
        // Pacientes
        Paciente paciente1 = new Paciente("Hector", "Roldan", "2008-11-02","+34121213111");
        addPaciente(paciente1);
        Paciente paciente2 = new Paciente("Maria", "Macias", "1992-10-05", "+23663121112");
        addPaciente(paciente2);
        Paciente paciente3 = new Paciente("Julian", "Iglesias", "1952-07-12", "532676321");
        addPaciente(paciente3);
        Paciente paciente4 = new Paciente("Pedro", "Pascal", "1982-11-24", "187231891");
        addPaciente(paciente4);
        Paciente paciente5 = new Paciente("Dolores", "Fuerte de Barriga", "1973-10-04", "+32121561787");
        addPaciente(paciente5);
        //Paciente paciente6 = new Paciente("Julian", "Iglesias");
        //addPaciente(paciente6);
        //Paciente paciente7 = new Paciente("Julian", "Iglesias");
        //addPaciente(paciente7);
        
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
        
        Habitacion habitacion1 = new Habitacion(1);
        paciente5.setHabitacion(habitacion1);
        
        // Citas 
        enfermero1.createCita(paciente1, Util.dateParser("2024-12-02"), LocalTime.of(11, 50), Cita.modoCita.PRESENCIAL);
        enfermero1.createCita(paciente1, Util.dateParser("2024-12-02"), LocalTime.of(12, 5), Cita.modoCita.TELEFONO);
        enfermero1.createCita(paciente1, Util.dateParser("2024-12-02"), LocalTime.of(12, 5), Cita.modoCita.TELEFONO);
        enfermero1.createCita(paciente1, Util.dateParser("2024-12-02"), LocalTime.of(12, 20), Cita.modoCita.TELEFONO);
        enfermero1.createCita(paciente1, Util.dateParser("2024-12-02"), LocalTime.of(12, 35), Cita.modoCita.PRESENCIAL);
        enfermero1.createCita(paciente1, Util.dateParser("2024-12-03"), LocalTime.of(11, 50), Cita.modoCita.PRESENCIAL);
        enfermero1.createCita(paciente1, Util.dateParser("2024-12-03"), LocalTime.of(11, 05), Cita.modoCita.PRESENCIAL);
    }
    
    /**
     * Listar personal
     */
    public static void listarEmpleados() {
        System.out.println("-----------------------");
        System.out.println("    Lista Personal");
        System.out.println("-----------------------");
        for (Personal empleado: empleados.values()) {
            System.out.println(empleado.toString());
        }
    }
    
    public static void listarEmpleados(TipoEmpleado tipo) {
        System.out.println("-----------------------");
        System.out.println("    Lista " + tipo);
        System.out.println("-----------------------");
        for (Personal empleado: empleados.values()) {
            if (empleado.getCargo().equals(tipo))
            System.out.println(empleado.toString());
        }
    }
    
    public static Personal getEmpleado(Integer id)
    {
        return empleados.get(id);
    }
    
    public static void addEmpleado(Personal emp)
    {
        empleados.put(emp.getID(), emp); 
    }
        
    /**
     * Listar estudiantes
     */
    public static void listarEstudiantes() {
        System.out.println("-----------------------");
        System.out.println("    Lista estudiantes");
        System.out.println("-----------------------");
        
        for (Estudiante estudiante: estudiantes.values()) {
            System.out.println(estudiante.toString());
        }
    }
    
    public static Estudiante getEstudiante(Integer id)
    {
        return estudiantes.get(id);
    }
    
    
    /**
     * Listar pacientes  
     */
    public static void listarPacientes() {
        System.out.println("-----------------------");
        System.out.println("    Lista pacientes");
        System.out.println("-----------------------");
        
        for (Paciente paciente: pacientes.values()) {
            System.out.println(paciente.toString());
        }
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
    
  
    
  
    
    
  
    public static void addEstudiante(Estudiante estudiante)
    {
        estudiantes.put(estudiante.getID(),estudiante); 
    }
    
}
