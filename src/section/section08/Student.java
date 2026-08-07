package section.section08;

public class Student {
    static String schoolName = "코리아 고등학교";
    String studentName;

    static void goToSchool() {
        System.out.println("오늘은 학교에 가는 날입니다");
    }

    void hello () {
        System.out.println("안녕하세요, 제 이름은 " + studentName + "입니다.");
    }
}
