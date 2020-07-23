package com.example.grapevine_intro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class discover extends AppCompatActivity {

    private Button discoverbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discover);

        discoverbutton = (Button) findViewById(R.id.discoverexpandbutton);
        discoverbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSignUp();
            }
        });
    }

    public void openSignUp(){
        Intent intent = new Intent(this, signup.class);
        startActivity(intent);
    }
}





