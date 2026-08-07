package swing.ch01;

import javax.swing.*;
import java.awt.*;

public class MyBoarderFrame extends JFrame {

    // 문제 1번 배열 활용
    private JButton[] buttons;

    BorderLayout borderLayout;
    String[] borderLayoutArr = {borderLayout.NORTH, borderLayout.SOUTH, borderLayout.CENTER, borderLayout.EAST, borderLayout.WEST};

    public MyBoarderFrame() {

        setTitle("boarderLayout 연습");
        setSize(600, 400);
        setVisible(true);
        // x누르면 동시에 프로그램도 종료 설정
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        initData();
        setInitLayout();
    }

    public void initData() {

        buttons = new JButton[5];

        for (int i = 0; i < 5; i++) {
            buttons[i] = new JButton( "버튼" + ( i + 1) );
        }
        borderLayout = new BorderLayout();
    }


    public void setInitLayout() {
        // 배치 관리자 선정을 하고 Frame 설정해 보자
        setLayout(borderLayout); // Frame에 배치관리자 설정
        // border Layout은 add를 할 때 어디에 붙을 지 명시해주어야 한다

        for (int i = 0; i < 5; i++) {
            add(buttons[i], borderLayoutArr[i%5]);
        }

        // 배열 활용
//        add(button1, borderLayout.NORTH);
//        add(button2, borderLayout.SOUTH);
//        add(button3, borderLayout.CENTER);
//        add(button4, borderLayout.EAST);
//        add(button5, borderLayout.WEST);
    }
}
