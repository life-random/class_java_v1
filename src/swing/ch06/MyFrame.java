package swing.ch06;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

public class MyFrame extends JFrame {
    // jfame 객체 선언
    private JLabel backgroundMap;
    private JLabel player;
    private JLabel enemy;

    // 상수 초기화
    private int moveStep = 10;
    private final int FRAME_WIDTH = 1000;
    private final int FRAME_HEIGHT = 600;
    private final int PLAYER_SIZE = 100;
    private final int ENEMY_SIZE = 100;

    public MyFrame() {
        initData();
        setInitLayout();
        addEventListener();
        enemyMove();
    }

    private void initData() {
        setTitle("이미지 겹칙 설정");
        setSize(FRAME_WIDTH, FRAME_HEIGHT + 40);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 배경 이미지 설정해보기
        ImageIcon backgroundIcon = new ImageIcon("images/backgroundMap.png");
        backgroundMap = new JLabel(backgroundIcon);
        // 배치 관리자 좌표 ==> 컴포넌트 사이즈와 위치를 직접 지정해야 한다.
        backgroundMap.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        backgroundMap.setLocation(0, 0);

        // 플레이어 이미지 초기화
        ImageIcon playerIcon = new ImageIcon("images/playerL.png");
        player = new JLabel(playerIcon);
        player.setSize(PLAYER_SIZE, PLAYER_SIZE);
        player.setLocation(200, 150);

        // 적 이미지 초기화
        ImageIcon enemyIcon = new ImageIcon("images/enemyR.png");
        enemy = new JLabel(enemyIcon);
        enemy.setSize(ENEMY_SIZE, ENEMY_SIZE);
        enemy.setLocation(500, 510);

    }

    private void setInitLayout() {
        // 루트 패널에 설정
        setLayout(null);
        add(backgroundMap);
        backgroundMap.add(player);
        backgroundMap.add(enemy);

        setVisible(true);
        // 왜 사용하는 코드인지는 모르겠음
        setFocusable(true);
        requestFocusInWindow();
    }

    private void checkCollision() {
        // 플레이어 히트 박스
        int px = player.getX();
        int py = player.getY();

        // 적 히트 박스
        int ex = enemy.getX();
        int ey = enemy.getY();
    }

    private void addEventListener() {
        addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                int x = player.getX();
                int y = player.getY();

                // icon 초기화
                ImageIcon playerLeft = new ImageIcon("images/playerL.png");
                ImageIcon playerRight = new ImageIcon("images/playerR.png");

                switch (keyCode) {
                    case KeyEvent.VK_LEFT:  // 화살표 왼쪽
                        player.setIcon(playerLeft);
                        if (x >= 50) x -= moveStep;
                        break;
                    case KeyEvent.VK_UP:    // 화살표 위
                        if (y > 0) y -= moveStep;
                        break;
                    case KeyEvent.VK_RIGHT: // 화살표 오른쪽
                        player.setIcon(playerRight);
                        if (x < 865) x += moveStep;
                        break;
                    case KeyEvent.VK_DOWN:  // 화살표 아래
                        if (y < 510) y += moveStep;
                        break;
                }
                setTitle("이미지 겹칙 설정 : player 현재 좌표 :" + x + ", " + y);
                player.setLocation(x, y);

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
    }

    private void enemyMove() {
        // icon 초기화
        ImageIcon enemyLeft = new ImageIcon("images/enemyL.png");
        ImageIcon enemyRight = new ImageIcon("images/enemyR.png");

        Thread thread = new Thread(() -> {

            int enemySpeed = 2;
            int minX = 50;
            int maxX = 865;

            while (true){
                int x = enemy.getX();
                x += enemySpeed;
                // 만약 적이 오른쪽 맵 끝에 도달했을 때
                if (x >= maxX) {
                    enemySpeed = -2;
                    enemy.setIcon(enemyLeft);
                }

                if (x <= minX){
                    enemySpeed = 2;
                    enemy.setIcon(enemyRight);
                }

                enemy. setLocation(x, enemy.getY());

                try {
                    Thread.sleep(10);
                } catch (InterruptedException e){
                    e.printStackTrace();
                }

            }

        });

        thread.start();
    }

    public static void main(String[] args) {
        new MyFrame();
    }
}
