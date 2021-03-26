package integrador.ej2;

import java.util.*;

public class Carrera {

    private double distancia;
    private int premioEnDolares;
    private String nombre;
    private int cantidadDeVehiculos;
    private List<Vehiculo> vehiculos;
    private final SocorristaAuto socorristaAuto = new SocorristaAuto();
    private final SocorristaMoto socorristaMoto = new SocorristaMoto();

    public Carrera(double distancia, int premioEnDolares, String nombre, int cantidadDeVehiculos,
                   List<Vehiculo> vehiculos) {
        this.distancia = distancia;
        this.premioEnDolares = premioEnDolares;
        this.nombre = nombre;
        this.cantidadDeVehiculos = cantidadDeVehiculos;
        this.vehiculos = vehiculos;
    }

    public void darDeAltaAuto(final int velocidad, final int aceleracion, final int angGiro, final String patente) {
        if (vehiculos.size() < cantidadDeVehiculos) {
            Vehiculo vehiculo = new Auto(velocidad, aceleracion, angGiro, patente);
            vehiculos.add(vehiculo);
        }
    }

    public void eliminarVehiculo(final Vehiculo vehiculo) {
        vehiculos.remove(vehiculo);
    }

    public void eliminarVehiculoConPatente(final String patente) {
        vehiculos.removeIf(vehiculo -> patente.equals(vehiculo.getPatente()));
    }

    public Vehiculo getGanador() {
        final Map<Double, Vehiculo> tablaResultados = calcularResultados();
        final List<Double> resultados = new ArrayList<>(tablaResultados.keySet());
        Collections.sort(resultados);
        final Double max = resultados.get(resultados.size() - 1);

        return tablaResultados.get(max);
    }

    private Map<Double, Vehiculo> calcularResultados() {
        Map<Double, Vehiculo> resultados = new HashMap<>();
        Double calculo = 0.0;
        for (Vehiculo vehiculo : vehiculos) {
            calculo = vehiculo.getVelocidad() * (vehiculo.getAceleracion()/2) /
                    (vehiculo.getAnguloGiro() * (vehiculo.getPeso() - vehiculo.getRuedas() * 100));
            resultados.put(calculo, vehiculo);
        }
        return resultados;
    }

    public void darDeAltaMoto(final int velocidad, final int aceleracion, final int angGiro, final String patente) {
        if (vehiculos.size() < cantidadDeVehiculos) {
            Vehiculo vehiculo = new Moto(velocidad, aceleracion, angGiro, patente);
            vehiculos.add(vehiculo);
        }
    }

    public void socorrerAuto(final String patente) {
        for (Vehiculo v : vehiculos){
            if (v instanceof Auto && v.getPatente().equals(patente))
                socorristaAuto.socorrer((Auto) v);
        }
    }

    public void socorrerMoto(final String patente) {
        for (Vehiculo v : vehiculos){
            if (v instanceof Moto && v.getPatente().equals(patente))
                socorristaMoto.socorrer((Moto) v);
        }
    }

    public void socorrer (String patente) {
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public int getPremioEnDolares() {
        return premioEnDolares;
    }

    public void setPremioEnDolares(int premioEnDolares) {
        this.premioEnDolares = premioEnDolares;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadDeVehiculos() {
        return cantidadDeVehiculos;
    }

    public void setCantidadDeVehiculos(int cantidadDeVehiculos) {
        this.cantidadDeVehiculos = cantidadDeVehiculos;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }
}
