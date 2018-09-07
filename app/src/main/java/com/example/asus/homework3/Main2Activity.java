package com.example.asus.homework3;

import android.os.Bundle;
import android.app.Activity;
import android.widget.ImageView;

import java.util.Random;

public class Main2Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        String newString = "";
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            newString = extras.getString("select");
        }
        ImageView imgUser = (ImageView) findViewById(R.id.imageUser);
        switch (newString) {
            case "rock":
                imgUser.setImageResource(R.drawable.rock);
                break;
            case "paper":
                imgUser.setImageResource(R.drawable.paper);
                break;
            case "scissors":
                imgUser.setImageResource(R.drawable.scissors);
                break;
        }

        Random rand = new Random();
        int n = rand.nextInt(2);
        ImageView imgCom = (ImageView) findViewById(R.id.imageCom);
        switch (n) {
            case 0:
                imgCom.setImageResource(R.drawable.rock);
                break;
            case 1:
                imgCom.setImageResource(R.drawable.paper);
                break;
            case 2:
                imgCom.setImageResource(R.drawable.scissors);
                break;
        }

    }


}
