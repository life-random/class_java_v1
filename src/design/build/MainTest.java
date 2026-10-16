package design.build;

public class MainTest {

    public static void main(String[] args) {
        Burger hamburger = new Burger.Builder()
                .bread("참깨빵")
                .patty("순쇠고기 패티 두장")
                .sauce("특별한 소스")
                .build();

        System.out.println(hamburger);
        
        // 순서를 바꿔도 되고, 원하는 것만 넣어도 된다(넣지 않은 값은 null)
        Burger burger = new Burger.Builder()
                .patty("치킨")
                .bread("호밀빵")
                .build();

        System.out.println(burger);

        Person person1 = new Person.Builder()
                .name("홍길동")
                .age(20)
                .gender("남성")
                .nationality("대한민국")
                .build();

        System.out.println(person1);
    }
}
