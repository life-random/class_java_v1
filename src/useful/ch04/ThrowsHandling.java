package useful.ch04;

public class ThrowsHandling {

    public static void main(String[] args) {

        Calc calc = new Calc();
        try {
            calc.divide(100, 0);
        } catch (Exception e) {
            System.out.println("어떤 수를 0으로 게산 될 수 없음");
        }

    } // end of main
} // end of class

class Calc {

    // 예외처리를 사용하는 사람이 직접 다룰 수 있도록 던질 수 있다. throws (메소드 선언부에서 사용 함)
    // 강제성이 발생됨 (사용하는 측에서 반드시 처리를 해야되는 강제성 생성 됨
    public int divide(int n1, int n2) throws ArrayIndexOutOfBoundsException{
        System.out.println("나누기 동작");
        System.out.println(n1 / n2);
        return n1 / n2;
    }
}