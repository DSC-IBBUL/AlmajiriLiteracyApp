package com.ayomi.almajiriliteracyapp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.io.IOException;

public class LearningActivity extends AppCompatActivity {

    private Toolbar toolbar;
    TextView textViewA, textViewB, textViewC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learning);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowCustomEnabled(true);

        textViewA = findViewById(R.id.txtAplphabetA);
        textViewB = findViewById(R.id.txtAplphabetB);
        textViewC = findViewById(R.id.txtAplphabetC);

        /*Intent b = getIntent();
        String receivingdata = b.getStringExtra("Key");
        TextView tv = (TextView)findViewById(R.id.txtAplphabet);
        tv.setText(receivingdata)*/;

//        String s = getIntent().getStringExtra("TextValue");
//        String b = getIntent().getStringExtra("TextValueB");
//        textView.setText(s);
//        textView.setText(b);

        Intent intent = getIntent();
        final String A = intent.getStringExtra("A");
        final String B = intent.getStringExtra("B");
        final String C = intent.getStringExtra("C");
//        final  String imagee = intent.getStringExtra("image");
//        Picasso.get().load(imagee).into(userProfileImage);

        textViewA.setText(A);
//        textViewB.setText(B);
//        textViewC.setText(C);
//        userProfileStatus.setText(link);
    }

    void PlayAudio(String s)
    {
        MediaPlayer mediaPlayer = new MediaPlayer();
        AssetFileDescriptor afd;
        try {
            afd = getAssets().openFd("sounds/a.mp3");
            mediaPlayer.setDataSource(afd.getFileDescriptor());
            mediaPlayer.prepare();
            mediaPlayer.start();
//            Toast.makeText(LearningActivity.this, "Playing audio from Asset directory",  Toast.LENGTH_SHORT).show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void PlayLetter(View view) {
        PlayAudio("a.mp3");
    }
}