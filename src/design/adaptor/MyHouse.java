package design.adaptor;

public class MyHouse {

    // 220v 콘센트에 전자기기를 연결하는 메서드를 가지고 있다.
    public static void plugIn(IEectronic220v device) {
    device.connect();
    }

    public static void main(String[] args) {
        Cleaner cleaner = new Cleaner();
        HairDryer hairDryer = new HairDryer();
        ElectronicAdapter adapter = new ElectronicAdapter();

        plugIn(cleaner);
        // plugIn(hairDryer); 규격이 맞지 않아 사용불가 (어댑터 필요)

        adapter.linkedMachine(hairDryer);
        plugIn(adapter); // 220V 어댑터에 헤어드라이기를 작동시킴

    }

}
