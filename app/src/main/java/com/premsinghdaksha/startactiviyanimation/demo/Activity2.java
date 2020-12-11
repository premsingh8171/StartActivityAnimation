package com.premsinghdaksha.startactiviyanimation.demo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.premsinghdaksha.startactivityanimationlibrary.AppUtils;
import com.premsinghdaksha.startactiviyanimation.R;

public class Activity2 extends AppCompatActivity {
    private ImageView backMain;
    private Button Clickme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        backMain = findViewById(R.id.backMain2);
        Clickme = findViewById(R.id.Clickme2);
        backMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppUtils.finishActivityLeftToRight(Activity2.this);
            }
        });
        Clickme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity2.this, Activity3.class);
                AppUtils.startActivityRightToLeft(Activity2.this, intent);
            }
        });
    }
}