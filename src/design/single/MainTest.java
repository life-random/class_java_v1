package design.single;

public class MainTest {

    public static void main(String[] args) {
        // A.java
        SingleTon singleTonA = SingleTon.getInstance();
        UserService userServiceA = UserService.getInstance();

        // B.java
        SingleTon singleTonB = SingleTon.getInstance();
        UserService userServiceB = UserService.getInstance();

        // C.java
        SingleTon singleTonC = SingleTon.getInstance();
        UserService userServiceC = UserService.getInstance();

        System.out.println("singleTonA : " + singleTonA);
        System.out.println("singleTonB : " + singleTonB);
        System.out.println("singleTonC : " + singleTonC);
        System.out.println("userServiceA : " + userServiceA);
        System.out.println("userServiceB : " + userServiceB);
        System.out.println("userServiceC : " + userServiceC);

        System.out.println("singleTonA : " + System.identityHashCode(singleTonA));
        System.out.println("singleTonB : " + System.identityHashCode(singleTonB));
        System.out.println("singleTonC : " + System.identityHashCode(singleTonC));
        System.out.println("userServiceA : " + System.identityHashCode(userServiceA));
        System.out.println("userServiceB : " + System.identityHashCode(userServiceB));
        System.out.println("userServiceC : " + System.identityHashCode(userServiceC));

    }
}
