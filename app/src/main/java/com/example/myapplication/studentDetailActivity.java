package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class studentDetailActivity extends AppCompatActivity {

    public static final String STUDENT = "student";
    private int studentId;
    private EditText nameView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_studen_detail);

        Intent intent = getIntent();
        student student = (student) intent.getSerializableExtra(STUDENT);
        studentId = student.getId();

        TextView textView = findViewById(R.id.studentDetailsTextView);
        textView.setText("id: " + studentId);

        TextView navnView = findViewById(R.id.studentDetailNameView);
        navnView.setText(" navn: "+ student.getName());

        TextView alderView = findViewById(R.id.studentDetailAlderView);
        alderView.setText(" alder: " + student.getAge());

    }
}
