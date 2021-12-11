package com.yiroc;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Music {
    //空参构造
    public Music() throws FileNotFoundException, JavaLayerException {
        Player player;
        String str = "C:\\learn\\java\\ClassProject\\SuperMario\\src\\com\\yiroc\\music\\music.wav";
        BufferedInputStream name =new BufferedInputStream(new FileInputStream(str));
        player = new Player(name);
        player.play();
    }
}
