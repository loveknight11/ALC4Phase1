package com.example.alc4phase1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Note that the Toolbar defined in the layout has the id "my_toolbar"
        setSupportActionBar((Toolbar) findViewById(R.id.my_toolbar));

        Button buttonAbout = findViewById(R.id.btn_about);
        buttonAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,AboutActivity.class));
            }
        });

        Button buttonProfile = findViewById(R.id.btn_profile);
        buttonProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,ProfileActivity.class));
            }
        });

        Typeface font = Typeface.createFromAsset(getAssets(),  "metamorphous.ttf");
        buttonAbout.setTypeface(font);
        buttonProfile.setTypeface(font);
    }
}
