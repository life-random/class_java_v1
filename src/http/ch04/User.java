package http.ch04;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private int id;
    private String name;
    private String username;
    private String email;
    Address address = new Address();
    private String phone;
    private String website;
    Company company = new Company();

    // 종속된 innel class인 경우 클래스 파일을 여러 개를 만드는 것 보다
    // 하나의 파일에 모아두는 것이 정리하는 측면에서 좋다
    @Data
    public static class Address{
        private String street;
        private String suite;
        private String city;
        private String zipcode;
        static class geo{
            String lat;
            String lng;
        }
    }

    @Data
    public static class Company{
        private String name;
        private String catchPhrase;
        private String bs;
    }


}
