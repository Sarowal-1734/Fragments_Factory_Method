package com.example.fragmentsfactorymethod;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editTextName, editTextAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextName = findViewById(R.id.editTextName);
        editTextAge = findViewById(R.id.editTextAge);
    }

    public void onSubmitButtonClicked(View view) {
        String Name = editTextName.getText().toString();
        int Age = Integer.parseInt(editTextAge.getText().toString());

        ExampleFragment fragment = ExampleFragment.newInstance(Name, Age);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, fragment).commit();
    }
}