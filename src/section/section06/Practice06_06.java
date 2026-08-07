package section.section06;

import java.util.Arrays;

public class Practice06_06 {
    public static void main(String[] args) {

        int[] card = {3, 1, 4, 5, 10};

        // 배열의 깊은 복사 - Arrays.copyOf(배열, 복사 범위)
        int [] newCard = Arrays.copyOf(card, card.length);
        System.out.println("card 배열 : " + Arrays.toString(card));

        // 원본 배열 변경 후 배열 비교
        card[1] = 10;
        System.out.println("card 배열 : " + Arrays.toString(card));
        System.out.println("card 배열 : " + Arrays.toString(newCard));

    } // end of main
} // end of class
