package utiles;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;


/**
 * clase Util
 * 
 * Contiene herramientas para facilitar tareas de la aplicacion
 */
public class Util
{
    
    public static final Scanner sc = new Scanner(System.in); 
    /**
     * Recoge la informacion del usuario
     */
    public static int getUserNumber()
    { 
        int num = -1;
        try {
          num = sc.nextInt();
        }
        catch(Exception e) {
          System.out.print("Debe introducir un numero.\n");
        } finally {
          sc.nextLine();
        }
        return num;
    }
    
    /**
     * Recoge la informacion del usuario
     */
    public static String getUserText()
    { 
        
        try {
          String text = sc.nextLine();
          return text;
        }
        catch(Exception e) {
           sc.nextLine();
           return "";
        }
    }
    
    /**
     * Cambia el tipo del dato 
     * @param String fecha
     * @return LocalDate
     */
    public static LocalDate dateParser(String date) {
         LocalDate dato = null;
        try {
            dato = LocalDate.parse(date);
        } catch (Exception e){
            System.out.println("Formato incorrecto: yyyy-MM-dd");
        }
        return dato;
    }
    
     /**
     * Cambia el tipo del dato 
     * @param String hora
     * @return LocalTime
     */
    public static LocalTime hourParser(String hour) {
        LocalTime dato = null;
        try {
            dato = LocalTime.parse(hour);
        }catch (Exception e){
            System.out.println("Formato incorrecto: hh:mm");
        }
        return dato;
    }
       
}
