package section.section08;

public class Practice01 {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.studentName = "김고이";
        stu1.hello();
        System.out.println("학교는 " + Student.schoolName + "입니다.");
        Student.goToSchool();

        Student stu2 = new Student();
        stu2.studentName = "김고삼";
        System.out.println("학교는 " + Student.schoolName + "입니다.");
        Student.goToSchool();

        // 출력
//        안녕하세요, 제 이름은 김고이입니다.
//        학교는 코리아 고등학교입니다.
//        오늘은 학교에 가는 날입니다
//        학교는 코리아 고등학교입니다.
//        오늘은 학교에 가는 날입니다
    }
}
