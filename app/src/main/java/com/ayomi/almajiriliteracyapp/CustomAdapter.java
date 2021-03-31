package com.ayomi.almajiriliteracyapp;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {
    private View view;
    private Context context;
    Activity activity;

    @NonNull
    @Override
    public CustomAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate(R.layout.quiz_row, parent, false);
        return new MyViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull CustomAdapter.MyViewHolder holder, int position) {
        holder.startQuiz.setOnClickListener(v -> {
            Toast.makeText(context, "Starting Quiz in a short while", Toast.LENGTH_SHORT).show();
        });

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView alphabet, startQuiz, unLockQuiz;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            alphabet  = itemView.findViewById(R.id.txt_quizAplphabet);
            startQuiz  = itemView.findViewById(R.id.txtStartQuiz);
            unLockQuiz  = itemView.findViewById(R.id.txtUnLock);

        }
    }
}
