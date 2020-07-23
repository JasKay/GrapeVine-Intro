package com.example.grapevine_intro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class profilepage extends AppCompatActivity {

    private Button gotoHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profilepage);

        gotoHome = (Button) findViewById(R.id.gotoHome);
        gotoHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openBegin();
            }
        });
    }
    public void openBegin(){
        Intent intent = new Intent(this, homepage.class);
        startActivity(intent);
    }
}

