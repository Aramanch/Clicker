package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mainTxt;
    private Button main_btn;
    private Button main_btn_2;

    private long score = 0;
    private TextView mainText;
    private Button mainBtn;
    private Button mainBtnn;
    private Button mainBtn_r;
    private ImageView mainImage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainText = (TextView) findViewById(R.id.mainTxt);
        mainBtn = (Button) findViewById(R.id.main_btn);
        mainBtnn = (Button) findViewById(R.id.main_btn_2);
        mainBtn_r = (Button) findViewById(R.id.main_btn_3);
        mainImage = (ImageView) findViewById(R.id.mainImag);


        View.OnClickListener clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                score ++;

                String s = "Кликов: " + score;

                mainText.setText(s.toCharArray(),0, s.length());


            }
        };

        View.OnClickListener clickListenerTwo = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                score --;

                String s = "Кликов: " + score;

                mainText.setText(s.toCharArray(),0, s.length());


            }
        };

        View.OnClickListener clickListenerThree = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                score = 0;

                String s = "Кликов: " + score;

                mainText.setText(s.toCharArray(),0, s.length());


            }
        };







        mainBtn.setOnClickListener(clickListener);
        mainBtnn.setOnClickListener(clickListenerTwo);
        mainBtn_r.setOnClickListener(clickListenerThree);
        mainImage.setOnClickListener(clickListenerThree);

    }


}