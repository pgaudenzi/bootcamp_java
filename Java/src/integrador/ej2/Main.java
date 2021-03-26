package integrador.ej2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main (String[] args) {
        Vehiculo v1 = new Auto(15, 100, 90, "abc123");
        Vehiculo v2 = new Auto(20, 13, 90, "abc124");
        Vehiculo v3 = new Moto(10, 28, 180, "abc125");
        Vehiculo v4 = new Moto(5, 300, 180, "abc126");
        Vehiculo v5 = new Auto(15, 30, 90, "abc127");

        List<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(v1);
        vehiculos.add(v2);
        vehiculos.add(v3);
        vehiculos.add(v4);
        vehiculos.add(v5);

        Carrera carrera =
                new Carrera(150.8, 300, "carrera1", 15, vehiculos);

        System.out.println(carrera.getGanador());
        carrera.socorrerAuto("abc124");

    }

}
