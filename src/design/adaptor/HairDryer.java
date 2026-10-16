package design.adaptor;

public class HairDryer implements IEectronic110v{

    @Override
    public void connect() {
        System.out.println("헤어드라이기 연결 (110v)");
    }
}
