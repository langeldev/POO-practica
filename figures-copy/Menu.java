
/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu
{
        

    /**
     * Constructor for objects of class Menu
     */
    public Menu(){}

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void menuPrincipal ()
    {
        int opcion;
        Servicio servicio = new Servicio();
          
        do {
            
            System.out.println("Elige una opcion\n");
            System.out.println("1 - Servicios de gerencia");
            System.out.println("2 - Servicio medico");
            System.out.println("3 - Servicio enfermeria");
            System.out.println("4 - Listar empleados");
            System.out.println("5 - Listar pacientes");
            System.out.println("6 - Listar estudiantes");
            System.out.println("0 - Salir");
            
            opcion = Util.getUserNumber();

            switch(opcion){
                case 1:
                    servicio.gerencia();
                    break;
                case 2:
                    servicio.medico();
                    break;
                case 3:
                    servicio.enfermeria();
                    break;
                case 4:
                    Datos.listarEmpleados();
                    break;
                case 5:
                    Datos.listarPacientes();
                    break; 
                case 6:
                    Datos.listarEstudiantes();
                    break;
                case 0:
                    System.out.println("Gracias por usar el sistema");
                    break;
                default:
                    System.out.println("Por favor, use las opciones del menú");
            }
        } while(opcion != 0);
    }
}
