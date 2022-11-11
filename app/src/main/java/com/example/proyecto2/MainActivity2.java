package com.example.proyecto2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
TextView tvEmail;
Button btnVolver;
ImageView imgFoto;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tvEmail = findViewById(R.id.tvEmail);
        btnVolver = findViewById(R.id.btnVolver);
        Bundle extra = getIntent().getExtras();
        tvEmail.setText(extra.getString("email"));
        imgFoto = findViewById(R.id.imgFoto);
        btnVolver.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent2);
            }
        });



    }
}