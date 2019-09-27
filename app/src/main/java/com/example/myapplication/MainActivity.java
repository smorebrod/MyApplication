package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.jar.Attributes;


public class MainActivity extends AppCompatActivity {

    private ArrayAdapter<student> adapter;


    student student1 = new student("Alex", 1, 23);
    student student2 = new student("Dennis", 2, 24);
    student student3 = new student("Martin", 3, 23);


    ArrayList<student> sList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sList.add(student1);
        sList.add(student2);
        sList.add((student3));

    }

    @Override
    protected void onStart() {
        super.onStart();

        ListView listview = findViewById(R.id.ListViewStudent);
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,sList);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Intent intent = new Intent(getBaseContext(), studentDetailActivity.class);
                student theStudent = (student) adapterView.getItemAtPosition(position);
                intent.putExtra(studentDetailActivity.STUDENT,theStudent);
                startActivity(intent);
            }
        });




    }
}
