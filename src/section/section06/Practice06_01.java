package section.section06;

public class Practice06_01 {
    public static void main(String[] args) {

        int num = (int)(Math.random() * 100) + 1;

        for (int i = 0; i < num; i++) {

            String strNum = String.valueOf(i);
            if (strNum.contains("3")||strNum.contains("6")||strNum.contains("9")){
                System.out.println("짝!");
                continue;
            }
            System.out.println(i);
        }

    } // end of main

} // end of class