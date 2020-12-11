package com.premsinghdaksha.startactiviyanimation.demo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.premsinghdaksha.startactivityanimationlibrary.AppUtils;
import com.premsinghdaksha.startactiviyanimation.R;

public class MainActivity extends AppCompatActivity {
    private ImageView backMain;
    private Button Clickme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Clickme = findViewById(R.id.Clickme);
        backMain = findViewById(R.id.backMain);

        Clickme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity2.class);
                AppUtils.startActivityRightToLeft(MainActivity.this, intent);

            }
        });
        backMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppUtils.finishActivityLeftToRight(MainActivity.this);

            }
        });

    }
}