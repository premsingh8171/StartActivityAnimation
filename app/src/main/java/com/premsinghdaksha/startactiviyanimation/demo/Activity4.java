package com.premsinghdaksha.startactiviyanimation.demo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.premsinghdaksha.startactivityanimationlibrary.AppUtils;
import com.premsinghdaksha.startactiviyanimation.R;

public class Activity4 extends AppCompatActivity {
    private ImageView backMain;
    private Button Clickme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);
        backMain = findViewById(R.id.backMain4);
        Clickme = findViewById(R.id.Clickme4);

        backMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppUtils.finishActivityLeftToRight(Activity4.this);

            }
        });

        Clickme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity4.this, MainActivity.class);
                AppUtils.startActivityRightToLeft(Activity4.this, intent);
            }
        });
    }
}