
import java.time.LocalDate;

/**
 * Clase que representa a un profesor, que extiende de la clase Trabajador.
 * Incluye una especialidad específica y sobrescribe el método trabajar para describir
 * sus tareas de impartir clases en dicha especialidad.
 *
 * @author Diego Navarro Fernandez
 * @version 1.0
 */

public class Profesor extends Trabajador {

    private final String especialidad;


    public Profesor(String nombre, String apellidos, String DNI, LocalDate fechaIncorporacion, double salarioBase, String especialidad) {
        super(nombre, apellidos, DNI, fechaIncorporacion, salarioBase);
        this.especialidad = especialidad;

    }




    @Override
    public String trabajar() {
        return "Imparte clase en su especialidad " + especialidad;
    }

}
