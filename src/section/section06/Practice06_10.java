package section.section06;

public class Practice06_10 {
    public static void main(String[] args) {

        int[] score = {90, 92, 93};

        int sum = 0;
        double avg = 0;

        for( int val : score){
            sum += val;
        }

        avg = (double) sum / 3;
        System.out.printf("총점 : %d, 평균 : %f", sum, avg);

    } // end of main
} // end of class
