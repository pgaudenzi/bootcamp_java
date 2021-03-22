package clase_1.radix_sort;

public class Main {

    public static void main(String[] args) {
        int[] a = {3, 673, 106, 45, 2,23};
        String base = "0123456789";
        RadixSort radixSort = new RadixSort();
        radixSort.radixSort(a, base);
    }

}
