package com.example.siddhant.greninjas;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by user on 7/26/2016.
 */
public class FAQAdapter extends BaseExpandableListAdapter {
    List<FAQTask> items;
    LayoutInflater inflater;

    public FAQAdapter(List<FAQTask> items, LayoutInflater inflater) {
        this.items = items;
        this.inflater = inflater;
    }

    @Override
    public int getGroupCount() {
        return items.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return 1;
    }

    @Override
    public FAQTask getGroup(int groupPosition) {
        return items.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return getGroup(groupPosition).getAnswer();
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return groupPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        View output = convertView;
        if(output==null){
            output = inflater.inflate(R.layout.row_layout_faq_ques,parent,false);
        }
        TextView textView = (TextView)output.findViewById(R.id.faqquesTextView);
        FAQTask faq = getGroup(groupPosition);
        textView.setText(faq.getQuestion());
        return output;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        View output = convertView;
        if(output==null){
            output = inflater.inflate(R.layout.row_layout_faq_ans,parent,false);
        }
        TextView textView = (TextView)output.findViewById(R.id.faqAnsTextView);
        FAQTask faq = (FAQTask) getGroup(groupPosition);
        textView.setText(faq.getAnswer());
        return output;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return false;
    }
}
