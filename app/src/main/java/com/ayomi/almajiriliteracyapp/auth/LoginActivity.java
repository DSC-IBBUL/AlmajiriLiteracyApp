package com.ayomi.almajiriliteracyapp.auth;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.ayomi.almajiriliteracyapp.MainActivity;
import com.ayomi.almajiriliteracyapp.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.PhoneMultiFactorAssertion;

import java.io.IOException;

public class LoginActivity extends AppCompatActivity {

    private EditText loginEmail, loginPassword;
    private TextView forgetPassword, singUp;
    private Button loginButton;
    private FirebaseAuth mAuth;
    String Email, Password;

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowCustomEnabled(true);


        loginEmail = findViewById(R.id.edtUsername);
        loginPassword = findViewById(R.id.edtPassword);
//        forgetPassword = findViewById(R.id.txtForgetPassword);
//        singUp = findViewById(R.id.txtSignUp);
        loginButton = findViewById(R.id.btn_Login);

        mAuth = FirebaseAuth.getInstance();

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    loginUser();


            }
        });
    }

    private void loginUser() {
//
        Email = loginEmail.getText().toString();
        Password = loginPassword.getText().toString();


//        Email = "admin@mail.com";
//        Password = "123456";


        if (Email.isEmpty() || Password.isEmpty())
        {
            Toast.makeText(LoginActivity.this, "Email/Password should not be Empty", Toast.LENGTH_SHORT).show();
        } else {
            mAuth.signInWithEmailAndPassword(Email, Password)
                    .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()) {
                                // Sign in success, update UI with the signed-in user's information
//                            Log.d(TAG, "signInWithEmail:success");
                                Toast.makeText(LoginActivity.this, "Lgoin Successful.",
                                        Toast.LENGTH_SHORT).show();
                                SendUserToMain();
                            } else {
                                // If sign in fails, display a message to the user.
//                            Log.w(TAG, "signInWithEmail:failure", task.getException());
                                Toast.makeText(LoginActivity.this, "Authentication failed.",
                                        Toast.LENGTH_SHORT).show();

                            }

                            // ...
                        }
                    });
        }



    }

    private void SendUserToMain() {
        Intent intent = new Intent(LoginActivity.this, MainActivity.class);
        startActivity(intent);
    }
/*
//    public final class PlayerExample {
        MediaPlayer mediaPlayer = new MediaPlayer();

        public void playSound(Context context, String fileName) {
            try {
                AssetFileDescriptor descriptor = context.getAssets().openFd(fileName);
                mediaPlayer.setDataSource(descriptor.getFileDescriptor(), descriptor.getStartOffset(), descriptor.getLength());
                descriptor.close();
                mediaPlayer.prepare();
            } catch (Exception e) {
                e.printStackTrace();
            }
            mediaPlayer.start();
        }
//    }*/




//    public void Login(View view) {
//        startActivity(new Intent(this, MainActivity.class));
//    }
}