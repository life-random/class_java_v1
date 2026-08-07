package useful.ch03;

public class StringTestBlock {
    public static void main(String[] args) {
        String string = "가나다라마바사\n" +
                "아자차카타파하\n" +
                "\tABCDEFG";

        System.out.println(string);

        String textBlock = """
                가나다라마바사아자차카타파하
                    ABCDEFG
                """;
        System.out.println(textBlock);
    }
}
