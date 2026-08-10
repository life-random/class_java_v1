package useful.ch14;

public class HashTableTest {
    public static void main(String[] args) {

        String[] names = {"사과", "바나나", "포도", "딸기", "수확"};
        for (String n : names){
            System.out.println(n + " -> " + n.hashCode());
        }
        System.out.println("---------------------");
        System.out.println("사과".hashCode()); // 사과 -> 1573328
    }
}
