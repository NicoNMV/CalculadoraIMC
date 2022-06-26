package com.example.imc_calculadora;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText edit1, edit2;

    TextView result;

    RadioGroup Masculino, Feminino;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit1 = findViewById(R.id.Numero1);

        edit2 = findViewById(R.id.Numero2);

        result = findViewById(R.id.Result);
    }

    public void Calcula(View v) {
        int peso = Integer.parseInt(edit1.getText().toString());

        double altura = Double.parseDouble(edit2.getText().toString());

        double r = peso / (altura * altura);


        int M = Masculino.getCheckedRadioButtonId();
        switch (M) {
            case R.id.radioButton:
                if (r < 20) {
                    result.setText(r + ". Abaixo do Normal");
                }
                else if (r < 25) {
                    result.setText(r + ". Normal");
                }
                else if (r < 30) {
                    result.setText(r + ". Obesidade Leve");
                }
                else if (r < 40) {
                    result.setText(r + ". Obesidade Moderada");
                }
                else {
                    result.setText(r + ". Obesidade Mórbida");
                }
                break;
        }
        int F = Feminino.getCheckedRadioButtonId();
        switch (F) {
            case R.id.radioButton2:
                if (r < 19) {
                    result.setText(r + ". Abaixo do Normal");
                }
                else if (r < 24) {
                    result.setText(r + ". Normal");
                }
                else if (r < 29) {
                    result.setText(r + ". Obesidade Leve");
                }
                else if (r < 39) {
                    result.setText(r + ". Obesidade Moderada");
                }
                else {
                    result.setText(r + ". Obesidade Mórbida");
                }
                break;
        }
    }
}