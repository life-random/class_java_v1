package swing.ch03;

import javax.swing.*;
import java.awt.*;

public class SwingFrame extends JFrame {
    private DrawPanel drawPanel;

    // 중첩 클래스 활용
    public SwingFrame() {
        setTitle("집그리기");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        drawPanel = new DrawPanel();
        add(drawPanel);
        setVisible(true);
    }

    static class DrawPanel extends JPanel {

        @Override
        public void paint(Graphics g) {
            super.paint(g);

            // 사각형 그리기
            g.drawLine(300, 300, 500, 300);
            g.drawLine(300, 300, 300, 200);
            g.drawLine(300, 200, 500, 200);
            g.drawLine(500, 200, 500, 300);

            // 지붕 그리기
            g.drawLine(250, 250, 400, 100);
            g.drawLine(550, 250, 400, 100);

            // 창문 외곽선 (X좌표 +50)
            g.drawLine(425, 275, 475, 275);
            g.drawLine(425, 225, 475, 225);
            g.drawLine(425, 225, 425, 275);
            g.drawLine(475, 275, 475, 225);

            // 창문 그리기 (내부 틀, X좌표 +50)
            g.drawLine(425, 250, 475, 250);
            g.drawLine(450, 225, 450, 275);

            //문
            g.drawLine(350, 300, 350, 225);
            g.drawLine(400, 300, 400, 225);
            g.drawLine(350, 225, 400, 225);

        }
    }

    public static void main(String[] args) {
        new SwingFrame();
    }
}
