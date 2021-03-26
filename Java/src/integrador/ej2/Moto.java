package integrador.ej2;

public class Moto extends Vehiculo{

    private static final int PESO = 1300;
    private static final int RUEDAS = 2;

    public Moto(int velocidad, int aceleracion, int anguloGiro, String patente) {
        super(velocidad, aceleracion, anguloGiro, patente, PESO, RUEDAS);
    }

}
