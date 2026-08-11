package useful.ch17;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamDemo6 {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5,3,1,4,2);

        // 오름 차순
        List<Integer> asc = numbers.stream()
                .sorted()
                .toList();

        System.out.println(asc);

        List<Integer> desc = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .toList();

        System.out.println(desc);
    }
}
