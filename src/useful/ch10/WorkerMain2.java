package useful.ch10;

public class WorkerMain2 {

    // 메인 쓰레드
    public static void main(String[] args) {

        System.out.println("--- main 쓰레드 시작---");

        Worker2 worker2 = new Worker2();
        // tip 쓰레들르 동작 시킬려면 무조건 Thread의 start(); 호출해야 한다.
        // worker2.start)_; <--- start() 없는 상태

        // Thread t = new Thread(worker2);
        //t.start
        new Thread(worker2).start();

        System.out.println("--- main 쓰레드 종료---");
    } // end of main
}
