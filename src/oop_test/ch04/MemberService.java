package oop_test.ch04;

import java.util.List;

public class MemberService {
    private MemberDAO dao = new MemberDAO();

    public void registerMember(String id, String name){
        dao.insert(new Member(id, name));
    }

    public void printAllMembers(){
        List<Member> members = dao.findAll();
        System.out.println("--- 전체 회원 목록 ---");
        for (Member member : members){
            System.out.println("--- 전체 회원 목록 ---");
            System.out.println("ID : " + member.getId() + ", 이름 : " + member.getName());
        }
    }
}
