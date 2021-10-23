package com.example.a184041g;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    LinearLayout mainLayout;
    Button buttonGenerate;
    EditText edit_Red, edit_Blue, edit_Green;
    int red=0;
    int blue=0;
    int green=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainLayout = findViewById(R.id.main_layout);
        buttonGenerate = findViewById(R.id.btn_generate);
        edit_Red = findViewById(R.id.et_redvalue);
        edit_Blue = findViewById(R.id.et_bluevalue);
        edit_Green = findViewById(R.id.et_greenvalue);

        buttonGenerate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                red= Integer.parseInt(edit_Red.getText().toString());
                blue= Integer.parseInt(edit_Blue.getText().toString());
                green= Integer.parseInt(edit_Green.getText().toString());

                mainLayout.setBackgroundColor(Color.rgb(red,green,blue));

                if(red<0 || red > 255 || blue <0|| blue>255 || green<0 || green >255){
                    Toast.makeText(MainActivity.this, "You Entered value is invalid", Toast.LENGTH_SHORT).show();
                    return;
                }

            }
        });
    }
}