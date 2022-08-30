package com.example.calculadorageometrica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class retangulo extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retangulo);

        EditText base = findViewById(R.id.editTextTextBaseRet);
        EditText altura = findViewById(R.id.editTextTextAlturaRet);
        Button calc = findViewById(R.id.button5);
        TextView res = findViewById(R.id.textViewResultado5);
        Button b_voltar = findViewById(R.id.buttonVoltar4);

        calc.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                double bas = Double.parseDouble(base.getText().toString());
                double alt = Double.parseDouble(altura.getText().toString());
                double area = bas * alt;
                res.setText("Área do Retângulo = " + area);

            }
        });
        b_voltar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent_q = new Intent(retangulo.this, MainActivity.class);
                startActivity(intent_q);

            }
        });


    }
}