package com.example.siddhant.greninjas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class settings extends AppCompatActivity {
ListView mTaskListView;
    ArrayList<Task> dataList;
    ArrayAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        mTaskListView = (ListView) findViewById(R.id.TaskListView);
        dataList = new ArrayList<>();
        dataList.add(new Task("Language"));
        dataList.add(new Task("Sound"));
        dataList.add(new Task("About Us"));
        dataList.add(new Task("Privacy"));
        dataList.add(new Task("Year"));


        adapter = new TaskAdapter(this, dataList);
        mTaskListView.setAdapter(adapter);
    }
}
