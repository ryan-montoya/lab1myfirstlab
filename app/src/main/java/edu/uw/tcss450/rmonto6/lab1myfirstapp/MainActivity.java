package edu.uw.tcss450.rmonto6.lab1myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // setContentView(R.layout.fragment_first);
    }
    @Override
    protected void onStart() {

        super.onStart();
    }
 // beans beans beans beabs adsasfd
    @Override
    protected void onRestart() {
        Log.i("lab1i", " testi");
        super.onRestart();
    }
    @Override
    protected void onResume() {
        Log.d("lab1d", " testd");
        super.onResume();
    }
    @Override
    protected void onPause() {
        Log.w("lab1w", " testw");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.v("lab1v", " testv");
        super.onStop();
    }
    @Override
    protected void onDestroy() {
        Log.e("lab1e", " teste");
        super.onDestroy();
    }
}