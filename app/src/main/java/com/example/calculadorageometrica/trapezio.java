package com.example.calculadorageometrica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class trapezio extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trapezio);


        EditText baseMaior = findViewById(R.id.editTextTextBaseMaior);
        EditText baseMenor = findViewById(R.id.editTextTextBaseMenor);
        EditText altura = findViewById(R.id.editTextTextAltura2);
        Button calc = findViewById(R.id.button3);
        TextView res = findViewById(R.id.textViewResultado3);
        Button b_voltar = findViewById(R.id.buttonVoltar5);

        calc.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                double basMenor = Double.parseDouble(baseMenor.getText().toString());
                double basMaior = Double.parseDouble(baseMaior.getText().toString());
                double alt = Double.parseDouble(altura.getText().toString());
                double area = ((basMaior + basMenor) * alt) / 2;
                res.setText("Área do Trapézio = " + area);

            }
        });

        b_voltar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent_q = new Intent(trapezio.this, MainActivity.class);
                startActivity(intent_q);

            }
        });

    }
}