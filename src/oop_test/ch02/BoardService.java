package oop_test.ch02;

public class BoardService {
    BoardDao dao = new BoardDao();

    public void writePost(String title, String content){
        dao.insertPost(new Board(title, content));
    }
}
