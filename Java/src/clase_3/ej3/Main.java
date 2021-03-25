package clase_3.ej3;

import java.util.Comparator;

public class Main {

    public static void main (String[] args) {

        Persona p1 = new Persona("Pia", 30);
        Persona p3 = new Persona("Pia", 130);
        Persona p2 = new Persona("Pia", 20);
        Persona[] personas = {p1,p3,p2};

        Comparator<Persona> c1 = (a, b) -> a.getDni() - b.getDni();

        SortUtil.ordenar(personas, c1);

        for (Persona persona : personas) {
            System.out.println(persona.getDni());
        }

    }

}
