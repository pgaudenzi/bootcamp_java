package clase_3.ej2;

public class Rectangulo extends FiguraGeometrica {

    private final double base;
    private final double altura;

    public Rectangulo (final double base, final double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        return base * altura;
    }
}
