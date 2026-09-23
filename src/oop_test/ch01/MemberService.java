package oop_test.ch01;

public class MemberService {
    private MemberDAO dao = new MemberDAO();

    public void registerMember(String id, String name){
        dao.insert(new Member(id, name));
    }
}
