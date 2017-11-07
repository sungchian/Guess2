package com.fju.guess;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    int n =

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void guess(View view){
        EditText number = (EditText) findViewById(R.id.editText);
        int guess = Integer.parseInt(number.getText().toString());
        if(guess<n){
            new Aler
        }
    }


}
