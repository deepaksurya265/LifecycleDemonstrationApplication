package com.wiates.lifecycleapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Lifecycle Tracking","onResume() Executed");
        Toast.makeText(getApplicationContext(),"onResume() Executed",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Lifecycle Tracking","onRestart() Executed");
        Toast.makeText(getApplicationContext(),"onRestart() Executed",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Lifecycle Tracking","onPause() Executed");
        Toast.makeText(getApplicationContext(),"onPause() Executed",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Lifecycle Tracking","onDestroy() Executed");
        Toast.makeText(getApplicationContext(),"onDestroy() Executed",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Lifecycle Tracking","onStop() Executed");
        Toast.makeText(getApplicationContext(),"onStop() Executed",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Lifecycle Tracking","onStart() Executed");
        Toast.makeText(getApplicationContext(),"onStart() Executed",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Lifecycle Tracking","onCreate() Executed");
        Toast.makeText(getApplicationContext(),"onCreate() Executed",Toast.LENGTH_SHORT).show();
    }
}
