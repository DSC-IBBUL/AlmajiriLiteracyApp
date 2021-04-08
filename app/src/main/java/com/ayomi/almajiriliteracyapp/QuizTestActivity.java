package com.ayomi.almajiriliteracyapp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

import java.io.IOException;

public class QuizTestActivity extends AppCompatActivity {

    private Toolbar toolbar;

    int gradeCount;
    RadioButton question1Correct;
    RadioButton question1Wrong;
    RadioButton question1Wrong2;
    RadioButton question2Correct;
    RadioButton question2Wrong;
    RadioButton question2Wrong2;
    RadioButton question3Correct;
    RadioButton question3Wrong;
    RadioButton question3Wrong2;
    RadioButton question4Correct;
    RadioButton question4Wrong;
    RadioButton question4Wrong2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_test);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowCustomEnabled(true);

        question1Correct = findViewById(R.id.question1_true_answer);
        question1Wrong = findViewById(R.id.question1_false_answer);
        question1Wrong2 = findViewById(R.id.question1_false_answer2);
        question2Correct = findViewById(R.id.question2_true_answer);
        question2Wrong = findViewById(R.id.question2_false_answer);
        question2Wrong2 = findViewById(R.id.question2_false_answer2);
        question3Correct = findViewById(R.id.question3_true_answer);
        question3Wrong = findViewById(R.id.question3_false_answer);
        question3Wrong2 = findViewById(R.id.question3_false_answer2);
        question4Correct = findViewById(R.id.question4_true_answer);
        question4Wrong = findViewById(R.id.question4_false_answer);
        question4Wrong2 = findViewById(R.id.question4_false_answer2);
    }

    private String checkAnswers(boolean question1Correct, boolean question1Wrong,boolean question1Wrong2,
                                boolean question2Correct, boolean question2Wrong,boolean question2Wrong2,
                                boolean question3Correct, boolean question3Wrong,boolean question3Wrong2,
                                boolean question4Correct, boolean question4Wrong,boolean question4Wrong2
                                ) {

        String results = "\n";

        if (question1Correct) {
            gradeCount += 1;
            results += "A : \t\t\tcorrect\n";
        }
        if (question1Wrong) {
            results += "F : \t\t\t incorrect\n";
        }
        if (question1Wrong2) {
            results += "S : \t\t\t incorrect\n";
        }


        if (question2Correct) {
            gradeCount += 1;
            results += "W : \t\t\tcorrect\n";
        }
        if (question2Wrong) {
            results += "T : \t\t\t incorrect\n";
        }
        if (question2Wrong2) {
            results += "J : \t\t\t incorrect\n";
        }

        if (question3Correct) {
            gradeCount += 1;
            results += "E : \t\t\tcorrect\n";
        }
        if (question3Wrong) {
            results += "F : \t\t\t incorrect\n";
        }
        if (question3Wrong2) {
            results += "G : \t\t\t incorrect\n";
        }

        if (question4Correct) {
            gradeCount += 1;
            results += "G : \t\t\tcorrect\n";
        }
        if (question4Wrong) {
            results += "Z : \t\t\t incorrect\n";
        }
        if (question4Wrong2) {
            results += "U : \t\t\t incorrect\n";
        }

        String displayScore = "" + gradeCount;
        results += "\nSCORE POINTS: " + displayScore + "/4";
        gradeCount = 0;// Reset grade counter after every button click
        return results;

    }


    void PlayAudio(String fileName) {
        MediaPlayer mediaPlayer = new MediaPlayer();
        AssetFileDescriptor afd;
        try {
//            afd = getAssets().openFd("sounds/"+fileName+".mp3");
            afd = getAssets().openFd(fileName);
            mediaPlayer.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
            mediaPlayer.prepare();
            mediaPlayer.start();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public void PlayLetterA(View view) {
//        String letter = value.substring(1);
        PlayAudio("sounds/a.mp3");
    }

    public void PlayLetterW(View view) {
        PlayAudio("sounds/w.mp3");
    }

    public void PlayLetterG(View view) {
        PlayAudio("sounds/g.mp3");
    }

    public void PlayLetterE(View view) {
        PlayAudio("sounds/e.mp3");
    }

    public void submit_answer(View view) {
        boolean Q1Correct = question1Correct.isChecked();

        boolean Q1Wrong = question1Wrong.isChecked();

        boolean Q1Wrong2 = question1Wrong2.isChecked();

        boolean Q2Correct = question2Correct.isChecked();

        boolean Q2Wrong = question2Wrong.isChecked();

        boolean Q2Wrong2 = question2Wrong2.isChecked();

        boolean Q3Correct = question3Correct.isChecked();

        boolean Q3Wrong = question3Wrong.isChecked();

        boolean Q3Wrong2 = question3Wrong2.isChecked();

        boolean Q4Correct = question4Correct.isChecked();

        boolean Q4Wrong = question4Wrong.isChecked();

        boolean Q4Wrong2 = question4Wrong2.isChecked();

        String results = checkAnswers(Q1Correct, Q1Wrong, Q1Wrong2, Q2Correct, Q2Wrong, Q2Wrong2, Q3Correct, Q3Wrong, Q3Wrong2, Q4Correct, Q4Wrong,Q4Wrong2);
        new AlertDialog.Builder(this).setTitle("Quiz Result ")
                .setMessage("HERE ARE YOUR QUIZ RESULTS:  \n " + results)
                .setNegativeButton("Dismiss", (dialog, which) -> QuizTestActivity.super.onStart()).create().show();
    }
}