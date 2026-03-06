
import java.util.ArrayList;

/**
Representa un centro educativo, gestionando una lista de trabajadores.
 Esta clase permite realizar operaciones como mostrar los trabajadores, calcular
 el salario medio y encontrar al trabajador con mayor antigüedad.

 @author Diego Navarro Fernandez
 @version 1.0
 */


public class CentroEducativo {


    private final ArrayList<Trabajador> trabajdorr;



    public CentroEducativo(ArrayList<Trabajador> trabajdorr) {
        this.trabajdorr = trabajdorr;
    }



    public void mostrarTrabajadores() {
        for (Trabajador t : trabajdorr) {
            System.out.println(t);
        }
    }

    public double salarioMedio() {
        double salarioMedio = 0;
        for (Trabajador t : trabajdorr) {
            salarioMedio = salarioMedio + t.getSalarioBase();
        }
        return salarioMedio / trabajdorr.size();
    }

    public Trabajador trabajadorMasAntiguo() {
        Trabajador mayor = trabajdorr.getFirst();

        for (Trabajador t : trabajdorr) {
            if (t.antiguedad() > mayor.antiguedad()) {
                mayor = t;
            }
        }

        return mayor;
    }
}