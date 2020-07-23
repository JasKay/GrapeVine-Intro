package com.example.grapevine_intro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class beginpage extends AppCompatActivity {

    private Button gotoProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beginpage);


        gotoProfile = (Button) findViewById(R.id.gotoProfile);
        gotoProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openBegin();
            }
        });
    }
    public void openBegin(){
        Intent intent = new Intent(this, profilepage.class);
        startActivity(intent);
    }
}




