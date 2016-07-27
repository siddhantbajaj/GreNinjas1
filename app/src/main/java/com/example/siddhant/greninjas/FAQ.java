package com.example.siddhant.greninjas;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class FAQ extends AppCompatActivity {
ExpandableListView mFAQListview;
    FAQAdapter adapter;
    List<FAQTask> dataList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq);
        mFAQListview = (ExpandableListView)findViewById(R.id.FaqListView);

        dataList = new ArrayList<FAQTask>();

        dataList.add(new FAQTask("What is GRE?" , "The Graduate Record Examination(GRE) is a standardized test that is an admissions requirement for most graduate schools in United States.The exam aims to measure verbal reasoning ,quantitative reasoning,analytical writing,and critical thinking skills that have been acquired over a long period of time and that are not entirely based on any specific field of study outside of the GRE itself."));
        dataList.add(new FAQTask("" , "Answers"));
        dataList.add(new FAQTask("Question" , "Answers"));
        dataList.add(new FAQTask("Question" , "Answers"));




//        dataList = new List<FAQTask>() {
//            @Override
//            public void add(int location, FAQTask object) {
//
//                object = new FAQTask("Question" , "Answer");
//
//
//            }
//
//            @Override
//            public boolean add(FAQTask object) {
//                return false;
//            }
//
//            @Override
//            public boolean addAll(int location, Collection<? extends FAQTask> collection) {
//                return false;
//            }
//
//            @Override
//            public boolean addAll(Collection<? extends FAQTask> collection) {
//                return false;
//            }
//
//            @Override
//            public void clear() {
//
//            }
//
//            @Override
//            public boolean contains(Object object) {
//                return false;
//            }
//
//            @Override
//            public boolean containsAll(Collection<?> collection) {
//                return false;
//            }
//
//            @Override
//            public FAQTask get(int location) {
//                return null;
//            }
//
//            @Override
//            public int indexOf(Object object) {
//                return 0;
//            }
//
//            @Override
//            public boolean isEmpty() {
//                return false;
//            }
//
//            @NonNull
//            @Override
//            public Iterator<FAQTask> iterator() {
//                return null;
//            }
//
//            @Override
//            public int lastIndexOf(Object object) {
//                return 0;
//            }
//
//            @Override
//            public ListIterator<FAQTask> listIterator() {
//                return null;
//            }
//
//            @NonNull
//            @Override
//            public ListIterator<FAQTask> listIterator(int location) {
//                return null;
//            }
//
//            @Override
//            public FAQTask remove(int location) {
//                return null;
//            }
//
//            @Override
//            public boolean remove(Object object) {
//                return false;
//            }
//
//            @Override
//            public boolean removeAll(Collection<?> collection) {
//                return false;
//            }
//
//            @Override
//            public boolean retainAll(Collection<?> collection) {
//                return false;
//            }
//
//            @Override
//            public FAQTask set(int location, FAQTask object) {
//                return null;
//            }
//
//            @Override
//            public int size() {
//                return 0;
//            }
//
//            @NonNull
//            @Override
//            public List<FAQTask> subList(int start, int end) {
//                return null;
//            }
//
//            @NonNull
//            @Override
//            public Object[] toArray() {
//                return new Object[0];
//            }
//
//            @NonNull
//            @Override
//            public <T> T[] toArray(T[] array) {
//                return null;
//            }
//        };


        adapter = new FAQAdapter(dataList,getLayoutInflater());
        mFAQListview.setAdapter(adapter);

    }
}
