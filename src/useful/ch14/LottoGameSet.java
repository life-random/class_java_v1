package useful.ch14;

import java.util.*;

public class LottoGameSet {
    public static void main(String[] args) {
        Set<Integer> lotto = new HashSet<>();
        Random random = new Random();
        int count = 0;

        while(lotto.size() < 6) {
            Integer num = random.nextInt(45) + 1;
            lotto.add(num);
            count++;
        }

        System.out.println("이번 주 로또 번호 : " + lotto);
        System.out.println("while 문 반복 횟수 : " + count);

        // ArrayList 생성자 안에 Set 계열을 넣어서 List 계열을 생성할 수 있습니다
        List<Integer> sortedLotto = new ArrayList<>(lotto);
        System.out.println(sortedLotto);
        System.out.println("----------------------------");

        // 오름 차순 정렬(sortedLotto)
        Collections.sort(sortedLotto);
        System.out.println("오름 차순 된 로또 번호 : " + sortedLotto);

        // 도전 과제 - 내림차순으로 정렬하는 코드를 작성하시오
        sortedLotto.sort(Comparator.reverseOrder());
        System.out.println("오름 차순 된 로또 번호 : " + sortedLotto);
    }
}
