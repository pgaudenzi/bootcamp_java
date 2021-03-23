package clase_3.ej2;

public class Circulo extends FiguraGeometrica{

    private final int radio;

    public Circulo (final int radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI * (radio^2);
    }
}
