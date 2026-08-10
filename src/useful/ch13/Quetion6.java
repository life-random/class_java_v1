package useful.ch13;

import java.util.ArrayList;
import java.util.List;

public class Quetion6 {
    public static void main(String[] args) {
        // 배열 버전
        String[] users = new String[3];
        int count = 0;
        users[count++] = "철수";
        users[count++] = "영희";
        users[count++] = "민준";

        // ArrayList 버전으로 작성하세요.
        ArrayList<String> usersArrayList = new ArrayList<>(List.of(users));
        System.out.println(usersArrayList);

    }
}
