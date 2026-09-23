package oop_test.ch07;

import java.util.ArrayList;
import java.util.List;

public class MusicService {
    private MusicDao dao;

    public MusicService(MusicDao dao) {
        this.dao = dao;
    }

    public void addMusic(String title, String artist){
        dao.insert(new Music(title, artist));
    }

    public void printPlaylist() {
        List<Music> playList = dao.findAll();

        for (Music music : playList) {
            System.out.println(music.getTitle() + "[" + music.getArtist() + "]");
        }
    }
}