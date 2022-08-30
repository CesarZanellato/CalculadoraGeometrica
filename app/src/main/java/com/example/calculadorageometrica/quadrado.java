package com.example.calculadorageometrica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class quadrado extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quadrado);

        EditText lado = findViewById(R.id.editTextTextPersonName);
        Button calc = findViewById(R.id.button);
        TextView res = findViewById(R.id.textViewResultado);
        Button b_voltar = findViewById(R.id.buttonVoltar3);

        calc.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                double lad = Double.parseDouble(lado.getText().toString());
                double area = lad * lad;
                res.setText("Área do quadrado = " + area);

            }
        });
        b_voltar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent_q = new Intent(quadrado.this, MainActivity.class);
                startActivity(intent_q);

            }
        });


    }
}