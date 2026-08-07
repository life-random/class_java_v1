package swing.ch02;

import javax.swing.*;

public class PracticeComponent extends JFrame {

    private JButton button1;

    public PracticeComponent(){

    }

    private void component(){
        setTitle("혼자 연습");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void initData(){
        button1 = new JButton("연습 중");
    }

    private void setInitLayout(){
//        setLayout();
    }

    public final void run(){
        initData();
        setInitLayout();
    }

}
