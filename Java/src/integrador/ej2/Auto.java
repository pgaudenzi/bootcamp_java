package integrador.ej2;

public class Auto extends Vehiculo {

    private static final int PESO = 1000;
    private static final int RUEDAS = 4;

    public Auto(int velocidad, int aceleracion, int anguloGiro, String patente) {
        super(velocidad, aceleracion, anguloGiro, patente, PESO, RUEDAS);
    }

}
