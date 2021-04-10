package com.ayomi.almajiriliteracyapp.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;



import com.ayomi.almajiriliteracyapp.R;
import com.ayomi.almajiriliteracyapp.activities.LearningActivity;

public class HomeFragment extends Fragment {

    ViewGroup homeView;
    TextView
            startLearningActivityA,
            startLearningActivityB,
            startLearningActivityC,
            startLearningActivityD,
            startLearningActivityE,
            startLearningActivityF,
            startLearningActivityG,
            startLearningActivityH,
            startLearningActivityI,
            startLearningActivityJ,
            startLearningActivityK,
            startLearningActivityL,
            startLearningActivityM,
            startLearningActivityN,
            startLearningActivityO,
            startLearningActivityP,
            startLearningActivityQ,
            startLearningActivityR,
            startLearningActivityS,
            startLearningActivityT,
            startLearningActivityU,
            startLearningActivityV,
            startLearningActivityW,
            startLearningActivityX,
            startLearningActivityY,
            startLearningActivityZ;

    public TextView
            textA,
            textB,
            textC,
            textD,
            textE,
            textF,
            textG,
            textH,
            textI,
            textJ,
            textK,
            textL,
            textM,
            textN,
            textO,
            textP,
            textQ,
            textR,
            textS,
            textT,
            textU,
            textV,
            textW,
            textX,
            textY,
            textZ;


