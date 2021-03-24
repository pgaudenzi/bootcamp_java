package clase_3.ej2;

public class FiguraGeometricaUtil {

    public static double areaPromedio (FiguraGeometrica[] figuras) {
        double area = 0;
        for (FiguraGeometrica figura : figuras) {
            area += figura.area();
        }
        return area/n;
    }

}
