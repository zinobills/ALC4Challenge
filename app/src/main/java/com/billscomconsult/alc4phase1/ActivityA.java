package com.billscomconsult.alc4phase1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityA extends AppCompatActivity {

    private Button btnAboutAlc;
    private Button btnMyProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAboutAlc = findViewById(R.id.btnAlc);
        btnMyProfile = findViewById(R.id.btnMyProfile);

        btnAboutAlc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAboutAlc();
            }
        });

        btnMyProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMyProfile();
            }
        });
    }


    private void openAboutAlc() {
        Intent AboutAlcIntent = new Intent(this, ActivityB.class);
        startActivity(AboutAlcIntent);
    }

    private void openMyProfile() {
        Intent profileIntent = new Intent(this, ActivityC.class);
        startActivity(profileIntent);
    }
}
