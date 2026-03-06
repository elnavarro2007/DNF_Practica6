
import java.time.LocalDate;

public class Profesor extends Trabajador {

    private final String especialidad;
    private final int horasLectivasSemanales;

    public Profesor(String nombre, String apellidos, String DNI, LocalDate fechaIncorporacion, double salarioBase, String especialidad, int horasLectivasSemanales) {
        super(nombre, apellidos, DNI, fechaIncorporacion, salarioBase);
        this.especialidad = especialidad;
        this.horasLectivasSemanales = horasLectivasSemanales;
    }

    @Override
    public double calcularSalario() {
        return super.getSalarioBase() + (super.getSalarioBase() * horasLectivasSemanales);
    }

    @Override
    public String trabajar() {
        return "Imparte clase en su especialidad " + especialidad;
    }

}
