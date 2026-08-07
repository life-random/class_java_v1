package com.oop10;

import java.util.Random;

public class LottoNumberMaker {

    // static 변수를 활용
    // 난수 생성기 하나만 만들어서 계속 재사용해보자
    private static Random random = new Random();

    // static 메서드 - 1 부터 45까지 사이의 번호를 하나 만들어서 반환한다
    public static int makeNumber(){
        // 0 ~ 44 -> + 1 ex) 0 + 1 --> 1, 44 + 1 = 45
        return random.nextInt(45) + 1;
    }

}
