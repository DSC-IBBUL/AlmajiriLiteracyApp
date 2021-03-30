package com.ayomi.almajiriliteracyapp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.io.IOException;

public class LearningActivity extends AppCompatActivity {

    private Toolbar toolbar;
    TextView textViewA,
            textViewB,
            textViewC,
            textViewD,
            textViewE,
            textViewF,
            textViewG,
            textViewH,
            textViewI,
            textViewJ,
            textViewK,
            textViewL,
            textViewM,
            textViewN,
            textViewO,
            textViewP,
            textViewQ,
            textViewR,
            textViewS,
            textViewT,
            textViewU,
            textViewV,
            textViewW,
            textViewX,
            textViewY,
            textViewZ;
    String value;

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
        textViewD = findViewById(R.id.txtAplphabetD);
        textViewE = findViewById(R.id.txtAplphabetE);
        textViewF = findViewById(R.id.txtAplphabetF);
        textViewG = findViewById(R.id.txtAplphabetG);
        textViewH = findViewById(R.id.txtAplphabetH);
        textViewI = findViewById(R.id.txtAplphabetI);
        textViewJ = findViewById(R.id.txtAplphabetJ);
        textViewK = findViewById(R.id.txtAplphabetK);
        textViewL = findViewById(R.id.txtAplphabetL);
        textViewM = findViewById(R.id.txtAplphabetM);
        textViewN = findViewById(R.id.txtAplphabetN);
        textViewO = findViewById(R.id.txtAplphabetO);
        textViewP = findViewById(R.id.txtAplphabetP);
        textViewQ = findViewById(R.id.txtAplphabetQ);
        textViewR = findViewById(R.id.txtAplphabetR);
        textViewS = findViewById(R.id.txtAplphabetS);
        textViewT = findViewById(R.id.txtAplphabetT);
        textViewU = findViewById(R.id.txtAplphabetU);
        textViewV = findViewById(R.id.txtAplphabetV);
        textViewW = findViewById(R.id.txtAplphabetW);
        textViewX = findViewById(R.id.txtAplphabetX);
        textViewY = findViewById(R.id.txtAplphabetY);
        textViewZ = findViewById(R.id.txtAplphabetZ);

        /*Intent b = getIntent();
        String receivingdata = b.getStringExtra("Key");
        TextView tv = (TextView)findViewById(R.id.txtAplphabet);
        tv.setText(receivingdata)*/;

//        String s = getIntent().getStringExtra("TextValue");
//        String b = getIntent().getStringExtra("TextValueB");
//        textView.setText(s);
//        textView.setText(b);

        Intent intent = getIntent();
        final String layoutetterA = intent.getStringExtra("a");
//        final String B = intent.getStringExtra("B");
//        final String C = intent.getStringExtra("C");

        if (intent.getExtras() != null) {

//            intent.getExtras().getString("A");
             value = intent.getExtras().getString("letter");
//            String valueB = intent.getExtras().getString("B");
//            String valueC = intent.getExtras().getString("C");
//            String valueD = intent.getExtras().getString("D");
//            String valueE = intent.getExtras().getString("E");
//            String valueF = intent.getExtras().getString("F");
//            String valueG = intent.getExtras().getString("G");
//            String valueH = intent.getExtras().getString("H");
//            String valueI = intent.getExtras().getString("I");
//            String valueJ = intent.getExtras().getString("J");
//            String valueK = intent.getExtras().getString("K");
//            String valueL = intent.getExtras().getString("L");
//            String valueM = intent.getExtras().getString("M");
//            String valueN = intent.getExtras().getString("N");
//            String valueO = intent.getExtras().getString("O");
//            String valueP = intent.getExtras().getString("P");
//            String valueQ = intent.getExtras().getString("Q");
//            String valueR = intent.getExtras().getString("R");
//            String valueS = intent.getExtras().getString("S");
//            String valueT = intent.getExtras().getString("T");
//            String valueU = intent.getExtras().getString("U");
//            String valueV = intent.getExtras().getString("V");
//            String valueW = intent.getExtras().getString("W");
//            String valueX = intent.getExtras().getString("X");
//            String valueY = intent.getExtras().getString("Y");
//            String valueZ = intent.getExtras().getString("Z");
            textViewA.setText(value);
//            textViewB.setText(valueB);
//            textViewC.setText(valueC);
//            textViewD.setText(valueD);
//            textViewE.setText(valueE);
//            textViewF.setText(valueF);
//            textViewG.setText(valueG);
//            textViewH.setText(valueH);
//            textViewI.setText(valueI);
//            textViewJ.setText(valueJ);
//            textViewK.setText(valueK);
//            textViewL.setText(valueL);
//            textViewM.setText(valueM);
//            textViewN.setText(valueN);
//            textViewO.setText(valueO);
//            textViewP.setText(valueP);
//            textViewQ.setText(valueQ);
//            textViewR.setText(valueR);
//            textViewS.setText(valueS);
//            textViewT.setText(valueT);
//            textViewU.setText(valueU);
//            textViewV.setText(valueV);
//            textViewW.setText(valueW);
//            textViewX.setText(valueX);
//            textViewY.setText(valueY);
//            textViewZ.setText(valueZ);

        }





//        textViewB.setText(B);
//        textViewC.setText(C);
//        userProfileStatus.setText(link);
    }

    void PlayAudio(String fileName)
    {
        MediaPlayer mediaPlayer = new MediaPlayer();
        AssetFileDescriptor afd;
        try {
            afd = getAssets().openFd("sounds/"+fileName+".mp3");
            mediaPlayer.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
            mediaPlayer.prepare();
            mediaPlayer.start();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void PlayLetter(View view) {
        String letter = value.substring(1);
        PlayAudio(letter);
    }
}