package integrador.ej1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main (String[] args) {
        Prenda p1 = new Prenda("pepe", "remera");
        Prenda p2 = new Prenda("pepa", "media");

        List<Prenda> prendas = new ArrayList<>();
        prendas.add(p1);
        prendas.add(p2);

        GuardaRopa guardaRopa = new GuardaRopa();
        System.out.println(guardaRopa.guardarPrendas(prendas));
        guardaRopa.mostrarPrendas();
        System.out.println(guardaRopa.devolverPrenda(0));

    }

}
