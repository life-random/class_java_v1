package section.section06;

import java.util.Arrays;

public class Practice06_07 {
    public static void main(String[] args) {

        int[] card = {1, 6, 4, 5, 4, 2};
        int[] newCard = new int[card.length];

        // 배열의 깊은 복사 - Arrays.copyOf(복사 대상 배열, 복사 시작 위치, 카피할 배열, 시작 위치, 복사할 길이)
        System.arraycopy(card, 0, newCard, 0, card.length);

        System.out.println("card 배열 : " + Arrays.toString(card));
        System.out.println("card 배열 : " + Arrays.toString(newCard));

    } // end of main
} // end of class
