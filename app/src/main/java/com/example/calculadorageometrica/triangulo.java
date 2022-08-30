package com.example.calculadorageometrica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class triangulo extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangulo);


        EditText base = findViewById(R.id.editTextTextBase);
        EditText altura = findViewById(R.id.editTextTextAltura);
        Button calc = findViewById(R.id.button2);
        TextView res = findViewById(R.id.textViewResultado2);
        Button b_voltar = findViewById(R.id.buttonVoltar6);

        calc.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                double bas = Double.parseDouble(base.getText().toString());
                double alt = Double.parseDouble(altura.getText().toString());
                double area = (bas * alt) / 2;
                res.setText("Área do Triângulo = " + area);

            }
        });

        b_voltar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent_q = new Intent(triangulo.this, MainActivity.class);
                startActivity(intent_q);

            }
        });

    }
}