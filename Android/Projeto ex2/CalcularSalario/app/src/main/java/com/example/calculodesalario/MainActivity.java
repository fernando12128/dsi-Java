package com.example.calculodesalario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.app.Activity;
import android.widget.*;
import android.view.*;
import android.app.*;

public class MainActivity extends AppCompatActivity {

    RadioGroup rgopcoes;
    Button btcalcular;
    EditText edsalario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edsalario = (EditText) findViewById(R.id.edsalario);
        rgopcoes = (RadioGroup) findViewById(R.id.rgopcoes);
        btcalcular = (Button) findViewById(R.id.btcalcular);
        btcalcular.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View arg0) {
                double salario = Double.parseDouble
                        (edsalario.getText().toString());
                int op = rgopcoes.getCheckedRadioButtonId();

                double novosalario;

                if (op == R.id.rb40)
                    novosalario = salario + (salario * 0.4);
                else if (op == R.id.rb45)
                    novosalario = salario + (salario * 0.45);
                else
                    novosalario = salario + (salario * 0.5);
                AlertDialog.Builder dialogo = new
                        AlertDialog.Builder(MainActivity.this);
                dialogo.setTitle("Novo salário");
                dialogo.setMessage("Seu novo salário é : R$"
                        + String.valueOf(novosalario));
                dialogo.setNeutralButton("OK", null);

                dialogo.show();
            }
        });
    }

}
