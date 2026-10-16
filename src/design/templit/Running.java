package design.templit;

public final class Running extends Harve{
    @Override
    public void prepare() {
        System.out.println("신발을 신고, 몸을 풀고 있습니다");
    }

    @Override
    public void doing() {
        System.out.println("산책로를 달리는 중 입니다");
    }

    @Override
    public void end() {
        System.out.println("땀을 식히고, 신발을 벗습니다");
    }
}
