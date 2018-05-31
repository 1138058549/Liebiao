package com.example.yuekao_01;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.yuekao_01.music.GramophoneView;

import java.io.IOException;

public class ListActivity extends AppCompatActivity {

    private MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        final GramophoneView gramophoneView = (GramophoneView)findViewById(R.id.gramophone_view);
        final Button button = (Button)findViewById(R.id.btn_play_pause);
        player = new MediaPlayer();
        try {
            player.setDataSource("http://sc1.111ttt.cn:8282/2018/1/03m/13/396131229550.m4a?tflag=1519095601&pin=6cd414115fdb9a950d827487b16b5f97#.mp3");
            player.prepare();
            player.setLooping(true);
        } catch (IOException e) {
            e.printStackTrace();
        }
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(gramophoneView.getPlaying()){
                    player.stop();
                    button.setText("点击播放");

                }else{
                    player.start();
                    button.setText("点击暂停");

                }
                gramophoneView.setPlaying(!gramophoneView.getPlaying());
            }
        });
    }
}
