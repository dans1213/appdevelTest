package com.example.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static String TAG= MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "The onCreate() called");

    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d(TAG, "The onStart() called");
    }


    @Override
    protected void onResume(){
        super.onResume();
        Log.d(TAG, "The onResume() called");
    }


    @Override
    protected void onPause(){
        super.onPause();
        Log.d(TAG, "The onPause() called");
    }


    @Override
    protected void onStop(){
        super.onStop();
        Log.d(TAG,"The onStop() called");
    }


    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(TAG,"The onDestroy() called");
    }


}