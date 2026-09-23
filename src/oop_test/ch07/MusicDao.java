package oop_test.ch07;

import java.util.ArrayList;
import java.util.List;

public class MusicDao {
    List<Music> playList = new ArrayList<>();

    public void insert(Music music){
        playList.add(music);
        System.out.println( music.getTitle() + " 이(가) 플레이리스트에 추가되었습니다");
    }

    public List<Music> findAll() { System.out.println("----- 플레이 리스트 -----");

        return playList;
    }
}
