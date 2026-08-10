package useful.ch15;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordBook {
    public static void main(String[] args) {
        Map<String, String> words = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        final String WORD_ADD = "1";
        final String SEARCH_WORD = "2";
        final String ALL_PRINT = "3";
        final String END = "4";

        words.put("apple", "사과");
        words.put("banana", "바나나");
        words.put("cherry", "체리");

        while (true){
            System.out.println("\n===영한 단어장===");
            System.out.println("1. 단어 추가 2. 단어 검색. 3. 전체 출력. 4. 종료");
            System.out.println("선택 : ");
            String choice = sc.nextLine();

            if (WORD_ADD.equals(choice)){
                wordAdd(sc, words);
            } else if (SEARCH_WORD.equals(choice)){
                searchWord(sc, words);
            } else if (ALL_PRINT.equals(choice)){
                allPrint(words);
            } else if (END.equals(choice)){
                System.out.println("프로그램을 종료합니다");
                break;
            } else {
                System.out.println("잘못된 입력입니다");
            }
        }

        sc.close();
    }

    private static void allPrint(Map<String, String> words) {
        for (String k : words.keySet()){
            System.out.println(k + " : " + words.get(k));
        }
    }

    private static void searchWord(Scanner sc, Map<String, String> words) {
        System.out.println("찾으시는 단어를 입력해주세요");
        String findWord = sc.nextLine();
        if (words.containsKey(findWord)){
            System.out.println(findWord + "을 검색해서 " +  words.get(findWord) + "를 찾았습니다");
        } else {
            System.out.println("찾으시는 단어가 없습니다");
        }
    }

    private static void wordAdd(Scanner sc, Map<String, String> words) {
        System.out.println("추가할 단어의 영어 단어를 입력해 주세요");
        String wordEng = sc.nextLine();
        System.out.println("추가할 단어의 한글 단어를 입력해 주세요");
        String wordKor = sc.nextLine();
        words.put(wordEng, wordKor);
        System.out.println("단어 " + wordEng + " : " + wordKor + "가 추가 되었습니다");
    }
}
