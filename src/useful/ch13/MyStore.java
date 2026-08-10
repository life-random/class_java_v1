package useful.ch13;

import java.util.ArrayList;
import java.util.List;

public class MyStore {

    public static void main(String[] args) {

        // 방법 1 : ArrayList 타입을 선언
        ArrayList<String> list1 = new ArrayList<>();

        // 방법2 : List 타입으로 선언
        List<String> list2 = new ArrayList<>();

        // 추가
        list1.add("사과"); // 요소 -> 바로 뒤 -> 맨 끝에 추가, 0번째 인덱스
        list1.add(1, "포도");

        // 조회
        list1.get(0);
        list1.size(); // 실제 안에 들어간 요소의 갯수
        list1.contains("사과"); // 포함 여부 -> true / false
        list1.indexOf("사과"); // 위치 반환, 없으면 -1 반환

        // 삭제
        list1.remove("사과"); // 값으로 삭제 방법
        list1.remove(0);  // 인덱스로도 삭제 가능
        list1.clear(); // 전체 삭제

        // 확인
        list1.isEmpty(); // 비어있는지 여부 확인 true / false

        System.out.println("----------------------");

        // list2 사용해서 제공해주는 메서드를 직접 작성하고 결과를출력하시오
        list2.add("사자");
        list2.add("양");
        list2.add("곰");
        list2.add("사슴");
        list2.add(0, "호랑이");

        System.out.println(list2.contains("사자")); // 0번 자리에 있던 사자가 사라지지 않고 뒤로 밀려남
        System.out.println(list2.indexOf("사자"));

        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i));
        }

        System.out.println("-------------------------");
        list2.remove(list2.size()-1);

        System.out.println(list2); // toString 이 오버라이딩 되어 있어 안에 있는 요소를 바로 확인할 수 있다

        list2.clear();

        System.out.println("리스트는 비어있나요? " + list2.isEmpty());

    } // end of main
} // end of class
