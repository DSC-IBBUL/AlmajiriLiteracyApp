package com.ayomi.almajiriliteracyapp.fragment;

import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;

import com.ayomi.almajiriliteracyapp.R;

import java.io.IOException;
import java.util.Objects;


public class QuizFragment extends Fragment {

    Button submitAnswer;
    ImageButton playLetterA, playLetterC, playLetterH, playLetterU;
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


    public QuizFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View quizView = inflater.inflate(R.layout.fragment_quiz, null);

        submitAnswer = quizView.findViewById(R.id.grading_button);
        playLetterA = quizView.findViewById(R.id.soundA);
        playLetterC = quizView.findViewById(R.id.soundC);
        playLetterH = quizView.findViewById(R.id.soundH);
        playLetterU = quizView.findViewById(R.id.soundU);


        question1Correct = quizView.findViewById(R.id.question1_true_answer);
        question1Wrong = quizView.findViewById(R.id.question1_false_answer);
        question1Wrong2 = quizView.findViewById(R.id.question1_false_answer2);
        question2Correct = quizView.findViewById(R.id.question2_true_answer);
        question2Wrong = quizView.findViewById(R.id.question2_false_answer);
        question2Wrong2 = quizView.findViewById(R.id.question2_false_answer2);
        question3Correct = quizView.findViewById(R.id.question3_true_answer);
        question3Wrong = quizView.findViewById(R.id.question3_false_answer);
        question3Wrong2 = quizView.findViewById(R.id.question3_false_answer2);
        question4Correct = quizView.findViewById(R.id.question4_true_answer);
        question4Wrong = quizView.findViewById(R.id.question4_false_answer);
        question4Wrong2 = quizView.findViewById(R.id.question4_false_answer2);


        submitAnswer.setOnClickListener(v -> {

            SubmitQuiz();
        });
        playLetterA.setOnClickListener(v -> {
            PlayLetterA();
        });
        playLetterC.setOnClickListener(v -> {
            PlayLetterC();
        });
        playLetterH.setOnClickListener(v -> {
            PlayLetterH();
        });
        playLetterU.setOnClickListener(v -> {
            PlayLetterU();
        });

        return quizView;
    }

    private String checkAnswers(boolean question1Correct, boolean question1Wrong, boolean question1Wrong2,
                                boolean question2Correct, boolean question2Wrong, boolean question2Wrong2,
                                boolean question3Correct, boolean question3Wrong, boolean question3Wrong2,
                                boolean question4Correct, boolean question4Wrong, boolean question4Wrong2
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
            results += "C : \t\t\tcorrect\n";
        }
        if (question2Wrong) {
            results += "T : \t\t\t incorrect\n";
        }
        if (question2Wrong2) {
            results += "J : \t\t\t incorrect\n";
        }

        if (question3Correct) {
            gradeCount += 1;
            results += "H : \t\t\tcorrect\n";
        }
        if (question3Wrong) {
            results += "F : \t\t\t incorrect\n";
        }
        if (question3Wrong2) {
            results += "G : \t\t\t incorrect\n";
        }

        if (question4Correct) {
            gradeCount += 1;
            results += "U : \t\t\tcorrect\n";
        }
        if (question4Wrong) {
            results += "Z : \t\t\t incorrect\n";
        }
        if (question4Wrong2) {
            results += "W : \t\t\t incorrect\n";
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
            afd = Objects.requireNonNull(getActivity()).getAssets().openFd(fileName);
            mediaPlayer.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
            mediaPlayer.prepare();
            mediaPlayer.start();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public void PlayLetterA() {
//        String letter = value.substring(1);
        PlayAudio("sounds/a.mp3");
    }

    public void PlayLetterC() {
        PlayAudio("sounds/c.mp3");
    }

    public void PlayLetterH() {
        PlayAudio("sounds/h.mp3");
    }

    public void PlayLetterU() {
        PlayAudio("sounds/u.mp3");
    }

    void SubmitQuiz() {
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
        new AlertDialog.Builder(Objects.requireNonNull(getActivity())).setTitle("Quiz Result ")
                .setMessage("HERE ARE YOUR QUIZ RESULTS:  \n " + results)
                .setNegativeButton("Dismiss", (dialog, which) -> QuizFragment.super.onStart()).create().show();
    }
}