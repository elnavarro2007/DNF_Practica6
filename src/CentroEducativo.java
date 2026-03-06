
import java.util.ArrayList;

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