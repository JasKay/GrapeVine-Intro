package com.example.grapevine_intro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class create extends AppCompatActivity {

    private Button goToDefine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);

        goToDefine = (Button) findViewById(R.id.gotoDefine);
        goToDefine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDefineValues();
            }
        });
    }

    public void openDefineValues(){
        Intent intentCreateAccount = new Intent(this, DefineValues.class);
        startActivity(intentCreateAccount);
    }
}

