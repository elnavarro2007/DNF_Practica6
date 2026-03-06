import java.time.LocalDate;

public class PersonalAdministrativo extends Trabajador {

    private final String departamento;



    public PersonalAdministrativo(String nombre, String apellidos, String DNI, LocalDate fechaIncorporacion, double salarioBase, String departamento) {
        super(nombre, apellidos, DNI, fechaIncorporacion, salarioBase);
        this.departamento = departamento;

    }




    @Override
    public String trabajar() {
        return "Realiza tareas administrativas del departamento " + departamento;
    }


}