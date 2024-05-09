import java.util.Scanner;

/**
 * Write a description of class Gerente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Administrador extends PersonalNoMedico
{
    /**
     * Constructor for objects of class Gerente
     */
    public Administrador(String nombre, String apellidos,int anyo,int mes, int dia, String telefono)
    {
        super(nombre, apellidos, anyo, mes, dia, telefono,  TipoEmpleado.ADMINISTRADOR);
    }

}
