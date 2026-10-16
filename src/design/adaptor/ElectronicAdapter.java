package design.adaptor;

// 핵심 (adapter 클래스)
// 110V를 받아서 22V가 나가도록 어떻게 설계해야할까?
public class ElectronicAdapter implements IEectronic220v {

    private IEectronic110v machine;

    public void linkedMachine(IEectronic110v machine){
        this.machine = machine;
    };

    @Override
    public void connect() {
        machine.connect();
    }
}
