package swing.ch05;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyEventListenerFrame extends JFrame {
    private final int FREAM_SIZE = 500;
    private JTextArea textArea;

    public KeyEventListenerFrame(){
        ititData();
        setInitLayout();
        addEventListener();
    }

    private void ititData() {
        setSize(FREAM_SIZE, FREAM_SIZE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setResizable(false);  //사용자 마우스로 크기를 조정 못 하게 막음

        textArea = new JTextArea();
        setVisible(true);
    }

    private void setInitLayout() {
        add(textArea);

    }

    private void addEventListener() {
        // 이벤트 리스너 등록 - 익명 내부 클래스로 처리
        textArea.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                // 도전 - 이벤트를 받아서 위 쪽 화살표면 위쪽 화살표 출력
                if (e.getKeyCode() == KeyEvent.VK_LEFT){
                    // textArea.setText("⬅️");
                    textArea.append("⬅\n️");
                } else if (e.getKeyCode() == KeyEvent.VK_UP){
                    // textArea.setText("⬆");
                    textArea.append("⬆\n");
                } else if (e.getKeyCode() == KeyEvent.VK_RIGHT){
                    // textArea.setText("➡️");
                    textArea.append("➡\n");
                } else if (e.getKeyCode() == KeyEvent.VK_DOWN){
                    // textArea.setText("⬇️");
                    textArea.append("⬇\n");
                }
                System.out.println("키 누름 : " + e.getKeyCode());
            }

            @Override
            public void keyReleased(KeyEvent e) {
//                System.out.println("keyReleased 발생 : " + e.getKeyCode());
            }
        });
    }

    public static void main(String[] args) {
        new KeyEventListenerFrame();
    }
}
