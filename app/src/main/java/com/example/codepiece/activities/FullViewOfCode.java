package com.example.codepiece.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.codepiece.R;

public class FullViewOfCode extends AppCompatActivity {

    TextView problemsTitleTextView, problemsSolutionTextView, problemsAlgorithmTextView;
    Button solButtonC, solButtonCpp, solButtonJava, solButtonPython;

    Intent intent;
    String problemsTitle, problemSolC, problemSolCpp, problemSolJava, problemSolPython, algorithms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_view_of_code);

        getWindow().setStatusBarColor(ContextCompat.getColor(this,R.color.primary_color_variant));

        solButtonC = findViewById(R.id.code_in_c);
        solButtonCpp = findViewById(R.id.code_in_cpp);
        solButtonJava = findViewById(R.id.code_in_java);
        solButtonPython = findViewById(R.id.code_in_python);

        intent = getIntent();
        problemsTitle = intent.getStringExtra("problemsTitle");
        problemSolC = intent.getStringExtra("problemSolC");
        problemSolCpp = intent.getStringExtra("problemSolCpp");
        problemSolJava = intent.getStringExtra("problemSolJava");
        problemSolPython = intent.getStringExtra("problemSolPython");
        algorithms = intent.getStringExtra("algorithms");

        problemsTitleTextView = findViewById(R.id.full_view_problems_title_text_View);
        problemsSolutionTextView = findViewById(R.id.full_view_problems_solution_text_View);
        problemsAlgorithmTextView = findViewById(R.id.full_view_problems_algorithms_text_View);

        problemsTitleTextView.setText(problemsTitle);
        problemsSolutionTextView.setText(problemSolC);
        problemsAlgorithmTextView.setText(algorithms);

        solButtonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                problemsSolutionTextView.setText(problemSolC);
            }
        });

        solButtonCpp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                problemsSolutionTextView.setText(problemSolCpp);
            }
        });

        solButtonJava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                problemsSolutionTextView.setText(problemSolJava);
            }
        });

        solButtonPython.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                problemsSolutionTextView.setText(problemSolPython);
            }
        });
    }
}