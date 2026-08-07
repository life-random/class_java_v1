package swing.ch01;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    static JButton[] buttons = new JButton[10];

    // 문제1. JButton 객체의 JFrame 객체에 하나더 올려 보자.
    // 문제2. 배열을 활용해서 코드를 수정해주세요.

    public MyFrame(JButton[] button){
        super.setTitle("배치 관리자 연습");
        super.setSize(600, 300);
        super.setVisible(true);

        initData(button);
        setInitLayout(button);
    }

    public void initData(JButton[] buttons){

        for (int i = 0; i < 3; i++) {
            buttons[i] = new JButton(("button" + (i + 1) ) );
        }
//        buttons[0] = new JButton("button1");
//        buttons[1] = new JButton("button2");
//        buttons[2] = new JButton("button3");
    }

    public void setInitLayout(JButton[] button){
        // 배치 관리자 선언
        FlowLayout flowLayout = new FlowLayout();
        // 컴포넌트들을 수평, 수직으로 프레임 배치해 주는 녀석이다
        super.setLayout(flowLayout);

        for (int i = 0; i < 3; i++) {
            add(button[i]);
        }

//        super.add(button[0]);
//        super.add(button[1]);
//        super.add(button[2]);
    }

    // 테스트 코드 작성
    public static void main(String[] args) {
        MyFrame frame1 = new MyFrame(buttons);
    } // end of main
} // end of class
