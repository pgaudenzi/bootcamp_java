package clase_3.ej3;

import java.util.Comparator;

public class SortUtil {

    public static <T> void ordenar (T[] arr, Comparator<T> comparator) {

        int n = arr.length;
        T temp;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (comparator.compare(arr[j], arr[j+1]) > 0) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

    }

}
