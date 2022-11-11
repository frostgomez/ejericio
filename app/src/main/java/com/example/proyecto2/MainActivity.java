package com.example.proyecto2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

Button Login;
EditText Correo;
EditText Contrasena;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       Correo = findViewById(R.id.etCorreo);
       Contrasena = findViewById(R.id.etContrasena);
       Login = findViewById(R.id.btnLogin);


        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             //   Campo1.setText(Titulo.getText());

            //
            //    Campo1.setText("");

                String capContrasena = Contrasena.getText().toString();
                String capCorreo = Correo.getText().toString();
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("email", capCorreo);
                intent.putExtra("password" , capContrasena);

                startActivity(intent);



            }
        });



    }
}