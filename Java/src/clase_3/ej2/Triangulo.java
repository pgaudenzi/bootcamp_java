package clase_3.ej2;

public class Triangulo extends FiguraGeometrica {

    private final int base;
    private final int altura;

    public Triangulo (final int base, final int altura) {
        this.altura = altura;
        this.base = altura;
    }

    @Override
    public double area() {
        return (double) (base * altura)/2;
    }
}
