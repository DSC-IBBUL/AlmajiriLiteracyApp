package com.ayomi.almajiriliteracyapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
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

    private CircleImageView displayImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();


        textA = findViewById(R.id.txtA);
        textB = findViewById(R.id.txtB);
        textC = findViewById(R.id.txtC);
        textD = findViewById(R.id.txtD);
        textE = findViewById(R.id.txtE);
        textF = findViewById(R.id.txtF);
        textG = findViewById(R.id.txtG);
        textH = findViewById(R.id.txtH);
        textI = findViewById(R.id.txtI);
        textJ = findViewById(R.id.txtJ);
        textK = findViewById(R.id.txtK);
        textL = findViewById(R.id.txtL);
        textM = findViewById(R.id.txtM);
        textN = findViewById(R.id.txtN);
        textO = findViewById(R.id.txtO);
        textP = findViewById(R.id.txtP);
        textQ = findViewById(R.id.txtQ);
        textR = findViewById(R.id.txtR);
        textS = findViewById(R.id.txtS);
        textT = findViewById(R.id.txtT);
        textU = findViewById(R.id.txtU);
        textV = findViewById(R.id.txtV);
        textW = findViewById(R.id.txtW);
        textX = findViewById(R.id.txtX);
        textY = findViewById(R.id.txtY);
        textZ = findViewById(R.id.txtZ);


    }


    private BottomNavigationView.OnNavigationItemSelectedListener navigationItemSelectedListner =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                    switch (item.getItemId()) {
                        case R.id.page_1:

                            Toast.makeText(MainActivity.this, "Page 1", Toast.LENGTH_SHORT).show();
                            //sendUserToRequestActivity();
                            break;
                        case R.id.page_2:

                            Toast.makeText(MainActivity.this, "Page 2", Toast.LENGTH_SHORT).show();
                            //sendUserToTextActivity();
                            break;
                        case R.id.page_3:

                            Toast.makeText(MainActivity.this, "Page 3", Toast.LENGTH_SHORT).show();
                            // sendUserToFindFriendsActivity();
                            break;

                        /*case R.id.page_4:
                            Toast.makeText(MainActivity.this, "Page 4", Toast.LENGTH_SHORT).show();
                            break;*/
                        /*case R.id.ic_circle:
                            new AlertDialog.Builder(MainActivity.this).setTitle("Upload")
                                    .setPositiveButton("Upload Image", new DialogInterface.OnClickListener() {
                                        @Override
                                        public void onClick(DialogInterface dialog, int which) {
                                            SendUserToPostActivity();
                                        }
                                    })
                                    .setNegativeButton("Upload Text", new DialogInterface.OnClickListener() {
                                        @Override
                                        public void onClick(DialogInterface dialog, int which) {
                                            //MainActivity.super.onStart();
                                            SendUserToTextActivity();
                                        }
                                    }).create().show();
                            break;
                        case R.id.ic_alert:
                            sendToNotificationActivity();
                            break;*/
                    }


                    return true;
                }
            };

    public void LearningActivity(String letter) {
        Intent intent = new Intent(MainActivity.this, LearningActivity.class);
        intent.putExtra("letter", letter);
        startActivity(intent);
    }

    public void LearningActivityA(View view) {
        LearningActivity(textA.getText().toString());
    }

    public void LearningActivityB(View view) {
        LearningActivity(textB.getText().toString());
    }

    public void LearningActivityC(View view) {
        LearningActivity(textC.getText().toString());
    }

    public void LearningActivityD(View view) {
        LearningActivity(textD.getText().toString());
    }

    public void LearningActivityE(View view) {
        LearningActivity(textE.getText().toString());
    }

    public void LearningActivityF(View view) {
        LearningActivity(textF.getText().toString());
    }

    public void LearningActivityG(View view) {
        LearningActivity(textG.getText().toString());
    }

    public void LearningActivityH(View view) {
        LearningActivity(textH.getText().toString());
    }

    public void LearningActivityI(View view) {
        LearningActivity(textI.getText().toString());
    }

    public void LearningActivityJ(View view) {
        LearningActivity(textJ.getText().toString());
    }

    public void LearningActivityK(View view) {
        LearningActivity(textK.getText().toString());
    }

    public void LearningActivityL(View view) {
        LearningActivity(textL.getText().toString());
    }

    public void LearningActivityM(View view) {
        LearningActivity(textM.getText().toString());
    }

    public void LearningActivityN(View view) {
        LearningActivity(textN.getText().toString());
    }

    public void LearningActivityO(View view) {
        LearningActivity(textO.getText().toString());
    }

    public void LearningActivityP(View view) {
        LearningActivity(textP.getText().toString());
    }

    public void LearningActivityQ(View view) {
        LearningActivity(textQ.getText().toString());
    }

    public void LearningActivityR(View view) {
        LearningActivity(textR.getText().toString());
    }

    public void LearningActivityS(View view) {
        LearningActivity(textS.getText().toString());
    }

    public void LearningActivityT(View view) {
        LearningActivity(textT.getText().toString());
    }

    public void LearningActivityU(View view) {
        LearningActivity(textU.getText().toString());
    }

    public void LearningActivityV(View view) {
        LearningActivity(textV.getText().toString());
    }

    public void LearningActivityW(View view) {
        LearningActivity(textW.getText().toString());
    }

    public void LearningActivityX(View view) {
        LearningActivity(textX.getText().toString());
    }

    public void LearningActivityY(View view) {
        LearningActivity(textY.getText().toString());
    }

    public void LearningActivityZ(View view) {
        LearningActivity(textZ.getText().toString());
    }


    public void TakeQuiz(View view) {
        startActivity(new Intent(this, QuizTestActivity.class));
    }
}