package com.example.indah.layouting;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {
    //membuat variable
    Button btScroll, btLinear, btRelative, btFrame, btConstrain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        //inisialisasi variable sesuai id
        btScroll = findViewById(R.id.btnScroll);
        btLinear = findViewById(R.id.btnLinear);
        btRelative = findViewById(R.id.btnRelative);
        btFrame = findViewById(R.id.btnFrame);
        btConstrain = findViewById(R.id.btnConstrain);

        //event handling
        btScroll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MenuActivity.this,"Ini Toast", Toast.LENGTH_SHORT).show();
                Intent a = new Intent(MenuActivity.this, ScrollView.class);
                startActivity(a);
            }
        });

        btLinear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MenuActivity.this,"Ini Toast", Toast.LENGTH_SHORT).show();
                Intent b = new Intent(MenuActivity.this, LinearLayout.class);
                startActivity(b);
            }
        });

        btRelative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MenuActivity.this,"Ini Toast", Toast.LENGTH_SHORT).show();
                Intent c = new Intent(MenuActivity.this, RelativeLayout.class);
                startActivity(c);
            }
        });

        btFrame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MenuActivity.this,"Ini Toast", Toast.LENGTH_SHORT).show();
                Intent d = new Intent(MenuActivity.this, FrameLayout.class);
                startActivity(d);
            }
        });

        btConstrain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MenuActivity.this,"Ini Toast", Toast.LENGTH_SHORT).show();
                Intent e = new Intent(MenuActivity.this, ConstrainLayout.class);
                startActivity(e);
            }
        });
    }
}
