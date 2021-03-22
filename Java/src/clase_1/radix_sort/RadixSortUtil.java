package clase_1.radix_sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class RadixSortUtil {

    public static List<Integer> convertToList(int[] intArray) {
        return Arrays.asList(Arrays.stream(intArray)
                .boxed()
                .toArray(Integer[]::new));
    }

    public static int getMaxLength(List<Integer> numbers) {
        numbers.sort(Comparator.reverseOrder());
        return Integer.toString(numbers.get(0)).length();
    }

    public static List<String> toStringList(List<Integer> numbers, int size, char c) {
        List<String> lpad = new ArrayList<>();

        for (Integer number : numbers) {
            lpad.add(String.format("%"+ c + size + "d", number));
        }

        return lpad;
    }

    public static List<Integer> toIntList(List<String> stringList) {
        List<Integer> numbers = new ArrayList<>();

        for (String s : stringList) {
            s = s.replaceFirst("^0+(?!$)", "");
            numbers.add(Integer.parseInt(s));
        }

        return numbers;
    }
}

