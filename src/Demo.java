import java.time.LocalDate;
import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Trabajador> trabjadores = new ArrayList<>();

        trabjadores.add(new Profesor("Oracio", "saguillo", "12344", LocalDate.of(2023, 2, 2), 1000.00, "musica"));
        trabjadores.add(new Profesor("Rompe", "Techos", "12544", LocalDate.of(2020, 2, 2), 100.00, "tecnologia"));
        trabjadores.add(new PersonalAdministrativo("Pepe", "Gotera", "14344", LocalDate.of(2012, 2, 2), 2000.00, "1"));
        trabjadores.add(new PersonalAdministrativo("Tete", "Cohete", "13344", LocalDate.of(202, 2, 2), 20.00, "2"));


        CentroEducativo centroEducativo = new CentroEducativo(trabjadores);

        //muestra todos la lista de trabajadores listados
        System.out.println("MOSTRAR TRABAJADORES");
        centroEducativo.mostrarTrabajadores();

        //hace la suma de los salarios y hace la media
        System.out.println();
        System.out.println("SALARIO MEDIO");
        System.out.println(centroEducativo.salarioMedio());


        // Mostrara cual es el trabajador mas antiguo
        System.out.println();
        System.out.println("TRABAJADOR MÁS ANTIGÜO");
        System.out.println(centroEducativo.trabajadorMasAntiguo());

        //muestra la especialidad de cada trabjador
        System.out.println();
        System.out.println("ULTIMO APARTADO");
        for (Trabajador tr : trabjadores) {
            System.out.println(tr.getNombre() + " " + tr.getApellidos() + " " + tr.trabajar());
        }


    }

}