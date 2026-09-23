package oop_test.ch04;

public class Main {
    public static void main(String[] args) {
        MemberService service = new MemberService();
        service.registerMember("user01", "티모");
        service.registerMember("user02", "야스오");

        // 전체 회원 목록 확인
        service.printAllMembers();

    } // end of main
}
