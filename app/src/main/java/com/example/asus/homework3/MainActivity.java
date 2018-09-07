package com.example.asus.homework3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void activityB(View v){
    Intent i = new Intent(this, Main2Activity.class);
            switch (v.getId()) {
            case R.id.rockButton:
                i.putExtra("select", "rock");
                break;
            case R.id.paperButton:
                i.putExtra("select", "paper");
                break;
            case R.id.scissorsButton:
                i.putExtra("select", "scissors");
                break;
        }
        startActivity(i);
    }
}
