package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class otherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);

        Toast.makeText(this, "landed in this activity", Toast.LENGTH_SHORT).show();

        Bundle bundle = getIntent().getExtras();
        String str =bundle.getString("key");

        Toast.makeText(this, str, Toast.LENGTH_SHORT).show();


    }
}
