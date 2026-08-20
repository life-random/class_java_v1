package http.ch02;

import java.util.ArrayList;
import java.util.List;

public class JsonMaker {

    public static void main(String[] args) {
        String name = "홍\"길동\"";
        int age = 21;
        List<String> subject = new ArrayList<>();
        subject.add("수학");
        subject.add("물리");
        subject.add("컴퓨터과학");
        subject.add("C:\\java\\workspace");

        // 위 데이터를 메서드을 호출해서 json 형식에 문자열로 변환하는 기능을 호출할 예정
        String jsonStr = toJson(name, age, subject);
        System.out.println(jsonStr);
    }

    // 학생 정보를 JSON 문자열로 조립하는 기능(메서드)
    public static String toJson(String name, int age, List<String> subject){
        StringBuilder sb = new StringBuilder();
        sb.append("{\n");
        sb.append("\"name\" : \"").append(name).append("\",\n");
        sb.append("\"age\" : \"").append(age).append("\",\n");
        sb.append("\"subject\" : [\n");
        for (int i = 0; i < subject.size(); i++) {
            sb.append("\t\t\"").append(subject.get(i)).append("\"");
            if (i != subject.size()-1){
                sb.append(",");
            }
            sb.append("\n");
        }
        sb.append("\t]\n");
        sb.append("}");
        return sb.toString();
    }
}
