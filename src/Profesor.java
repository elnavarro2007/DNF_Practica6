
import java.time.LocalDate;

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
