package useful.ch06;

import java.util.ArrayList;

public class GenericPrinterMain {
    public static void main(String[] args) {
        // 제네릭 프로그래밍을 활용하면 타입에 안정성을 줘서 컴파일 시 명확하게 타입을 지정할 수 있다

        Plastic plastic = new Plastic();
        Powder powder = new Powder();
        // 즉 코드를 사용하는 지점에 대체 문자열에 명확한 타입을 지정할 수 있다.
        GenericPrinter<Plastic> printer = new GenericPrinter();
        printer.setMaterial(plastic);
        System.out.println(printer.getMaterial());
        // 다운 캐스팅이 필요 없다 -> 즉 타입에 안정성을 줄 수 있다
        Plastic tempPlastic = printer.getMaterial();

        // 핵심 - 변수명을 똑같이 사용해야 하는데 데이터 타입이 다양하게 처리 되어야 할 때
        //        제네릭 프로그래밍을 사용하면 아주 많이 이점이 있다.

        // 배열 <-- 컬렉션 프레임워크 (자료구조) --> 객체 배열 ArrayList 데이터 타입이 있음(제네릭 활용)
        ArrayList<Integer> list = new ArrayList(); // [1][2][3][4] -> [4.0] x
        list.add(10);
        list.add(11);
        // list.add(10.0) 오류발생

    } // end of main
} // end of class
