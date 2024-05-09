
/**
 * Write a description of class Servicio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Servicio
{

    public Servicio() { }

    public void gerencia()
    {
        int opcion, id;
        System.out.println("Elige administrador");
       // Data.listarEmpleados();
       // id = Util.getUserNumber();
        //Administrador admin = (Administrador) Data.getEmpleado(id);
        //System.out.println("Has seleccionado a " + admin.toString());
        do {   
            System.out.println("Elige una opcion");
            System.out.println("1. Crear empleado");
            System.out.println("2. Crear estudiante");
            System.out.println("3. Crear paciente");
            System.out.println("4. Crear cita");
            System.out.println("0. Volver");
            
            opcion = Util.getUserNumber();
            switch(opcion){
               case 1:
             //      admin.crearPersonal();
                   break;
               case 2:
               //    admin.crearEstudiante();
                   break;
               case 3:
                 //  admin.crearPaciente();
                   break;
               case 4:
                  // admin.crearCita();
                   break; 
               default:
                   break;
            }
        } while (opcion != 0);
    }
    
    public void medico()
    {
        int opcion, id;
        System.out.println("Elige medico");
        //Data.listarEmpleados();
        id = Util.getUserNumber();
      //  Medico medico = (Medico) Data.getEmpleado(id);
        //System.out.println("Has seleccionado a " + medico.toString());
        do {   
            System.out.println("Elige una opcion");
            System.out.println("1. Ver agenda");
            System.out.println("2. Crear estudiante");
            System.out.println("3. Crear paciente");
            System.out.println("4. Crear cita");
            System.out.println("0. Volver");
            
            opcion = Util.getUserNumber();
            switch(opcion){
               case 1:
             //      medico.getAgenda().getCitas();
                   break;
               case 2:
                  
                   break;
               case 3:
                  
                   break;
               case 4:
                
                   break; 
               default:
                   break;
            }
        } while (opcion > 0);
    }
    
    public void enfermeria()
    {
        int opcion, id;
        System.out.println("Elige medico");
        //Data.listarEmpleados();
        id = Util.getUserNumber();
        //Enfermero medico = (Enfermero) Data.getEmpleado(id);
      //  System.out.println("Has seleccionado a " + medico.toString());
        do {   
            System.out.println("Elige una opcion");
            System.out.println("1. Ver agenda");
            System.out.println("2. actualizar expediente");
            System.out.println("3. Crear paciente");
            System.out.println("4. Crear cita");
            System.out.println("0. Volver");
            
            opcion = Util.getUserNumber();
            switch(opcion){
               case 1:
         //          medico.getAgenda();
                   break;
               case 2:
                   
                  // medico.actualizarExpediente(); 
                   break;
               case 3:
                  
                   break;
               case 4:
                
                   break; 
               default:
                   break;
            }
        } while (opcion > 0);
    }
}
