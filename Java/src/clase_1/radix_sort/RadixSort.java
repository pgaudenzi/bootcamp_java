package clase_1.radix_sort;

import java.util.*;

import static clase_1.radix_sort.RadixSortUtil.*;

public class RadixSort {

    public void radixSort(int[] intArray, String base) {

        //Get max length
        final List<Integer> numbers = convertToList(intArray);
        final int max = getMaxLength(numbers);

        //Convert int to string list
        List<String> stringList = toStringListLpadList(numbers, max, '0');

        //Sort
        sort(stringList, max, base);

        //Convert string to int list
        System.out.println(toIntList(stringList));
    }

    private void sort(List<String> stringList, int max, String base) {
        Map<Character, List<String>> auxMap = new HashMap<>();
        List<String> auxList = new ArrayList<>();
        Character key;
        for (int i = max - 1; i >= 0; i--) {

            auxMap.clear();
            auxList.clear();

            for (String string: stringList) {
                key = string.charAt(i);
                // If the key is not in the map yet, create the list.
                if (!auxMap.containsKey(key)) {
                    auxMap.put(key, new ArrayList<>());
                }
                // Add the string into the corresponding list
                auxMap.get(key).add(string);

            }

            //Sort the elements according to the base
            for (int j = 0; j < base.length(); j++) {
                if (auxMap.containsKey(base.charAt(j))) {
                    auxList.addAll(auxMap.get(base.charAt(j)));
                }
            }

            //Replace stringList's values
            stringList.clear();
            stringList.addAll(auxList);
        }
    }
}
