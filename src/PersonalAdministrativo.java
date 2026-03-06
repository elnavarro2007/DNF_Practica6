import java.time.LocalDate;

/**
 * * Clase que representa al personal administrativo, que extiende de la clase Trabajador.
 *  * Incluye un departamento específico y sobrescribe el método trabajar para describir
 *  * sus tareas administrativas.
 *
 *  @author Diego Navarro Fernandez
 *  @version 1.0
 *
 */
public class PersonalAdministrativo extends Trabajador {

    private final String departamento;



    public PersonalAdministrativo(String nombre, String apellidos, String DNI, LocalDate fechaIncorporacion, double salarioBase, String departamento) {
        super(nombre, apellidos, DNI, fechaIncorporacion, salarioBase);
        this.departamento = departamento;

    }




    @Override
    public String trabajar() {
        /**
         * Devuelve el departamento.
         * @return deaprtamento
         */

        return "Realiza tareas administrativas del departamento " + departamento;
    }


}