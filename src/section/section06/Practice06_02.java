package section.section06;

public class Practice06_02 {
    public static void main(String[] args) {

        char[]  cards = {'1', 'L', 'O', '2', 'V', '3', 'E'};
        String myWord = "";

        for (int i = 0; i < cards.length; i++) {
            int word = cards[i];
            if ((word >= 65 && word <= 90) || (word >= 97 && word <= 122)) {
                myWord += (char)word;
            } // end of if
        } // end of for

        System.out.println("단어 : " + myWord);

    } // end of main

} // end of class
