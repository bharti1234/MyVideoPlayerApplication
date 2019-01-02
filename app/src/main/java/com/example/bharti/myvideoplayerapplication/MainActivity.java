package com.example.bharti.myvideoplayerapplication;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends Activity {
    VideoView video;
    public static final String url = "https://archive.org/download/ksnn_compilation_master_the_internet/ksnn_compilation_master_the_internet_512kb.mp4";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        video = (VideoView)findViewById(R.id.videoView1);

        Uri uri = Uri.parse(url);
        video.setMediaController(new MediaController(this));
        video.setVideoURI(uri);
        video.start();
        video.requestFocus();

    }

}
