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
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private CircleImageView displayImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();




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
        startActivity(new Intent(this, LearningActivity.class));
    }

/*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.bottom_navigation_menu, menu);


        super.onCreateOptionsMenu(menu);

        return true;
    }*/



}