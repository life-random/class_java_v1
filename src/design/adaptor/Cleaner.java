package design.adaptor;

public class Cleaner implements IEectronic220v {
    @Override
    public void connect() {
        System.out.println("청소기 연결 됨 (220v)");
    }
}
