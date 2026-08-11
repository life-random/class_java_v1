package useful.ch16;

public class Demo6 {
    public static void main(String[] args) {
        MaxMin max = (int x, int y) -> { return (x > y) ? x : y ;};
        MaxMin min = (int x, int y) -> { return (x < y) ? x : y ;};

        System.out.println("max : " + max.num(10, 15));
        System.out.println("max : " + max.num(20, 15));
        System.out.println("min : " + min.num(10, 15));
        System.out.println("min : " + min.num(20, 15));
    }
}
