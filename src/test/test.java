package test;

public class test {
    public static void main(String[] args) {

        String id = "abcaaa_!@$@$(";
        String password = "12345678";

        int idResult = UserValidator.validateId(id);
        int pwResult = UserValidator.validatePassword(password);

        System.out.println(idResult);
        System.out.println(pwResult);
    }
}
