package com.example.calculadorageometrica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button b_quadrado = findViewById(R.id.buttonQuadrado);
        Button b_triangulo = findViewById(R.id.buttonTriangulo);
        Button b_trapezio = findViewById(R.id.buttonTrapezio);
        Button b_losango = findViewById(R.id.buttonLosango);
        Button b_retangulo = findViewById(R.id.buttonRetangulo);
        Button b_circulo = findViewById(R.id.buttonCirculo);

        b_quadrado.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
               Intent intent_q = new Intent(MainActivity.this, quadrado.class);
               startActivity(intent_q);

            }
        });

        b_triangulo.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent_q = new Intent(MainActivity.this, triangulo.class);
                startActivity(intent_q);

            }
        });

        b_trapezio.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent_q = new Intent(MainActivity.this, trapezio.class);
                startActivity(intent_q);

            }
        });

        b_losango.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent_q = new Intent(MainActivity.this, losango.class);
                startActivity(intent_q);

            }
        });

        b_retangulo.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent_q = new Intent(MainActivity.this, retangulo.class);
                startActivity(intent_q);

            }
        });

        b_circulo.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent_q = new Intent(MainActivity.this, circulo.class);
                startActivity(intent_q);

            }
        });

    }
}





