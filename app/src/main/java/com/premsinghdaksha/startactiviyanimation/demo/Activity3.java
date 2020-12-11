package com.premsinghdaksha.startactiviyanimation.demo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.premsinghdaksha.startactivityanimationlibrary.AppUtils;
import com.premsinghdaksha.startactiviyanimation.R;

public class Activity3 extends AppCompatActivity {
    private ImageView backMain;
    private Button Clickme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        backMain = findViewById(R.id.backMain3);
        Clickme = findViewById(R.id.Clickme3);
        backMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppUtils.finishActivityLeftToRight(Activity3.this);


            }
        });

        Clickme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity3.this, Activity4.class);
                AppUtils.startActivityRightToLeft(Activity3.this, intent);
            }
        });
    }
}