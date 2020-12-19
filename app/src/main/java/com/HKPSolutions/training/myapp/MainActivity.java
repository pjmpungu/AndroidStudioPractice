package com.HKPSolutions.training.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    //this is where we take care of core business logic
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //following line vrings in view on top of activity
        //setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
        //expect hello hkp here
        Log.d("tag","On create");
//        Log.e("tag","On create");
//        Log.w("tag","On create");
//        Log.i("tag","On create");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("tag","On create");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("tag","On Resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("tag","On Pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("tag","On Stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("tag","On destroy");
    }
}