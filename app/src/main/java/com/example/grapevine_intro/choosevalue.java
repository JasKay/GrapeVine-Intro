package com.example.grapevine_intro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class choosevalue extends AppCompatActivity {

    private Button openBegin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choosevalue);


        openBegin = (Button) findViewById(R.id.openBegin);
        openBegin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openBegin();
            }
        });
    }
        public void openBegin(){
            Intent intent = new Intent(this, beginpage.class);
            startActivity(intent);
        }

//        choosevaluebutton = (Button)findViewById(R.id.choosevaluebutton);
//        choosevaluebutton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                openBeginPage();
//            }
//        });
//    }
//
//    public void openBeginPage(){
//        Intent intent = new Intent(this, beginpage.class);
//        startActivity(intent);
//    }
}
