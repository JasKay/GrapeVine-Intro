package com.example.grapevine_intro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DefineValues extends AppCompatActivity {

    private Button definevaluemovebutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_define_values);

        definevaluemovebutton = (Button)findViewById(R.id.definevaluemovebutton);
        definevaluemovebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDiscover();
            }
        });
    }

    public void openDiscover(){
        Intent intent = new Intent(this, discover.class);
        startActivity(intent);
    }
}