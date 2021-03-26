package clase_4;

import java.util.Comparator;

public class Main {

    public static void main (String[] args) {

        Integer[] numbers = {5,8,3,2,7,9,15,158,28};
        Comparator<Integer> c = (a,b) -> a.compareTo(b);
       try {
           Sorter qs = (Sorter) MyFactory.getInstance("quickSort");
           //Sorter hs = (Sorter) MyFactory.getInstance("heapSort");
           //Sorter bs = (Sorter) MyFactory.getInstance("bubbleSort");

           qs.sort(numbers, c);

       } catch (Exception e) {
           e.getCause();
       }

       for (int number : numbers) {
           System.out.println(number);
       }

    }

}
