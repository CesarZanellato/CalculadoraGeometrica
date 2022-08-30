package com.example.calculadorageometrica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class circulo extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circulo);

        EditText raio = findViewById(R.id.editTextTextRaio);
        Button calc = findViewById(R.id.button6);
        TextView res = findViewById(R.id.textViewResultado6);
        Button b_voltar = findViewById(R.id.buttonVoltar);

        calc.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                double ra = Double.parseDouble(raio.getText().toString());
                double pi = 3.1415;
                double area = (ra * ra) * pi;
                res.setText("Área do Círculo = " + area);

            }
        });
        b_voltar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent_q = new Intent(circulo.this, MainActivity.class);
                startActivity(intent_q);

            }
        });

    }
}