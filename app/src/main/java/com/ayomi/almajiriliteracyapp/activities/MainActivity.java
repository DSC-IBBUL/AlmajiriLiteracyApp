package com.ayomi.almajiriliteracyapp.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.ayomi.almajiriliteracyapp.R;
import com.ayomi.almajiriliteracyapp.activities.ProfileActivity;
import com.ayomi.almajiriliteracyapp.fragment.HomeFragment;
import com.ayomi.almajiriliteracyapp.fragment.QuizFragment;
import com.ayomi.almajiriliteracyapp.fragment.RewardFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    BottomNavigationView bottomNavigation;

    private Toolbar toolbar;
    private CircleImageView displayImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();

        displayImageView = findViewById(R.id.circleImageView);
        displayImageView.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, ProfileActivity.class));
        });

        bottomNavigation = findViewById(R.id.bottom_navigation);

        loadFragment(new HomeFragment());

        bottomNavigation.setOnNavigationItemSelectedListener(this);


    }





    private boolean loadFragment(Fragment fragment) {
        //switching fragment
        if (fragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, fragment)
                    .commit();
            return true;
        }
        return false;
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment fragment = null;

        switch (item.getItemId()) {
            case R.id.page_1:
                fragment = new HomeFragment();
                break;

            case R.id.page_2:
                fragment = new QuizFragment();
                break;

            case R.id.page_3:
                fragment = new RewardFragment();
                break;

        }
        return loadFragment(fragment);


    }

}