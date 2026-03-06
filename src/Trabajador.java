import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Trabajador {

    private final String nombre;
    private final String apellidos;
    private final String DNI;
    private final LocalDate fechaIncorporacion;
    private final double salarioBase;

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
        return "Trabajador: " +
                "nombre ='" + nombre + '\'' +
                ", apellidos ='" + apellidos + '\'' +
                ", DNI ='" + DNI + '\'' +
                ", fechaIncorporacion =" + fechaIncorporacion +
                ", salarioBase =" + salarioBase;
    }
}