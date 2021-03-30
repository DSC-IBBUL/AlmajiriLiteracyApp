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

    public void LearningActivity(View view) {
//        startActivity(new Intent(this, LearningActivity.class));

//        Intent intent = new Intent();
//        intent.putExtra("TextValue", textA.getText().toString());
//        intent.putExtra("TextValueB", textB.getText().toString());
//        intent.setClass(MainActivity.this, LearningActivity.class);
//        startActivity(intent);



        Intent intent = new Intent(MainActivity.this, LearningActivity.class);
//                        intent.putExtra("model", (Serializable) model);
//        intent.putExtra("gender", model.getGender());
        intent.putExtra("A", textA.getText().toString());
        intent.putExtra("B", textB.getText().toString());
        intent.putExtra("C", textC.getText().toString());
        intent.putExtra("D", textD.getText().toString());
        intent.putExtra("E", textE.getText().toString());
        intent.putExtra("F", textF.getText().toString());
        intent.putExtra("G", textG.getText().toString());
        intent.putExtra("H", textH.getText().toString());
        intent.putExtra("I", textI.getText().toString());
        intent.putExtra("J", textJ.getText().toString());
        intent.putExtra("K", textK.getText().toString());
        intent.putExtra("L", textL.getText().toString());
        intent.putExtra("M", textM.getText().toString());
        intent.putExtra("N", textN.getText().toString());
        intent.putExtra("O", textO.getText().toString());
        intent.putExtra("P", textP.getText().toString());
        intent.putExtra("Q", textQ.getText().toString());
        intent.putExtra("R", textR.getText().toString());
        intent.putExtra("S", textS.getText().toString());
        intent.putExtra("T", textT.getText().toString());
        intent.putExtra("U", textU.getText().toString());
        intent.putExtra("V", textV.getText().toString());
        intent.putExtra("W", textW.getText().toString());
        intent.putExtra("X", textX.getText().toString());
        intent.putExtra("Y", textY.getText().toString());
        intent.putExtra("Z", textZ.getText().toString());

        startActivity(intent);

    }

/*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.bottom_navigation_menu, menu);


        super.onCreateOptionsMenu(menu);

        return true;
    }*/



}