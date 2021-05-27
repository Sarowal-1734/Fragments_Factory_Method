package com.example.fragmentsfactorymethod;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class ExampleFragment extends Fragment {

    TextView textView;

    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_NAME = "argName";
    private static final String ARG_AGE = "param2";

    private String name;
    private int age;

    public ExampleFragment() {
        // Required empty public constructor
    }

    public static ExampleFragment newInstance(String name, int age) {
        ExampleFragment fragment = new ExampleFragment();
        Bundle args = new Bundle();
        args.putString(ARG_NAME, name);
        args.putInt(ARG_AGE, age);
        fragment.setArguments(args);
        return fragment;
    }

    // get the values from bundle
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            name = getArguments().getString(ARG_NAME);
            age = getArguments().getInt(ARG_AGE);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_example, container, false);

        textView = view.findViewById(R.id.textView);
        textView.setText("Name: "+name +"\nAge: "+age);
        return view;
    }
}