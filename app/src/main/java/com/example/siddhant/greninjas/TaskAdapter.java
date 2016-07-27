package com.example.siddhant.greninjas;

import android.content.Context;



import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.siddhant.greninjas.R;
import com.example.siddhant.greninjas.Task;

import java.util.ArrayList;

/**
 * Created by user on 7/27/2016.
 */
public class TaskAdapter extends ArrayAdapter {
    private Context context;
    ArrayList<Task> mData;

    public TaskAdapter(Context context, ArrayList<Task> objects) {
        super(context, 0, objects);
        mData = objects;
        this.context = context;
    }


    public int getCount() {
        return mData.size();
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        if (v == null) {
            v = LayoutInflater.from(this.context).inflate(R.layout.tasklist, parent, false);
        }

        Task currentTask = mData.get(position);
        TextView taskTextView = (TextView) v.findViewById(R.id.taskTextView);


        taskTextView.setText(currentTask.getTask());


        return v;

    }
}
