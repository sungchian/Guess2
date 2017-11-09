package com.fju.guess;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Random r = new Random();
    int n = r.nextInt(100)+1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void guess(View view) {
        EditText ednumber = (EditText) findViewById(R.id.edNumber);
        int guess = Integer.parseInt(ednumber.getText().toString());
        if (guess == n) {
            new AlertDialog.Builder(this)
                    .setMessage("correct")
                    .setPositiveButton("ok", null)
                    .show();
        }
        if (guess > n) {
            new AlertDialog.Builder(this)
                    .setMessage("大一點")
                    .setPositiveButton("OK", null)
                    .show();
        }
        if (guess < n) {
            new AlertDialog.Builder(this)
                    .setMessage("小一點")
                    .setPositiveButton("OK", null)
                    .show();
        }
        
    }
}

