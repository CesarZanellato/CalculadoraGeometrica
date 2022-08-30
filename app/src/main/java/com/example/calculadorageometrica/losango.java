package com.example.calculadorageometrica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class losango extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_losango);


        EditText diagonalMaior = findViewById(R.id.editTextTextDiagonalMaior);
        EditText diagonalMenor = findViewById(R.id.editTextTextDiagonalMenor);
        Button calc = findViewById(R.id.button4);
        TextView res = findViewById(R.id.textViewResultado4);
        Button b_voltar = findViewById(R.id.buttonVoltar2);

        calc.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                double diagMenor = Double.parseDouble(diagonalMenor.getText().toString());
                double diagMaior = Double.parseDouble(diagonalMaior.getText().toString());
                double area = (diagMaior * diagMenor) / 2;
                res.setText("Área do Losango = " + area);

            }
        });
        b_voltar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent_q = new Intent(losango.this, MainActivity.class);
                startActivity(intent_q);

            }
        });

    }
}