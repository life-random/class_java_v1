package useful.ch04;

public class DivideByZeroException extends RuntimeException{

    private String msg;

    public DivideByZeroException(String msg) {
        super(msg); // RuntimeException 생성자에 무리 작성한 메세지 넣을 수 있도록 설계 e.getMessage() <---
        this.msg = msg;
    }
}
