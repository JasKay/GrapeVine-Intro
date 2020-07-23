package com.example.grapevine_intro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class signup extends AppCompatActivity {

    private Button signedupbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        signedupbutton = (Button) findViewById(R.id.signedupbutton);
        signedupbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openChooseValues();
            }
        });
    }
        public void openChooseValues(){
            Intent intentCreateAccount = new Intent(this, choosevalue.class);
            startActivity(intentCreateAccount);
        }
    }






