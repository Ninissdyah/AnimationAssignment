package com.example.animationassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    MyCanvass myCanvass;
    Button left, right, up, down;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myCanvass = (MyCanvass)findViewById(R.id.myview);
        left = findViewById(R.id.left);
        right = findViewById(R.id.right);
        up = findViewById(R.id.up);
        down = findViewById(R.id.down);

        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myCanvass.check = true;
                myCanvass.left =true;
                myCanvass.right = false;
                myCanvass.up = false;
                myCanvass.down = false;
                myCanvass.invalidate();
            }
        });

        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myCanvass.check = true;
                myCanvass.left = false;
                myCanvass.right = true;
                myCanvass.up = false;
                myCanvass.down = false;
                myCanvass.invalidate();
            }
        });

        up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myCanvass.check = true;
                myCanvass.left = false;
                myCanvass.right = false;
                myCanvass.up = true;
                myCanvass.down = false;
                myCanvass.invalidate();
            }
        });

        down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myCanvass.check = true;
                myCanvass.left = false;
                myCanvass.right = false;
                myCanvass.up = false;
                myCanvass.down = true;
                myCanvass.invalidate();
            }
        });

    }
}