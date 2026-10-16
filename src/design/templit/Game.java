package design.templit;

public final class Game extends Harve {
    @Override
    public void prepare() {
        System.out.println("컴퓨터를 켜고, 게임을 실행합니다");
    }

    @Override
    public void doing() {
        System.out.println("게임을 진행 중 입니다");
    }

    @Override
    public void end() {
        System.out.println("게임을 종료하고, 컴퓨터를 종료합니다");
    }
}
