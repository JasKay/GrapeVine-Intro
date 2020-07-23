package com.example.grapevine_intro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

public class Purchasing_Power extends AppCompatActivity {

    private Button getstartedbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_purchasing__power);

        getstartedbutton = (Button) findViewById(R.id.getstartedbutton);
        getstartedbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCreateAccount();
            }
        });
    }

    public void openCreateAccount(){
        Intent intentCreateAccount = new Intent(this, create.class);
        startActivity(intentCreateAccount);
    }
}






