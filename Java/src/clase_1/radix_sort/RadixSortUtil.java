package clase_1.radix_sort;

import com.sun.tools.javac.util.StringUtils;

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

    public static List<String> toStringListLpadList(List<Integer> numbers, int size, char c) {
        List<String> lpad = new ArrayList<>();

        for (Integer number : numbers) {
            lpad.add(String.format("%"+ c + size + "d", number));
        }

        return lpad;
    }

    public static List<String> toStringListRpadList(List<Integer> numbers, int size, char c) {
        List<String> rpad = new ArrayList<>();

        for (Integer number : numbers) {
            rpad.add(String.format("%-" + size + "s", number).replace(' ', '0'));
        }

        return rpad;
    }

    public static String trim(String toTrimString) {
        return toTrimString.trim();
    }

    public static String ltrim(String toTrimString) {
        final String regex = "^\\s+";
        return toTrimString.replaceAll(regex, "");
    }

    public static String rtrim(String toTrimString) {
        final String regex = "^\\s++$";
        return toTrimString.replaceAll(regex, "");
    }

    public static int indexOfN(String s, char c, int n) {
        int occurrence = 0;
        int index = -1;

        for (int i = 0; i < s.length(); i ++) {
            if (s.charAt(i) == c) {
                occurrence ++;
                if (occurrence == n) {
                    return i;
                }
            }
        }

        return index;
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

