import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
/**
 * Clase abstracta que representa a un trabajador en un centro educativo.
 * Define los atributos comunes a todos los trabajadores y proporciona métodos
 * para calcular la antigüedad, una descripción genérica de trabajo y una representación en cadena.
 * Las subclases pueden sobrescribir el método trabajar() para especificar tareas particulares.
 *
 * @author Diego Navarro Fernandez
 * @version 1.0
 */



public abstract class Trabajador {

    private final String nombre;
    private final String apellidos;
    private final String DNI;
    private final LocalDate fechaIncorporacion;
    private final double salarioBase;


    // getter y setter
    public String getNombre() {
        return nombre;
    }



    public String getApellidos() {
        return apellidos;
    }





    public double getSalarioBase() {
        return salarioBase;
    }



    public Trabajador(String nombre, String apellidos, String DNI, LocalDate fechaIncorporacion, double salarioBase) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.DNI = DNI;
        this.fechaIncorporacion = fechaIncorporacion;
        this.salarioBase = salarioBase;
    }




    public String trabajar() {
        return "Estoy trabajando en el centro educativo";
    }

    public int antiguedad() {
        return (int) ChronoUnit.YEARS.between(fechaIncorporacion, LocalDate.now());
    }

    @Override
    public String toString() {
        /**
         * Devuelve los atributos.
         * @return nombre, apellidos, dni, fechaIncorporacion, salarioBase
         */
        return "Trabajador: " +
                "nombre ='" + nombre + '\'' +
                ", apellidos ='" + apellidos + '\'' +
                ", DNI ='" + DNI + '\'' +
                ", fechaIncorporacion =" + fechaIncorporacion +
                ", salarioBase =" + salarioBase;


    }
}