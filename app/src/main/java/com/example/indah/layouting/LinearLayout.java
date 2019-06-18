package com.example.indah.layouting;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class LinearLayout extends AppCompatActivity {
    Button btKembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout);

        btKembali = findViewById(R.id.btnKembali);

        btKembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder pesan = new AlertDialog.Builder(LinearLayout.this);
                pesan.setTitle("Alert Dialog");
                pesan.setMessage("Yakin Ingin Kembali?");
                pesan.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(LinearLayout.this,"Success", Toast.LENGTH_SHORT).show();
                        Intent i = new Intent(LinearLayout.this, MenuActivity.class);
                        startActivity(i);
                    }
                });
                pesan.setNegativeButton("No",null);
                pesan.show();
            }
        });
    }
}
