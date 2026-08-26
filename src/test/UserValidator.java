package test;

public class UserValidator {
    public static final int SUCCESS = 0;
    public static final int LENGTH_ERROR = 1;
    public static final int FORMAT_ERROR = 2;

    public static int validateId(String id) {

        if (id.length() < 5 || id.length() > 20) {
            return LENGTH_ERROR;
        }

        if (!id.matches("^[a-zA-Z0-9]+$")) {
            return FORMAT_ERROR;
        }

        return SUCCESS;
    }

    public static int validatePassword(String password) {

        if (password.length() < 8 || password.length() > 30) {
            return LENGTH_ERROR;
        }

        if (!password.matches("^[a-zA-Z0-9]+$")) {
            return FORMAT_ERROR;
        }

        return SUCCESS;
    }
}
