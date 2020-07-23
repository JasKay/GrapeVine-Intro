package com.example.grapevine_intro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Restaurants extends AppCompatActivity {

    private Button gotoTakeAction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);

        gotoTakeAction = (Button) findViewById(R.id.gotoTakeAction);
        gotoTakeAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openChooseValues();
            }
        });
    }
    public void openChooseValues(){
        Intent intentCreateAccount = new Intent(this, takeactionpage.class);
        startActivity(intentCreateAccount);
    }
}