package useful.ch17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Chellenge1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // 도전과제 1 - Stream API를 사용하지 않고 만들어 보기
        List<Integer> result = new ArrayList<>();
        for (int n : numbers){
            if (n % 2 == 0)
                result.add(n*n);
        }

//        List<Integer> result = numbers.stream().filter( n -> n % 2 == 0)
//                .map(n -> n * n)
//                .toList();
//
        System.out.println(result);
    }
}
