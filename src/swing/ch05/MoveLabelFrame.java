package swing.ch05;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MoveLabelFrame extends JFrame {
    private static int count = 0;
    private JLabel label;
    private int moveStep = 5;
    private final int FRAME_WIDTH = 500;
    private final int FRAME_HEIGHT = 500;
    private final int LABEL_SIZE = 50;
    private final int MAX_SPEED = 30;

    public MoveLabelFrame() {
        initData();
        setInitLayout();
        addEventListener();
    }

    private void initData() {
        setTitle("방향킬로 별 움직이기 연습 | 이동횟수 : 0");
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        label = new JLabel("★");
        label.setFont(new Font("맑은 고딕", Font.BOLD, 30));
        label.setSize(LABEL_SIZE, LABEL_SIZE);
        label.setLocation(200, 200);
    }

    private void setInitLayout() {
        setLayout(null); // null -> 좌표 기반
        add(label);
        setVisible(true);
    }

    private void addEventListener() {
        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {}

            @Override
            public void keyPressed(KeyEvent e) {
                label.setText("☆");
                int keyCode = e.getKeyCode();
                int x = label.getX();
                int y = label.getY();

                if (keyCode == KeyEvent.VK_LEFT) {          // 화살표 왼쪽
                    label.setLocation(x - moveStep, y);
                    if (moveStep < MAX_SPEED){
                        moveStep++;
                    }
                    if (x < 0 ){
                        x = FRAME_WIDTH - LABEL_SIZE - 10;
                        label.setLocation(x, y);
                    }
                    count++;
                } else if (keyCode == KeyEvent.VK_UP) {     // 화살표 위
                    label.setLocation(x, y - moveStep);
                    if (moveStep < MAX_SPEED){
                        moveStep++;
                    }
                    if (y < 0 ){
                        y = FRAME_HEIGHT - LABEL_SIZE - 10;
                        label.setLocation(x, y);
                    }
                    count++;
                } else if (keyCode == KeyEvent.VK_RIGHT) {  // 화살표 오른쪽
                    label.setLocation(x + moveStep, y);
                    if (moveStep < MAX_SPEED){
                        moveStep++;
                    }
                    if (x > FRAME_WIDTH ){
                        x = 0;
                        label.setLocation(x, y);
                    }
                    count++;
                } else if (keyCode == KeyEvent.VK_DOWN) {   // 화살표 아래
                    label.setLocation(x, y + moveStep);
                    if (moveStep < MAX_SPEED){
                        moveStep++;
                    }
                    if (y > FRAME_HEIGHT ){
                        y = 0;
                        label.setLocation(x, y);
                    }
                    count++;
                } else if (keyCode == KeyEvent.VK_ESCAPE) {
                    label.setLocation(225, 200);
                    count = 0;
                }
                setTitle("방향킬로 별 움직이기 연습 | 이동횟수 : " + count);
                // System.out.println("키 누름 : " + e.getKeyCode());
            }

            @Override
            public void keyReleased(KeyEvent e) {
                label.setText("★");
                moveStep = 10;
            }
        });
    }
    public static void main(String[] args) {
        new MoveLabelFrame();
    }
}