    public HomeFragment() {
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
        homeView = (ViewGroup) inflater.inflate(R.layout.fragment_home, null);

        textA = homeView.findViewById(R.id.txtA);
        textB = homeView.findViewById(R.id.txtB);
        textC = homeView.findViewById(R.id.txtC);
        textD = homeView.findViewById(R.id.txtD);
        textE = homeView.findViewById(R.id.txtE);
        textF = homeView.findViewById(R.id.txtF);
        textG = homeView.findViewById(R.id.txtG);
        textH = homeView.findViewById(R.id.txtH);
        textI = homeView.findViewById(R.id.txtI);
        textJ = homeView.findViewById(R.id.txtJ);
        textK = homeView.findViewById(R.id.txtK);
        textL = homeView.findViewById(R.id.txtL);
        textM = homeView.findViewById(R.id.txtM);
        textN = homeView.findViewById(R.id.txtN);
        textO = homeView.findViewById(R.id.txtO);
        textP = homeView.findViewById(R.id.txtP);
        textQ = homeView.findViewById(R.id.txtQ);
        textR = homeView.findViewById(R.id.txtR);
        textS = homeView.findViewById(R.id.txtS);
        textT = homeView.findViewById(R.id.txtT);
        textU = homeView.findViewById(R.id.txtU);
        textV = homeView.findViewById(R.id.txtV);
        textW = homeView.findViewById(R.id.txtW);
        textX = homeView.findViewById(R.id.txtX);
        textY = homeView.findViewById(R.id.txtY);
        textZ = homeView.findViewById(R.id.txtZ);


        startLearningActivityA = homeView.findViewById(R.id.learningActivityA);
        startLearningActivityB = homeView.findViewById(R.id.learningActivityB);
        startLearningActivityC = homeView.findViewById(R.id.learningActivityC);
        startLearningActivityD = homeView.findViewById(R.id.learningActivityD);
        startLearningActivityE = homeView.findViewById(R.id.learningActivityE);
        startLearningActivityF = homeView.findViewById(R.id.learningActivityF);
        startLearningActivityG = homeView.findViewById(R.id.learningActivityG);
        startLearningActivityH = homeView.findViewById(R.id.learningActivityH);
        startLearningActivityI = homeView.findViewById(R.id.learningActivityI);
        startLearningActivityJ = homeView.findViewById(R.id.learningActivityJ);
        startLearningActivityK = homeView.findViewById(R.id.learningActivityK);
        startLearningActivityL = homeView.findViewById(R.id.learningActivityL);
        startLearningActivityM = homeView.findViewById(R.id.learningActivityM);
        startLearningActivityN = homeView.findViewById(R.id.learningActivityN);
        startLearningActivityO = homeView.findViewById(R.id.learningActivityO);
        startLearningActivityP = homeView.findViewById(R.id.learningActivityP);
        startLearningActivityQ = homeView.findViewById(R.id.learningActivityQ);
        startLearningActivityR = homeView.findViewById(R.id.learningActivityR);
        startLearningActivityS = homeView.findViewById(R.id.learningActivityS);
        startLearningActivityT = homeView.findViewById(R.id.learningActivityT);
        startLearningActivityU = homeView.findViewById(R.id.learningActivityU);
        startLearningActivityV = homeView.findViewById(R.id.learningActivityV);
        startLearningActivityW = homeView.findViewById(R.id.learningActivityW);
        startLearningActivityX = homeView.findViewById(R.id.learningActivityX);
        startLearningActivityY = homeView.findViewById(R.id.learningActivityY);
        startLearningActivityZ = homeView.findViewById(R.id.learningActivityZ);

        startLearningActivityA.setOnClickListener(v -> {

            LearningActivity(textA.getText().toString());

        });
        startLearningActivityB.setOnClickListener(v -> {
            LearningActivity(textB.getText().toString());
        });
        startLearningActivityC.setOnClickListener(v -> {
            LearningActivity(textC.getText().toString());
        });
        startLearningActivityD.setOnClickListener(v -> {
            LearningActivity(textD.getText().toString());
        });
        startLearningActivityE.setOnClickListener(v -> {
            LearningActivity(textE.getText().toString());
        });
        startLearningActivityF.setOnClickListener(v -> {
            LearningActivity(textF.getText().toString());
        });
        startLearningActivityG.setOnClickListener(v -> {
            LearningActivity(textG.getText().toString());
        });
        startLearningActivityH.setOnClickListener(v -> {
            LearningActivity(textH.getText().toString());
        });
        startLearningActivityI.setOnClickListener(v -> {
            LearningActivity(textI.getText().toString());
        });
        startLearningActivityJ.setOnClickListener(v -> {
            LearningActivity(textJ.getText().toString());
        });
        startLearningActivityK.setOnClickListener(v -> {
            LearningActivity(textK.getText().toString());
        });
        startLearningActivityL.setOnClickListener(v -> {
            LearningActivity(textL.getText().toString());
        });
        startLearningActivityM.setOnClickListener(v -> {
            LearningActivity(textM.getText().toString());
        });
        startLearningActivityN.setOnClickListener(v -> {
            LearningActivity(textN.getText().toString());
        });
        startLearningActivityO.setOnClickListener(v -> {
            LearningActivity(textO.getText().toString());
        });
        startLearningActivityP.setOnClickListener(v -> {
            LearningActivity(textP.getText().toString());
        });
        startLearningActivityQ.setOnClickListener(v -> {
            LearningActivity(textQ.getText().toString());
        });
        startLearningActivityR.setOnClickListener(v -> {
            LearningActivity(textR.getText().toString());
        });
        startLearningActivityS.setOnClickListener(v -> {
            LearningActivity(textS.getText().toString());
        });
        startLearningActivityT.setOnClickListener(v -> {
            LearningActivity(textT.getText().toString());
        });
        startLearningActivityU.setOnClickListener(v -> {
            LearningActivity(textU.getText().toString());
        });
        startLearningActivityV.setOnClickListener(v -> {
            LearningActivity(textV.getText().toString());
        });
        startLearningActivityW.setOnClickListener(v -> {
            LearningActivity(textW.getText().toString());
        });
        startLearningActivityX.setOnClickListener(v -> {
            LearningActivity(textX.getText().toString());
        });
        startLearningActivityY.setOnClickListener(v -> {
            LearningActivity(textY.getText().toString());
        });
        startLearningActivityZ.setOnClickListener(v -> {
            LearningActivity(textZ.getText().toString());
        });


        return homeView;
    }

    public void LearningActivity(String letter) {
        Intent intent = new Intent(getActivity(), LearningActivity.class);
        intent.putExtra("letter", letter);
        startActivity(intent);
    }


}