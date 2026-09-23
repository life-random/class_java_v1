package oop_test.ch07;

public class Main {
    public static void main(String[] args) {
        MusicDao dao = new MusicDao();
        MusicService service = new MusicService(dao);

        service.addMusic("bounce", "조용필");
        service.addMusic("조용필처럼", "팬텀");
        service.addMusic("인연", "이선희");

        service.printPlaylist();
    }
}
