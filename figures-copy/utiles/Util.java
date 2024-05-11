package utiles;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 * clase 
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
    
    public static LocalDate dateParser(String date) {
        return LocalDate.parse(date);
    }
    
    public static LocalTime hourParser(String hour) {
        return LocalTime.parse(hour);
    }
    
    
    
}
