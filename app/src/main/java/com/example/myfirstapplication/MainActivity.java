package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


//this is where we take core activity
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button dialPhone,toast,showLocation,openWebPage,viewIntent,letsGetPro;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("tag","in on create");



        //following line brings the top of the activity
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);

        dialPhone =findViewById(R.id.dialNumber);
        toast =findViewById(R.id.toast);
        showLocation =findViewById(R.id.showLocation);
        letsGetPro =findViewById(R.id.letsGetPro);
        viewIntent =findViewById(R.id.viewIntent);

        dialPhone.setOnClickListener(this);
        viewIntent.setOnClickListener(this);
        letsGetPro.setOnClickListener(this);
        toast.setOnClickListener(this);
        showLocation.setOnClickListener(this);

        //event listener
//        TouchMe.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.d("tag","somebody touch the button");
//                textView.setText("somebody touch the button");
//
//            }
//        });
//
//        TouchMe2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.d("tag","somebody touch the button 2");
//                textView.setText("somebody touch the button 2");
//            }
//        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("tag","in onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("tag","in onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("tag","in onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("tag","in onStop");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("tag","in onDestroy");
    }



    //better approch for using whwn mutiple button
    @Override
    public void onClick(View view) {

        switch (view.getId())
        {
            case R.id.dialNumber:
                //Dial happen to be an andriod component

                Intent intent1 = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:1234567890"));
                startActivity(intent1);


                break;

            case R.id.showLocation:



                break;

            case R.id.openWebPage:


                break;

            case R.id.letsGetPro:


                break;

            case R.id.toast:
                Intent intent = new Intent(MainActivity.this,otherActivity.class);
                startActivity(intent);


                break;
        }
    }
}
